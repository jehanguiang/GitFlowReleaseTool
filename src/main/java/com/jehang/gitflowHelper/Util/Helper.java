package com.jehang.gitflowHelper.Util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import com.jehang.gitflowHelper.Model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class Helper {
    private static final Logger log = LoggerFactory.getLogger(Helper.class);
    ObjectMapper objectMapper = new ObjectMapper();

    Helper() {
        getUniqueCommits();
    }

    private String trimCommitMessages(String message) {
        return message.substring(message.indexOf("SSUI")+1).replace("\n", "");
    }

    private boolean isUniformed(String commit) {
        if (commit.contains("SUI")) {
            return true;
        }
        return false;
    }

    public List<String> getCommits(String branch) {
        List<RepositoryValues> repositoryValues = new ArrayList<>();
        List<String> commits = new ArrayList<>();

        HttpClient httpClient = HttpClientBuilder.create().build();
        try {
            log.info("Getting commits from: {}", branch);
            HttpGet request = new HttpGet("https://api.bitbucket.org/2.0/repositories/jehanguiang/shopsystem_ui/commits/" + branch);
            request.addHeader("content-type", "application/x-www-form-urlencoded");
            HttpResponse response = httpClient.execute(request);
            RepositoryInfo repositoryInfo = objectMapper.readValue(response.getEntity().getContent(), RepositoryInfo.class);
            repositoryValues = repositoryInfo.getValues();
        } catch (Exception ex) {
            log.error("ERROR: {ex}", ex);
        }

        for (RepositoryValues values: repositoryValues
        ) {
            String commit = trimCommitMessages(values.getRendered().getMessage().getRaw());
            if (isUniformed(commit)) {
                commits.add(commit);
            }
        }

        return commits;
    }

    public void getUniqueCommits() {
        List<String> commitsFromDevelop = getCommits("develop");
        List<String> commitsFromMaster = getCommits("master");

        log.info("getting commits");
        log.info(String.valueOf(commitsFromMaster));
        for (String commit: commitsFromMaster
        ) {
            log.info(commit);
        }

        log.info("Size of Master: " + commitsFromMaster.size());
        log.info("Size of Develop: " + commitsFromDevelop.size());

        List<String> differences = commitsFromDevelop.stream()
                .filter(commit -> !commitsFromMaster.contains(commit))
                .collect(Collectors.toList());

        log.info("Difference: ");
        for (String commit: differences
        ) {
            log.info(commit);
        }
    }
}
