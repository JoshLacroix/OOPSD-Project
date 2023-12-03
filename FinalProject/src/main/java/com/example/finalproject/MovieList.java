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

    private static MovieList instance;
    /**
     * Constructs a new list with default samples
     */
    private MovieList(){
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

    public static MovieList getInstance(){
        if (instance == null) {
            instance = new MovieList();
        }
        return instance;
    }

    public List<String> getAllMovieTitles() {
        LinkedList<String> result = new LinkedList<>();
        for (Movie movie : movies) {
            result.add(movie.toString());
        }
        return result;
    }
}
