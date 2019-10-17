package com.ketanbd.moviecatalogservice.com.ketanbd.resources;

import com.ketanbd.moviecatalogservice.com.ketanbd.model.Movie;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/moviecatalog")
public class moviecatalogservice {

    @RequestMapping("/{userID}")
    public List<Movie> getMovieCatalog(@PathVariable("userID") String userID) {
        List<Movie> movieList = new ArrayList<Movie>();
        movieList.add(new Movie("Matrix", 9, 1995, Arrays.asList("SciFi", "Action", "Thriller")));
        return movieList;
    }
}

