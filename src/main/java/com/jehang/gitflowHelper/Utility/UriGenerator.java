package com.jehang.gitflowHelper.Utility;

public class UriGenerator {

    //TODO: create Uri Generator using factory pattern
    private final String workspace;
    private final String repo = "";
    private String uri;
    private String prefix = "https://api.bitbucket.org/2.0/";

    public UriGenerator(String workspace) {
        this.workspace =  workspace;
    }

    public UriGenerator withWorkspace(String )

    public UriGenerator withRepo(String repo) {
        this.repo =  repo;
        this.uri += this.repo + "/refs/branches";
        return this;
    }

    public String getUri() {
        return this.uri;
    }



}
