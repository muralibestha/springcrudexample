package com.imdb.service;

import com.imdb.model.Album;
import com.imdb.repo.AlbumRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlbumService {
    @Autowired
    AlbumRepo repo;

    public List<Album> create(Album album){
        repo.save(album);
        return repo.findAll();
    }

    public List<Album> findAll(Album album) {
        return repo.findAll();
    }

    public Optional<Album> findById(Long id) {

        return repo.findById(id);
    }

    public void delById(Long id) {
        repo.deleteById(id);
    }
}
