package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class ManagerClientController {
    @FXML
    private ListView<String> aListView;

    private static PersonList personList;

    public ManagerClientController(){
        this.personList = PersonList.getInstance();
    }

    public void initialize() {
        this.updateList();
    }

    private void updateList() {
        this.aListView.getItems().setAll(personList.getAllScreeningRooms());
    }

    @FXML
    public void backButtonCLick(ActionEvent actionEvent) {
        Stage currentStage = (Stage) this.aListView.getScene().getWindow();
        currentStage.close();
    }
}
