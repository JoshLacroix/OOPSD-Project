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

/**
 * Controller for Manager-Movie.fxml
 */
public class ManagerMovieController {

    /**
     * ListView holding the list of movie names to be displayed.
     */
    @FXML
    private ListView<String> aListView;

    /**
     * MovieList holding the actual movies.
     */
    private MovieList movieList;

    /**
     * Constructor setting the movie list to be displayed.
     */
    public ManagerMovieController() {
        this.movieList = MovieList.getInstance();
    }

    /**
     * Loading the list for the first time after setting up.
     */
    public void initialize() {
        this.updateList();
    }

    /**
     * Loading or updating the ListView from movie list.
     */
    public void updateList() {
        this.aListView.getItems().setAll(movieList.getAllMovieTitles());
    }

    /**
     * Launch new window for given movie.
     *
     * @param pEvent Triggered event. Not used, but necessary for JavaFX.
     * @param pMovie Movie to be edited, null if new.
     * @throws IOException Thrown if loading xml fails.
     */
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

    /**
     * Executed on add button click opens new movie details view and updates after save.
     * @param pEvent Triggered event. Not used, but necessary for JavaFX.
     * @throws IOException Thrown if loading xml fails.
     */
    @FXML
    protected void addButtonClick(ActionEvent pEvent) throws IOException {
        launchMovieDetailViewFor(pEvent, null);
        updateList();
    }

    /**
     * Executed on edit button click opens edit view for selected movie and updates after save.
     * @param pEvent Triggered event. Not used, but necessary for JavaFX.
     * @throws IOException Thrown if loading xml fails.
     */
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

    /**
     * Executed on delete button click. Deletes selected movie from list and reloads list view.
     * @param pEvent Triggered event. Not used, but necessary for JavaFX.
     */
    @FXML
    protected void deleteButtonClick(ActionEvent pEvent) {
        int selectedId = this.aListView.getSelectionModel().getSelectedIndex();
        this.movieList.deleteMovieAt(selectedId);
        this.updateList();
    }

    /**
     * Executed on back button click. Going back without saving.
     * @param pEvent Triggered event. Not used, but necessary for JavaFX.
     */
    @FXML
    protected void backButtonClick(ActionEvent pEvent) {
        Stage currentStage = (Stage) this.aListView.getScene().getWindow();
        currentStage.close();
    }
}
