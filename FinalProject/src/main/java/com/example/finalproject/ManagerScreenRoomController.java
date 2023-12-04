package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

public class ManagerScreenRoomController {
    @FXML
    private ListView<String> aListView;

    private ScreeningRoomList screeningRoomList;

    public ManagerScreenRoomController(){
        this.screeningRoomList = ScreeningRoomList.getInstance();
    }

    public void initialize() {
        this.updateList();
    }

    private void updateList() {
        this.aListView.getItems().setAll(screeningRoomList.getAllScreeningRooms());
    }

    @FXML
    public void backButtonCLick(ActionEvent actionEvent) {
        Stage currentStage = (Stage) this.aListView.getScene().getWindow();
        currentStage.close();
    }
}
