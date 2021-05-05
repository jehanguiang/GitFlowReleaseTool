package com.jehang.gitflowHelper.Util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import com.jehang.gitflowHelper.Model.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


@Component
public class Helper {
    private static final Logger log = LoggerFactory.getLogger(Helper.class);
    private final ObjectMapper objectMapper = new ObjectMapper();
    private String workspace, repo, masterBranch, developBranch, prefix;

    public Helper() {}

    public Helper(String workspace, String repo, String masterBranch, String developBranch, String prefix) {
        this.workspace = workspace;
        this.repo = repo;
        this.masterBranch = masterBranch;
        this.developBranch = developBranch;
        this.prefix = prefix;
    }

    public List<String> getCommits(String branch) {
        List<RepositoryValues> repositoryValues = new ArrayList<>();
        List<String> commits = new ArrayList<>();

        try {
            HttpClient httpClient = HttpClientBuilder.create().build();
            StringBuilder uri = generateUri(branch);
            HttpResponse response = requestCommits(branch, httpClient, uri);
            RepositoryInfo repositoryInfo = objectMapper.readValue(response.getEntity().getContent(), RepositoryInfo.class);
            repositoryValues = repositoryInfo.getValues();
        } catch (Exception ex) {
            log.error("ERROR: {ex}", ex);
        }

        trimCommits(repositoryValues, commits);

        return commits;
    }

    public List<String> getUniqueCommits() {
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

        return differences;
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

    private HttpResponse requestCommits(String branch, HttpClient httpClient, StringBuilder uri) throws IOException {
        log.info("Getting commits from: {}", branch);
        HttpGet request = new HttpGet(uri.toString());
        request.addHeader("content-type", "application/x-www-form-urlencoded");
        return httpClient.execute(request);
    }

    private void trimCommits(List<RepositoryValues> repositoryValues, List<String> commits) {
        for (RepositoryValues values: repositoryValues
        ) {
            String commit = trimCommitMessages(values.getRendered().getMessage().getRaw());
            if (isUniformed(commit)) {
                commits.add(commit);
            }
        }
    }

    private StringBuilder generateUri(String branch) {
        StringBuilder uri = new StringBuilder();
        uri.append("https://api.bitbucket.org/2.0/repositories/");
        uri.append(this.workspace);
        uri.append("/");
        uri.append(this.repo);
        uri.append("/commits/");
        uri.append(branch);
        return uri;
    }
}
