package com.example.finalproject;

import java.util.Date;

/**
 * represents a single ticket with ticket ID, movie, and show date
 */
public class Ticket {
    /**
     * Variable to hold ticketId
     */
    private String ticketId;
    /**
     * variable to hold movie
     */
    private String movie;
    /**
     * variable to hold show date
     */
    Date showDate = new Date();

    /**
     * constructor for a new ticket with ticket ID, movie,and show date
     * @param ticketId
     * @param movie
     * @param showDate
     */
    public Ticket(String ticketId, String movie, Date showDate){
        this.ticketId = ticketId;
        this.movie = movie;
        this.showDate = showDate;
    }

    /**
     * Get the ticket ID
     * @return ticketId
     */
    public String getTicketId() {
        return ticketId;
    }

    /**
     * Set the ticket ID
     * @param ticketId
     */
    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    /**
     * Get the movie
     * @return movie
     */
    public String getMovie() {
        return movie;
    }

    /**
     * set the movie
     * @param movie
     */
    public void setMovie(String movie) {
        this.movie = movie;
    }


}
