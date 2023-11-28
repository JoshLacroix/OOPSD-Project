package com.example.finalproject;

public class ScreeningRoom {
    private int roomNumber;
    private int numOfSeats;

    public ScreeningRoom(int roomNumber, int numOfSeats) {
        this.roomNumber = roomNumber;
        this.numOfSeats = numOfSeats;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumOfSeats() {
        return numOfSeats;
    }

    public void setNumOfSeats(int numOfSeats) {
        this.numOfSeats = numOfSeats;
    }
}
