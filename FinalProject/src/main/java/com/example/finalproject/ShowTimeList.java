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
    private List<ShowTime> aShowTimes = new LinkedList<ShowTime>();

    private static ShowTimeList instance;
    /**
     * Constructs a new list with default samples
     */
    public ShowTimeList(){
        this.aShowTimes.add(new ShowTime("Dry paint", 67, 1, new Date()));
        this.aShowTimes.add(new ShowTime("Fast and Furious 55", 55, 2, new Date()));
        this.aShowTimes.add(new ShowTime("Cabin in the Woods 2", 39, 3, new Date()));
    }

    public static ShowTimeList getInstance(){
        if (instance == null) {
            instance = new ShowTimeList();
        }
        return instance;
    }


    /**
     * adds a show time to the list
     * @param pShowTime
     * @return
     */
    public boolean addShowTime(ShowTime pShowTime) {
        return this.aShowTimes.add(pShowTime);
    }

    public LinkedList<String> getAllShowTimes() {
        LinkedList<String> result = new LinkedList<>();
        for (ShowTime showTime : aShowTimes) {
            result.add(showTime.toString());
        }
        return result;
    }
}
