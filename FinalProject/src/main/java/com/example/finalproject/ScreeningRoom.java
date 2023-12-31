package com.example.finalproject;

/**
 * represents a single screening room with the room number and amount of seats
 */
public class ScreeningRoom {
    /**
     * variable to hold room number
     */
    private int roomNumber;
    /**
     * variable to hold number of seats
     */
    private int numOfSeats;

    /**
     * constructor for a new screening room with room number and number of seats
     * @param roomNumber
     * @param numOfSeats
     */
    public ScreeningRoom(int roomNumber, int numOfSeats) {
        this.roomNumber = roomNumber;
        this.numOfSeats = numOfSeats;
    }

    /**
     * get the room number
     * @return roomNumber
     */
    public int getRoomNumber() {
        return roomNumber;
    }

    /**
     * get the number of seats
     * @return numOfSeats
     */
    public int getNumOfSeats() {
        return numOfSeats;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String toString() {
        return "Room " + this.getRoomNumber() + " (" + this.getNumOfSeats() + " seats left)";
    }
}
