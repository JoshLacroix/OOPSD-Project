package com.example.finalproject;

import java.util.LinkedList;
import java.util.List;

public class MovieList {
    private List<Movie> movies = new LinkedList<Movie>();

    public MovieList(){
        this.movies.add(new Movie("Dry Paint", "Comedy"));
        this.movies.add(new Movie("Fast and Furious 55", "Action"));
        this.movies.add(new Movie("Cabin in the Woods 2", "Horror"));
    }

    public boolean addMovie(Movie pMovie) {
        return this.movies.add(pMovie);
    }
}
