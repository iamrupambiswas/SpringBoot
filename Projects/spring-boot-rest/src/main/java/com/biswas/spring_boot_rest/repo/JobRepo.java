package com.biswas.spring_boot_rest.repo;

import com.biswas.spring_boot_rest.model.JobPost;
import jakarta.persistence.Entity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {





//    public List<JobPost> getAllJobs(){
//        return jobs;
//    }
//
//    public void addJobs(JobPost job){
//        jobs.add(job);
//        System.out.println(jobs);
//    }
//
//    public JobPost getJob(int jobId) {
//        for(JobPost job: jobs) {
//            if(job.getPostId() == jobId) {
//                return job;
//            }
//        }
//
//        return null;
//    }
}
