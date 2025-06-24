package com.biswas.JobApp.repo;

import com.biswas.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {

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



    public List<JobPost> getAllJobs(){
        return jobs;
    }

    public void addJobs(JobPost job){
        jobs.add(job);
        System.out.println(jobs);
    }

}
