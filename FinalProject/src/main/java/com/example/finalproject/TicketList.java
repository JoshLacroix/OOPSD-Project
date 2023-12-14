package com.example.finalproject;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * collection of tickets stored in a list
 */
public class TicketList {
    /**
     * list of tickets
     */
    private List<Ticket> aTicket = new LinkedList<Ticket>();
    /**
     * Singleton instance of ticketlist class
     */
    private static TicketList instance;
    /**
     * Constructs a new list with default samples
     */
    public TicketList(){
        this.aTicket.add(new Ticket("501", "Dry Paint", LocalDateTime.of(2023, 12, 6, 9,30,0,0)));
        this.aTicket.add(new Ticket("502", "Fast and Furious 55", LocalDateTime.of(2023, 12, 7, 6,0,0,0)));
        this.aTicket.add(new Ticket("503", "Dry Paint", LocalDateTime.of(2023, 12, 6, 6,30,0,0)));
    }
    /**
     * Returns a singleton instance of the TicketList class.
     * If the instance does not exist, a new instance is created.
     * @return The TicketList instance.
     */
    public static TicketList getInstance(){
        if (instance == null) {
            instance = new TicketList();
        }
        return instance;
    }

    /**
     * Returns a list of all movie names.
     * @return List of movie name strings.
     */
    public List<String> getAllMovieTitles() {
        LinkedList<String> result = new LinkedList<>();
        for (Ticket ticket : aTicket) {
            result.add(ticket.toString());
        }
        return result;
    }

}
