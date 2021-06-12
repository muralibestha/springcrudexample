package com.imdb.controller;

import com.imdb.model.Album;
import com.imdb.service.AlbumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AlbumController {
    @Autowired
    AlbumService service;

    @PostMapping(path="/album")
    public List<Album> create(@RequestBody Album album){
        return  service.create(album);
    }
    @GetMapping(path="/album")
    public List<Album> getAll(@RequestBody Album album){
        return  service.findAll(album);
    }
    @GetMapping(path="/album/{id}")
    public Optional<Album> getById(@PathVariable Long id){
        return  service.findById(id);
    }
    @DeleteMapping(path="/album/{id}")
    public void delById(@PathVariable Long id){
          service.delById(id);
    }
}