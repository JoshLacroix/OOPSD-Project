package com.example.finalproject;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
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
    /**
     * Singleton instance of ticketlist class
     */
    private static ShowTimeList instance;
    /**
     * Constructs a new list with default samples
     */
    public ShowTimeList(){
        this.aShowTimes.add(new ShowTime("Dry paint", 67, 1, LocalDateTime.of(2023, 12, 6, 9,30,0,0)));
        this.aShowTimes.add(new ShowTime("Fast and Furious 55", 55, 2,LocalDateTime.of(2023, 12, 6, 6,0,0,0)));
        this.aShowTimes.add(new ShowTime("Cabin in the Woods 2", 39, 3, LocalDateTime.of(2023, 12, 6, 6,30,0,0)));
    }
    /**
     * Returns a singleton instance of the ShowTimeList class.
     * If the instance does not exist, a new instance is created.
     * @return The ShowTimeList instance.
     */
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

    public void deleteShowTimeAt(int selectedId) {
        if (this.aShowTimes.get(selectedId) != null) {
            this.aShowTimes.remove(selectedId);
        }
    }

    public ShowTime getShowTimeAt(int selectedId) {
        if (selectedId < 0 || selectedId >= this.aShowTimes.size()) {
            throw new IndexOutOfBoundsException("This movie cannot be selected!");
        }
        return this.aShowTimes.get(selectedId);
    }
}
