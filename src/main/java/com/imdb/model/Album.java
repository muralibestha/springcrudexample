package com.imdb.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Date;

@Data
@Entity
public class Album {
    @Id
    @GeneratedValue
    private Long albumId;
    private String sortTitle;
    private String language;
    @JsonFormat(shape= JsonFormat.Shape.STRING, pattern="dd-MM-yyyy")
    private Date releaseDate;
}
