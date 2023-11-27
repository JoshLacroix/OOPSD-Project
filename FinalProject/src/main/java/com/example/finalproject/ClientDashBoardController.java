package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class ClientDashBoardController {
    @FXML
    public Button logOutButton;
    @FXML
    protected void movieViewButtonClick(ActionEvent pEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LoginMainApplication.class.getResource("Client-Movie.fxml"));
        Parent view = fxmlLoader.load();
        Scene nextScene = new Scene(view, 600, 400);
        Stage nextStage = new Stage();
        nextStage.setScene(nextScene);
        nextStage.setTitle("Client");
        nextStage.initModality(Modality.WINDOW_MODAL);
        nextStage.initOwner(((Node) pEvent.getSource()).getScene().getWindow());
        nextStage.showAndWait();
    }
    @FXML
    protected void clientInfoButtonClick(ActionEvent pEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LoginMainApplication.class.getResource("Client-Info.fxml"));
        Parent view = fxmlLoader.load();
        Scene nextScene = new Scene(view, 600, 400);
        Stage nextStage = new Stage();
        nextStage.setScene(nextScene);
        nextStage.setTitle("Client");
        nextStage.initModality(Modality.WINDOW_MODAL);
        nextStage.initOwner(((Node) pEvent.getSource()).getScene().getWindow());
        nextStage.showAndWait();
    }
    @FXML
    protected void backButtonClick(){
        Stage currentStage = (Stage) logOutButton.getScene().getWindow();
        currentStage.close();
    }
}
