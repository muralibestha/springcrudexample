package com.imdb.service;

import com.imdb.model.Movie;
import com.imdb.repo.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieRepo repo;

    public List<Movie> newMovie(Movie movie){
        repo.save(movie);
        return repo.findAll();
    }
}
