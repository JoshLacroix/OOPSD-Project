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

/**
 * Controller for manager page once signed in
 */
public class ManagerDashBoardController {
    /**
     * button for logging out
     */
    public Button logOutButton;

    /**
     * Displays the movies that may be edited from the manager
     * to change movie information
     * @param pEvent
     * @throws IOException
     */
    @FXML
    protected void movieEditButtonClick(ActionEvent pEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LoginMainApplication.class.getResource("Manager-Movie.fxml"));
        Parent view = fxmlLoader.load();
        Scene nextScene = new Scene(view, 600, 400);
        Stage nextStage = new Stage();
        nextStage.setScene(nextScene);
        nextStage.setTitle("Manager");
        nextStage.initModality(Modality.WINDOW_MODAL);
        nextStage.initOwner(((Node) pEvent.getSource()).getScene().getWindow());
        nextStage.showAndWait();
    }

    /**
     * Displays the screening rooms that can be edited by the manager
     * to change screening room information
     * @param pEvent
     * @throws IOException
     */
    @FXML
    protected void screenRoomEditButtonClick(ActionEvent pEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LoginMainApplication.class.getResource("Manager-Screenroom.fxml"));
        Parent view = fxmlLoader.load();
        Scene nextScene = new Scene(view, 600, 400);
        Stage nextStage = new Stage();
        nextStage.setScene(nextScene);
        nextStage.setTitle("Manager");
        nextStage.initModality(Modality.WINDOW_MODAL);
        nextStage.initOwner(((Node) pEvent.getSource()).getScene().getWindow());
        nextStage.showAndWait();
    }

    /**
     * Displays the show times that can be edited by the manager
     * to change show time information
     * @param pEvent
     * @throws IOException
     */
    @FXML
    protected void showTimeEditButtonClick(ActionEvent pEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LoginMainApplication.class.getResource("Manager-Showtime.fxml"));
        Parent view = fxmlLoader.load();
        Scene nextScene = new Scene(view, 600, 500);
        Stage nextStage = new Stage();
        nextStage.setScene(nextScene);
        nextStage.setTitle("Manager");
        nextStage.initModality(Modality.WINDOW_MODAL);
        nextStage.initOwner(((Node) pEvent.getSource()).getScene().getWindow());
        nextStage.showAndWait();
    }

    @FXML
    protected void clientViewButtonClick(ActionEvent pEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LoginMainApplication.class.getResource("Manager-ClientView.fxml"));
        Parent view = fxmlLoader.load();
        Scene nextScene = new Scene(view, 600, 400);
        Stage nextStage = new Stage();
        nextStage.setScene(nextScene);
        nextStage.setTitle("Manager");
        nextStage.initModality(Modality.WINDOW_MODAL);
        nextStage.initOwner(((Node) pEvent.getSource()).getScene().getWindow());
        nextStage.showAndWait();
    }
    @FXML
    protected void ticketViewButtonClick(ActionEvent pEvent) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LoginMainApplication.class.getResource("Manager-Tickets.fxml"));
        Parent view = fxmlLoader.load();
        Scene nextScene = new Scene(view, 600, 400);
        Stage nextStage = new Stage();
        nextStage.setScene(nextScene);
        nextStage.setTitle("Manager");
        nextStage.initModality(Modality.WINDOW_MODAL);
        nextStage.initOwner(((Node) pEvent.getSource()).getScene().getWindow());
        nextStage.showAndWait();
    }

    /**
     * Button event that logs the manager out of the account
     */
    @FXML
    protected void backButtonClick(){
        Stage currentStage = (Stage) logOutButton.getScene().getWindow();
        currentStage.close();
    }
}
