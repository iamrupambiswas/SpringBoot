package com.biswas.JobApp.service;

import com.biswas.JobApp.model.JobPost;
import com.biswas.JobApp.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void AddJob(JobPost jobPost) {
        repo.addJobs(jobPost);
    }

    public List<JobPost> getAllJobs() {
        return repo.getAllJobs();
    }

}
