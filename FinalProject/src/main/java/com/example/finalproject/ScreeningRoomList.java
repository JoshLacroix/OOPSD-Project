package com.example.finalproject;

import java.util.LinkedList;
import java.util.List;

public class ScreeningRoomList {
    private List<ScreeningRoom> screenRooms = new LinkedList<ScreeningRoom>();

    public ScreeningRoomList(){
        this.screenRooms.add(new ScreeningRoom(1, 80));
        this.screenRooms.add(new ScreeningRoom(2, 65));
        this.screenRooms.add(new ScreeningRoom(3, 55));
    }

    public boolean addScreenRoom(ScreeningRoom pScreenRoom) {
        return this.screenRooms.add(pScreenRoom);
    }
}
