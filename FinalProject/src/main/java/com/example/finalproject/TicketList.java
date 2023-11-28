package com.example.finalproject;

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
    private List<Ticket> tickets = new LinkedList<Ticket>();

    /**
     * Constructs a new list with default samples
     */
    public TicketList(){
        this.tickets.add(new Ticket("501", "Dry Paint", new Date()));
        this.tickets.add(new Ticket("502", "Fast and Furious 55", new Date()));
        this.tickets.add(new Ticket("503", "Dry Paint", new Date()));
    }

    /**
     * adds a ticket to the list
     * @param pTicket
     * @return
     */
    public boolean addTicket(Ticket pTicket){
        return this.tickets.add(pTicket);
    }
}
