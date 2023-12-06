package com.example.finalproject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;

/**
 * represents a single showtime with number of tickets sold, movie, screening room, and date of showing
 */
public class ShowTime {
    /**
     * variable to hold number of tickets
     */
    private int numOfTickets;
    /**
     * variable to hold movie
     */
    private String movie;
    /**
     * variable to hold screening room
     */
    private int screeningRoom;
    /**
     * variable to hold date of showtime
     */
    private LocalDateTime showDate;

    /**
     * constructor for a new showtime with movie, number of tickets, screening room, and showtime
     * @param movie
     * @param numOfTickets
     * @param screeningRoom
     * @param showDate
     */
    public ShowTime(String movie, int numOfTickets, int screeningRoom, LocalDateTime showDate) {
        this.movie = movie;
        this.numOfTickets = numOfTickets;
        this.screeningRoom = screeningRoom;
        this.showDate = showDate;
    }

    /**
     * Get the number of tickets
     * @return numOfTickets
     */
    public int getNumOfTickets() {
        return numOfTickets;
    }

    /**
     * Set the number of tickets
     * @param numOfTickets
     */
    public void setNumOfTickets(int numOfTickets) {
        this.numOfTickets = numOfTickets;
    }

    /**
     * Get the movie
     * @return movie
     */
    public String getMovie() {
        return movie;
    }

    /**
     * Set the movie
     * @param movie
     */
    public void setMovie(String movie) {
        this.movie = movie;
    }

    /**
     * Get the screening room
     *
     * @return screeningRoom
     */
    public int getScreeningRoom() {
        return screeningRoom;
    }

    /**
     * Set the screening room
     * @param screeningRoom
     */
    public void setScreeningRoom(int screeningRoom) {
        this.screeningRoom = screeningRoom;
    }

    /**
     * Get the date and time of show
     */
    public LocalDateTime getShowDate(){ return showDate;}
    /**
     * Set the date and time
     */
    public void setShowDate(LocalDateTime showDate) {this.showDate = showDate;}
    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.getMovie() + " shown in room " + this.getScreeningRoom() + " at " + DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(this.showDate) +
                " " + getNumOfTickets() + " tickets remain";
    }
}
