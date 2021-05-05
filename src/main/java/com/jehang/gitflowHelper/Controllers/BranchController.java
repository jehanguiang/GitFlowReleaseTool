package com.jehang.gitflowHelper.Controllers;

import com.jehang.gitflowHelper.Components.Branch;
import com.jehang.gitflowHelper.Components.Commit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BranchController {

    //http://localhost:8080/getUniqueCommits?workspace=jehanguiang&repo=shopsystem_ui&masterBranch=master&developBranch=develop&prefix=SUI
    @GetMapping("/getUniqueCommits")
    public List<String> getUniqueCommits(@RequestParam String workspace,
                                         @RequestParam String repo,
                                         @RequestParam String masterBranch,
                                         @RequestParam String developBranch,
                                         @RequestParam String prefix) {
        Commit commit = new Commit(workspace, repo, masterBranch, developBranch, prefix);
        return commit.getUniqueCommits();
    }

    //http://localhost:8080/GetBranches?workspace=jehanguiang&repo=shopsystem_ui
    @GetMapping("/GetBranches")
    public List<String> getBranches(@RequestParam String workspace,
                                    @RequestParam String repo) {
        Branch branch = new Branch(workspace, repo);
        return branch.getBranches();
    }
}
