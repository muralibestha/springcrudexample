package com.imdb.repo;

import com.imdb.model.Album;
import com.imdb.model.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AlbumRepo extends CrudRepository<Album, Long> {

    @Override
    List<Album> findAll();

    Album findByAlbumId(Long id);
}
