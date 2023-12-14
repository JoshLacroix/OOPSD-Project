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
    /**
     * Singleton instance of the ScreeningRoomList class.
     */
    private static ScreeningRoomList instance;
    /**
     * Constructs a new list with default samples
     */
    private ScreeningRoomList(){
        this.aScreenRooms.add(new ScreeningRoom(1, 80));
        this.aScreenRooms.add(new ScreeningRoom(2, 65));
        this.aScreenRooms.add(new ScreeningRoom(3, 55));
    }
    /**
     * Returns a singleton instance of the ScreeningRoomList class.
     * If the instance does not exist, a new instance is created.
     * @return The ScreeningRoomList instance.
     */
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

    /**
     * Retrieves a list of screening rooms with their information.
     * @return A LinkedList of strings containing screening room information.
     */
    public LinkedList<String> getAllScreeningRooms() {
        LinkedList<String> result = new LinkedList<>();
        for (ScreeningRoom screeningRoom :  aScreenRooms) {
            result.add(screeningRoom.toString());
        }
        return result;
    }
}
