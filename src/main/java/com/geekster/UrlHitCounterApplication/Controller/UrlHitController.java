package com.geekster.UrlHitCounterApplication.Controller;

import com.geekster.UrlHitCounterApplication.Entity.UrlHitCounter;
import com.geekster.UrlHitCounterApplication.Service.UrlHitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class UrlHitController {
    @Autowired
    private UrlHitService urlHitService;

    @PostMapping("Visitor")
    public String addVisitor(@RequestBody UrlHitCounter user) {
        return urlHitService.addVisitor(user);
    }

    @GetMapping("Visitors")
    public List<UrlHitCounter> getAllVisitors() {
        return urlHitService.getAllVisitors();
    }

    @GetMapping("visitor/count")
    public String getTheNumberOfVisitors() {
        return urlHitService.getCountOfVisitors();
    }
    @GetMapping("api/v1/visitor-count-app/username/{username}")

    public UrlHitCounter getAVisitor(@PathVariable String username) {
        return urlHitService.getAVisitor(username);
    }
    @PutMapping("api/v1/count_update/username/{username}")
    public String CountUpdate(@PathVariable String username)
    {
        return urlHitService.CountUpdated(username);
    }
}

















