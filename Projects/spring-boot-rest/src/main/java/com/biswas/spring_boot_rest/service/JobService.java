package com.biswas.spring_boot_rest.service;

import com.biswas.spring_boot_rest.model.JobPost;
import com.biswas.spring_boot_rest.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class JobService {

    @Autowired
    private JobRepo repo;

    public void AddJob(JobPost jobPost) {
        repo.save(jobPost);
    }

    public List<JobPost> getAllJobs() {
        return repo.findAll();
    }

    public JobPost getJob(int jobId) {
        return repo.findById(jobId).orElse(new JobPost());
    }

    public String load() {
        List<JobPost> jobs = new ArrayList<>(Arrays.asList(
                new JobPost(1, "FullStack Developer", "Must have a degree", 2,
                        Arrays.asList("Java", "Spring Boot", "React", "MySQL")),

                new JobPost(2, "Frontend Developer", "Work on UI using modern frameworks", 1,
                        Arrays.asList("React", "TypeScript", "TailwindCSS")),

                new JobPost(3, "Backend Developer", "API development and integration", 3,
                        Arrays.asList("Java", "Spring Boot", "Hibernate", "PostgreSQL")),

                new JobPost(4, "DevOps Engineer", "CI/CD pipeline setup and monitoring", 2,
                        Arrays.asList("Docker", "Kubernetes", "Jenkins", "AWS"))
        ));

        repo.saveAll(jobs);
        return "Success";
    }
}
