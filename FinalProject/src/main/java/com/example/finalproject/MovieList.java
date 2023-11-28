package com.example.finalproject;

import java.util.LinkedList;
import java.util.List;

/**
 * collection of movies stored in a list
 */
public class MovieList {
    /**
     * List of movies
     */
    private List<Movie> movies = new LinkedList<Movie>();

    /**
     * Constructs a new list with default samples
     */
    public MovieList(){
        this.movies.add(new Movie("Dry Paint", "Comedy"));
        this.movies.add(new Movie("Fast and Furious 55", "Action"));
        this.movies.add(new Movie("Cabin in the Woods 2", "Horror"));
    }

    /**
     * Adds a new movie to the movie list
     * @param pMovie
     * @return
     */
    public boolean addMovie(Movie pMovie) {
        return this.movies.add(pMovie);
    }
}
