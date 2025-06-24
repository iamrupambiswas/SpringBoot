package com.biswas.spring_boot_rest;

import com.biswas.spring_boot_rest.model.JobPost;
import com.biswas.spring_boot_rest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class JobRestController {

    @Autowired
    private JobService service;


    @GetMapping(path = "jobPosts", produces = "application/json")
    public List<JobPost> getAllJobs() {
        return service.getAllJobs();
    }

    @GetMapping("jobPost/{jobId}")
    public JobPost getJob(@PathVariable("jobId") int jobId) {
        return service.getJob(jobId);
    }

    @PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost jobPost) {
        service.AddJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @GetMapping("load")
    public String load() {
        return service.load();
    }

}
