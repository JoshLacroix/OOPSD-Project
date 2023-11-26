package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginMainController {

    @FXML
    protected void loginButtonClick(ActionEvent pEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LoginMainApplication.class.getResource("Manager-Dashboard.fxml"));
        Parent view = fxmlLoader.load();
        Scene nextScene = new Scene(view, 600, 300);
        Stage nextStage = new Stage();
        nextStage.setScene(nextScene);
        nextStage.setTitle("ZMS");
        nextStage.initModality(Modality.WINDOW_MODAL);
        nextStage.initOwner(((Node) pEvent.getSource()).getScene().getWindow());
        nextStage.showAndWait();
    }
    @FXML
    protected void signUpButtonClick(ActionEvent pEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LoginMainApplication.class.getResource("Client-Dashboard.fxml"));
        Parent view = fxmlLoader.load();
        Scene nextScene = new Scene(view, 500, 300);
        Stage nextStage = new Stage();
        nextStage.setScene(nextScene);
        nextStage.setTitle("ZMS");
        nextStage.initModality(Modality.WINDOW_MODAL);
        nextStage.initOwner(((Node) pEvent.getSource()).getScene().getWindow());
        nextStage.showAndWait();
    }


}