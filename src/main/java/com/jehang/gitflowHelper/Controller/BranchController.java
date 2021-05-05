package com.jehang.gitflowHelper.Controller;

import com.jehang.gitflowHelper.Util.Helper;
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
        Helper helper = new Helper(workspace, repo, masterBranch, developBranch, prefix);
        return helper.getUniqueCommits();
    }
}
