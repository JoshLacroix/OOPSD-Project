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
 * Controller for clients page once signed in or signed up
 */
public class ClientDashBoardController {
    /**
     * button to log out
     */
    @FXML
    public Button logOutButton;

    /**
     * Screen thats displays what movies are being shown in the theatre once the button is pressed
     * @param pEvent
     * @throws IOException
     */
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

    /**
     * Screen that displays the clients information once the button is clicked
     * @param pEvent
     * @throws IOException
     */
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

    /**
     * A log out button event the returns client to login page
     */
    @FXML
    protected void backButtonClick(){
        Stage currentStage = (Stage) logOutButton.getScene().getWindow();
        currentStage.close();
    }
}
