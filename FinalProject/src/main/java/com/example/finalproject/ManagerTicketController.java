package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class ManagerTicketController {
    /**
     * ListView holding the list of tickets bought to be displayed.
     */
    @FXML
    private ListView<String> aListView;

    private static TicketList instance;

    /**
     * Loading the list for the first time after setting up.
     */
    public void initialize() {
        this.updateList();
    }

    /**
     * Loading or updating the ListView from movie list.
     */
    public void updateList() {
        this.aListView.getItems().setAll(ticketList.getAllMovieTitles());
    }

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

    /**
     * Executed on back button click. Going back without saving.
     * @param pEvent Triggered event. Not used, but necessary for JavaFX.
     */
    @FXML
    protected void backButtonClick(ActionEvent pEvent) {
        Stage currentStage = (Stage) this.aListView.getScene().getWindow();
        currentStage.close();
    }
}
