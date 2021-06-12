package com.imdb.controller;

import com.imdb.model.Movie;
import com.imdb.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class MovieController {
    @Autowired
    MovieService movieService;

    @Autowired
    protected DataSource dataSource;

    @PostMapping(path="new",produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
    public List<Movie> insert(@RequestBody Movie movie){

        return movieService.newMovie(movie);
    }


    @GetMapping(path="allTables")
    public List<String> showTables() throws Exception {
        List<String> tableNames= new ArrayList<>();
        DatabaseMetaData metaData = dataSource.getConnection().getMetaData();
        ResultSet tables = metaData.getTables(null, null, null, new String[] { "TABLE" });
        while (tables.next()) {
            String tableName=tables.getString("TABLE_NAME");
            System.out.println(tableName);
            tableNames.add(tableName);
            ResultSet columns = metaData.getColumns(null,  null,  tableName, "%");
            while (columns.next()) {
                String columnName=columns.getString("COLUMN_NAME");
                System.out.println("\t" + columnName);
            }
        }
        return tableNames;
    }
}
