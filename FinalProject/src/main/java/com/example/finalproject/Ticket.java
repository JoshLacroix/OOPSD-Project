package com.example.finalproject;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
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
    private LocalDateTime showDate ;

    /**
     * constructor for a new ticket with ticket ID, movie,and show date
     * @param ticketId
     * @param movie
     * @param showDate
     */
    public Ticket(String ticketId, String movie, LocalDateTime showDate){
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

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return this.getTicketId() + ", " + this.getMovie() + " at " + DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).format(this.showDate);
    }
}
