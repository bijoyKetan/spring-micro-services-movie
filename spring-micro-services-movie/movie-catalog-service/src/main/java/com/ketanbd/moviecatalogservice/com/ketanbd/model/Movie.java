package com.ketanbd.moviecatalogservice.com.ketanbd.model;

import java.util.List;

public class Movie {

    private String moviename;
    private float rating;
    private int releaseYear;
    private List<String> tags;

    //Constructor
    public Movie(String moviename, float rating, int releaseYear, List<String> tags) {
        this.moviename = moviename;
        this.rating = rating;
        this.releaseYear = releaseYear;
        this.tags = tags;
    }

    //Getters

    public String getMoviename() {
        return moviename;
    }

    public float getRating() {
        return rating;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public List<String> getTags() {
        return tags;
    }

    //Setters
    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }
}
