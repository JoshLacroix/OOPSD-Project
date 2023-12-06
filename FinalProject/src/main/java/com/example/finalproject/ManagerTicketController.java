package com.example.finalproject;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class ManagerTicketController {
    /**
     * ListView holding the list of tickets bought to be displayed.
     */
    @FXML
    private ListView<String> aListView;

    private static TicketList instance;

    /**
     * Ticketlist holding the actual tickets.
     */
    private TicketList ticketList;

    public static TicketList getInstance(){
        if (instance == null) {
            instance = new TicketList();
        }
        return instance;
    }

    /**
     * Constructor setting the ticket list to be displayed.
     */
    public ManagerTicketController() {
        this.ticketList = TicketList.getInstance();
    }
}
