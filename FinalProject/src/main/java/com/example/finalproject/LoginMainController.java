package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginMainController {
    @FXML
    private TextField logInEmailTextfield;
    @FXML
    private TextField logInPasswordTextfield;
    PersonList people = new PersonList();

    @FXML
    protected void loginButtonClick(ActionEvent pEvent) throws IOException {
        Person currentUser = people.checkCredentials(logInEmailTextfield.getText(), logInPasswordTextfield.getText());
        if (currentUser == null){
            System.out.println("Wrong!");
        } else if (currentUser instanceof Manager){
            FXMLLoader fxmlLoader = new FXMLLoader(LoginMainApplication.class.getResource("Manager-Dashboard.fxml"));
            Parent view = fxmlLoader.load();
            Scene nextScene = new Scene(view, 600, 300);
            Stage nextStage = new Stage();
            nextStage.setScene(nextScene);
            nextStage.setTitle("ZMS");
            nextStage.initModality(Modality.WINDOW_MODAL);
            nextStage.initOwner(((Node) pEvent.getSource()).getScene().getWindow());
            nextStage.showAndWait();
        } else if (currentUser instanceof Client) {
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