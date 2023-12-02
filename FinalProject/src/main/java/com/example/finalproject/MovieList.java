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
    private final List<Movie> aMovies = new LinkedList<Movie>();

    private static MovieList instance;
    /**
     * Constructs a new list with default samples
     */
    private MovieList(){
        this.aMovies.add(new Movie("Dry Paint", "Comedy"));
        this.aMovies.add(new Movie("Fast and Furious 55", "Action"));
        this.aMovies.add(new Movie("Cabin in the Woods 2", "Horror"));
    }

    /**
     * Adds a new movie to the movie list
     * @param pMovie
     */
    public void addMovie(Movie pMovie) {
        this.aMovies.add(pMovie);
    }

    public static MovieList getInstance(){
        if (instance == null) {
            instance = new MovieList();
        }
        return instance;
    }

    public List<String> getAllMovieTitles() {
        LinkedList<String> result = new LinkedList<>();
        for (Movie movie : aMovies) {
            result.add(movie.toString());
        }
        return result;
    }

    public void deleteMovieAt(int selectedId) {
        if (this.aMovies.get(selectedId) != null) {
            this.aMovies.remove(selectedId);
        }
    }

    public Movie getMovieAt(int selectedId) {
        if (selectedId < 0 || selectedId >= this.aMovies.size()) {
            throw new IndexOutOfBoundsException("This movie cannot be selected!");
        }
        return this.aMovies.get(selectedId);
    }
}
