package com.example.finalproject;

import java.util.Date;

public class ShowTime {
    private int numOfTickets;
    private String movie;
    private int screeningRoom;
    Date showDate = new Date();

    public ShowTime(String movie, int numOfTickets, int screeningRoom, Date showDate) {
        this.movie = movie;
        this.numOfTickets = numOfTickets;
        this.screeningRoom = screeningRoom;
        this.showDate = showDate;
    }

    public int getNumOfTickets() {
        return numOfTickets;
    }

    public void setNumOfTickets(int numOfTickets) {
        this.numOfTickets = numOfTickets;
    }

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public int getScreeningRoom() {
        return screeningRoom;
    }

    public void setScreeningRoom(int screeningRoom) {
        this.screeningRoom = screeningRoom;
    }
}
