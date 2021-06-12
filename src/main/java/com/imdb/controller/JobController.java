package com.imdb.controller;

import com.imdb.model.Job;
import com.imdb.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class JobController {
    @Autowired
    JobService service;

    @PostMapping(path="/job")
    public List<Job> getjobs(@RequestBody Job job){
       return  service.getJobs(job);
    }
}
