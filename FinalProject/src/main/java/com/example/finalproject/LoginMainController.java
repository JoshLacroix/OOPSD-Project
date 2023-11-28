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

/**
 * Controller that displays the next screen depending on what user is signing in
 */
public class LoginMainController {
    /**
     * textfield for email input
     */
    @FXML
    private TextField logInEmailTextfield;
    /**
     * textfield for password input
     */
    @FXML
    private TextField logInPasswordTextfield;
    /**
     * list of users in the system
     */
    PersonList people = new PersonList();

    /**
     * Handles the log in button event while validating user input.
     * If its a client, the client dashboard is displayed,
     * if it is a manager, the manager dashboard is displayed
     * @param pEvent
     * @throws IOException
     */
    @FXML
    protected void loginButtonClick(ActionEvent pEvent) throws IOException {
        /**
         * check user input for validation
         */
        Person currentUser = people.checkCredentials(logInEmailTextfield.getText(), logInPasswordTextfield.getText());
        if (currentUser == null){
            System.out.println("Wrong!");
        } else if (currentUser instanceof Manager){
            /**
             * opens manager dashboard
             */
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
            /**
             * opens client dashboard
             */
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

    /**
     * Handles the sign-in button event, which will always open client
     * as clients are the only one that can sign up
     * @implNote Managers will already have their account created for them
     * @param pEvent
     * @throws IOException
     */
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