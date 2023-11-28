package com.example.finalproject;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Collection of show time stored in a list
 */
public class ShowTimeList {
    /**
     * list of showtimes
     */
    private List<ShowTime> showTimes = new LinkedList<ShowTime>();

    /**
     * Constructs a new list with default samples
     */
    public ShowTimeList(){
        this.showTimes.add(new ShowTime("Dry paint", 67, 1, new Date()));
        this.showTimes.add(new ShowTime("Fast and Furious 55", 55, 2, new Date()));
        this.showTimes.add(new ShowTime("Cabin in the Woods 2", 39, 3, new Date()));
    }

    /**
     * adds a show time to the list
     * @param pShowTime
     * @return
     */
    public boolean addShowTime(ShowTime pShowTime) {
        return this.showTimes.add(pShowTime);
    }

}
