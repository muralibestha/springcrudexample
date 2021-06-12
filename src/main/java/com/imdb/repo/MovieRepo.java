package com.imdb.repo;

import com.imdb.model.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepo extends CrudRepository<Movie, Long> {

    @Override
    List<Movie> findAll();
}
