package com.imdb.service;

import com.imdb.model.Job;
import com.imdb.repo.JobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {
    @Autowired
    JobRepo repo;

    public List<Job> getJobs(Job job){
        repo.save(job);
        return repo.findAll();
    }

}
