package com.imdb.repo;

import com.imdb.model.Job;
import com.imdb.model.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepo extends CrudRepository<Job, Long> {
    @Override
    List<Job> findAll();
}
