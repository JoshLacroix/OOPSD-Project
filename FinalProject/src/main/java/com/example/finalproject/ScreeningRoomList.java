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
    private List<ScreeningRoom> aScreenRooms = new LinkedList<ScreeningRoom>();

    private static ScreeningRoomList instance;
    /**
     * Constructs a new list with default samples
     */
    private ScreeningRoomList(){
        this.aScreenRooms.add(new ScreeningRoom(1, 80));
        this.aScreenRooms.add(new ScreeningRoom(2, 65));
        this.aScreenRooms.add(new ScreeningRoom(3, 55));
    }

    public static ScreeningRoomList getInstance(){
        if (instance == null) {
            instance = new ScreeningRoomList();
        }
        return instance;
    }


    /**
     * Adds a screening room to the list
     * @param pScreenRoom
     * @return
     */
    public boolean addScreenRoom(ScreeningRoom pScreenRoom) {
        return this.aScreenRooms.add(pScreenRoom);
    }

    public LinkedList<String> getAllScreeningRooms() {
        LinkedList<String> result = new LinkedList<>();
        for (ScreeningRoom screeningRoom :  aScreenRooms) {
            result.add(screeningRoom.toString());
        }
        return result;
    }
}
