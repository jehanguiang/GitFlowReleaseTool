package com.jehang.gitflowHelper.Components;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jehang.gitflowHelper.Models.Branches.Branches;
import com.jehang.gitflowHelper.Models.Commits.RepositoryInfo;
import com.jehang.gitflowHelper.Models.Commits.RepositoryValues;
import com.jehang.gitflowHelper.Utility.UriGenerator;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Branch {
    private static final Logger log = LoggerFactory.getLogger(Branch.class);
    private final ObjectMapper objectMapper = new ObjectMapper();
    private String workspace, repo;

    private UriGenerator uriGenerator;

    private Branch() {}

    public Branch(String workspace, String repo) {
        this.workspace = workspace;
        this.repo = repo;

        this.uriGenerator = new UriGenerator(this.workspace).withRepo(this.repo);
    }

    public List<String> getBranches() {
        List<com.jehang.gitflowHelper.Models.Branches.Branch> branchValues = new ArrayList<>();
        List<String> listOfBranches = new ArrayList<>();

        try {
            HttpClient httpClient = HttpClientBuilder.create().build();
            StringBuilder uri = generateUri();
            HttpResponse response = requestBranches(httpClient, uri);
            Branches branches = objectMapper.readValue(response.getEntity().getContent(), Branches.class);
            branchValues = branches.getValues();

            for (com.jehang.gitflowHelper.Models.Branches.Branch branchValue: branchValues) {
                String branch = branchValue.getName();
                listOfBranches.add(branch);
            }

        } catch (Exception ex) {
            log.error("ERROR: {ex}", ex);
        }

        return listOfBranches;
    }

    private HttpResponse requestBranches(HttpClient httpClient, StringBuilder uri) throws IOException {
        log.info("Getting branches from: {}", this.repo);
        HttpGet request = new HttpGet(uri.toString());
        request.addHeader("content-type", "application/x-www-form-urlencoded");
        return httpClient.execute(request);
    }

    private StringBuilder generateUri() {
        StringBuilder uri = new StringBuilder();
        uri.append("https://api.bitbucket.org/2.0/repositories/");
        uri.append(this.workspace);
        uri.append("/");
        uri.append(this.repo);
        uri.append("/refs/branches");
        return uri;
    }
}
