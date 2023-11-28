package com.example.finalproject;

import java.util.LinkedList;
import java.util.List;

/**
 * collection of screening rooms stored in a list
 */
public class ScreeningRoomList {
    /**
     * List of screening rooms
     */
    private List<ScreeningRoom> screenRooms = new LinkedList<ScreeningRoom>();

    /**
     * Constructs a new list with default samples
     */
    public ScreeningRoomList(){
        this.screenRooms.add(new ScreeningRoom(1, 80));
        this.screenRooms.add(new ScreeningRoom(2, 65));
        this.screenRooms.add(new ScreeningRoom(3, 55));
    }

    /**
     * Adds a screening room to the list
     * @param pScreenRoom
     * @return
     */
    public boolean addScreenRoom(ScreeningRoom pScreenRoom) {
        return this.screenRooms.add(pScreenRoom);
    }
}
