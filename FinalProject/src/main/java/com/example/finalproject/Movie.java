package com.example.finalproject;

/**
 * Represents a single movie with the name and genre
 */
public class Movie {
    /**
     * variable to hold movie name
     */
    private String movieName;
    /**
     * variable to hold movie genre
     */
    private String genre;

    /**
     * Constructor for a new movie with name and genre
     * @param movieName
     * @param genre
     */
    public Movie(String movieName, String genre) {
        this.movieName = movieName;
        this.genre = genre;
    }

    /**
     * Gets the name of the movie.
     * @return name
     */
    public String getMovieName() {
        return movieName;
    }

    /**
     * Sets the name of the movie
     * @param movieName
     */
    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    /**
     * Get the genre of the movie
     * @return genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * Set the genre of the movie
     * @param genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return this.getMovieName() + " (" + this.getGenre() + ")";
    }
}
