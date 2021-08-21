package com.jehang.gitflowHelper.Controllers;

import com.jehang.gitflowHelper.Components.Branch;
import com.jehang.gitflowHelper.Components.Commit;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RepoController {

    @GetMapping("/getRepos")
    public Object getRepos(@RequestParam String workspace) {
        return null;
    }

}
