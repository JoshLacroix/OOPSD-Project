package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

/**
 * controller for Manager-ClientView.fxml
 */
public class ManagerClientController {
    /**
     * ListView to display the list of clients.
     */
    @FXML
    private ListView<String> aListView;

    /**
     * PersonList holding the actual clients.
     */
    private static PersonList personList;
    /**
     * Constructor setting the person list to be displayed.
     */
    public ManagerClientController(){
        this.personList = PersonList.getInstance();
    }
    /**
     * Loading the list for the first time after setting up.
     */
    public void initialize() {
        this.updateList();
    }
    /**
     * Loading or updating the ListView from person list.
     */
    private void updateList() {
        this.aListView.getItems().setAll(personList.getAllClients());
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
