package com.jehang.gitflowHelper.Utility;

public class Util {

    private StringBuilder generateUri( String workspace, String repo) {
        StringBuilder uri = new StringBuilder();
        uri.append("https://api.bitbucket.org/2.0/repositories/");
        uri.append(workspace);
        uri.append("/");
        uri.append(repo);
        uri.append("/refs/branches");
        return uri;
    }
}
