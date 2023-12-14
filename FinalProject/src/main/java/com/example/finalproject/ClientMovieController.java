package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class ClientMovieController {
    /**
     * ListView holding the list of show times to be displayed.
     */
    @FXML
    private ListView<String> aListView;

    /**
     * MovieList holding the actual show times.
     */
    private ShowTimeList showTimeList;
    /**
     * Constructor setting the showtime list to be displayed.
     */
    public ClientMovieController() {
        this.showTimeList = ShowTimeList.getInstance();
    }

    /**
     * Loading the list for the first time after setting up.
     */
    public void initialize() {
        this.updateList();
    }
    /**
     * Loading or updating the ListView from showtime list.
     */
    public void updateList() {
        this.aListView.getItems().setAll(showTimeList.getAllShowTimes());
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
    @FXML
    protected void buyTicketButtonClick(ActionEvent pEvent) {
        String selectedShowTime = aListView.getSelectionModel().getSelectedItem();
        if (selectedShowTime != null){
            Alert alert = new Alert(Alert.AlertType.INFORMATION, "You now own a ticket for this movie.");
            alert.show();
        }
        else {
            Alert alert = new Alert(Alert.AlertType.WARNING, "Please select a show time first.");
            alert.showAndWait();
        }
    }
}
