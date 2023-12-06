package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ListView;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class ManagerShowTimeController {
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
    public ManagerShowTimeController() {
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



    public void launchShowTimeDetailViewFor(ActionEvent pEvent, ShowTime pShowTime) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LoginMainApplication.class.getResource("Manager-ShowTime-EditView.fxml"));
        Parent view = fxmlLoader.load();
        ManagerShowTimeEditViewController controller = fxmlLoader.getController();
        controller.setShowTime(pShowTime);
        Scene nextScene = new Scene(view, 600, 400);
        Stage nextStage = new Stage();
        nextStage.setScene(nextScene);
        nextStage.setTitle("Showtime Details");
        nextStage.initModality(Modality.WINDOW_MODAL);
        nextStage.initOwner(((Node) pEvent.getSource()).getScene().getWindow());
        nextStage.showAndWait();
    }

    /**
     * Executed on add button click opens new showtime details view and updates after save.
     * @param pEvent Triggered event. Not used, but necessary for JavaFX.
     * @throws IOException Thrown if loading xml fails.
     */
    @FXML
    protected void addButtonClick(ActionEvent pEvent) throws IOException {
        launchShowTimeDetailViewFor(pEvent, null);
        updateList();
    }

    /**
     * Executed on edit button click opens edit view for selected movie and updates after save.
     * @param pEvent Triggered event. Not used, but necessary for JavaFX.
     * @throws IOException Thrown if loading xml fails.
     */
    @FXML
    protected void editButtonClick(ActionEvent pEvent) throws IOException {
        int selectedId = this.aListView.getSelectionModel().getSelectedIndex();
        if (selectedId < 0) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Select a showtime!");
            alert.showAndWait();
        } else {
            ShowTime selectedShowing = this.showTimeList.getShowTimeAt(selectedId);
            launchShowTimeDetailViewFor(pEvent, selectedShowing);
            updateList();
        }
    }

    /**
     * Executed on delete button click. Deletes selected showtime from list and reloads list view.
     * @param pEvent Triggered event. Not used, but necessary for JavaFX.
     */
    @FXML
    protected void deleteButtonClick(ActionEvent pEvent) {
        int selectedId = this.aListView.getSelectionModel().getSelectedIndex();
        this.showTimeList.deleteShowTimeAt(selectedId);
        this.updateList();
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
