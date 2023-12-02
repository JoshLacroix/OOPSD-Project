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

public class ManagerMovieController {

    @FXML
    private ListView<String> aListView;

    private MovieList movieList;

    public ManagerMovieController() {
        this.movieList = MovieList.getInstance();
    }

    public void initialize() {
        this.updateList();
    }

    public void updateList() {
        this.aListView.getItems().setAll(movieList.getAllMovieTitles());
    }

    public void launchMovieDetailViewFor(ActionEvent pEvent, Movie pMovie) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(LoginMainApplication.class.getResource("Manager-Movie-EditView.fxml"));
        Parent view = fxmlLoader.load();
        ManagerMovieEditViewController controller = fxmlLoader.getController();
        controller.setMovie(pMovie);
        Scene nextScene = new Scene(view, 300, 300);
        Stage nextStage = new Stage();
        nextStage.setScene(nextScene);
        nextStage.setTitle("Movie Details");
        nextStage.initModality(Modality.WINDOW_MODAL);
        nextStage.initOwner(((Node) pEvent.getSource()).getScene().getWindow());
        nextStage.showAndWait();
    }

    @FXML
    protected void addButtonClick(ActionEvent pEvent) throws IOException {
        launchMovieDetailViewFor(pEvent, null);
        updateList();
    }

    @FXML
    protected void editButtonClick(ActionEvent pEvent) throws IOException {
        int selectedId = this.aListView.getSelectionModel().getSelectedIndex();
        if (selectedId < 0) {
            Alert alert = new Alert(Alert.AlertType.ERROR, "Select a movie!");
            alert.showAndWait();
        } else {
            Movie selectedMovie = this.movieList.getMovieAt(selectedId);
            launchMovieDetailViewFor(pEvent, selectedMovie);
            updateList();
        }
    }

    @FXML
    protected void deleteButtonClick(ActionEvent pEvent) throws IOException {
        int selectedId = this.aListView.getSelectionModel().getSelectedIndex();
        this.movieList.deleteMovieAt(selectedId);
        this.updateList();
    }

    @FXML
    protected void backButtonClick(ActionEvent pEvent) {
        Stage currentStage = (Stage) this.aListView.getScene().getWindow();
        currentStage.close();
    }
}
