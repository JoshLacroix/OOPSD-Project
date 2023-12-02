package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
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

    @FXML
    protected void addButtonClick(ActionEvent pEvent) throws IOException {
        // TODO add new movies
    }

    @FXML
    protected void editButtonClick(ActionEvent pEvent) throws IOException {
        // TODO edit selected movie
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
