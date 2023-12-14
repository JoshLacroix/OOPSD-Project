package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

/**
 * Controller for Manager-Screenroom.fxml
 */
public class ManagerScreenRoomController {
    /**
     * ListView holding the list of screening rooms to be displayed.
     */
    @FXML
    private ListView<String> aListView;
    /**
     * ScreeningRoomList holding the actual screening rooms.
     */
    private ScreeningRoomList screeningRoomList;
    /**
     * Constructor setting the screen room list to be displayed.
     */
    public ManagerScreenRoomController(){
        this.screeningRoomList = ScreeningRoomList.getInstance();
    }
    /**
     * Loading the list for the first time after setting up.
     */
    public void initialize() {
        this.updateList();
    }
    /**
     * Loading or updating the ListView from screening room list.
     */
    private void updateList() {
        this.aListView.getItems().setAll(screeningRoomList.getAllScreeningRooms());
    }
    /**
     * Executed on back button click. Going back without saving.
     * @param pEvent Triggered event. Not used, but necessary for JavaFX.
     */
    @FXML
    public void backButtonCLick(ActionEvent pEvent) {
        Stage currentStage = (Stage) this.aListView.getScene().getWindow();
        currentStage.close();
    }
}
