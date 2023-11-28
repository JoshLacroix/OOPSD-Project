package com.example.finalproject;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class ShowTimeList {
    private List<ShowTime> showTimes = new LinkedList<ShowTime>();

    public ShowTimeList(){
        this.showTimes.add(new ShowTime("Dry paint", 67, 1, new Date()));
        this.showTimes.add(new ShowTime("Fast and Furious 55", 55, 2, new Date()));
        this.showTimes.add(new ShowTime("Cabin in the Woods 2", 39, 3, new Date()));
    }

    public boolean addShowTime(ShowTime pShowTime) {
        return this.showTimes.add(pShowTime);
    }

}
