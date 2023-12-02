package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * Controller for Manager-Movie-EditView.fxml.
 */
public class ManagerMovieEditViewController {

    /**
     * Text field for movie title.
     */
    @FXML
    private TextField aTitleTextField;

    /**
     * Text field for movie genre.
     */
    @FXML
    private TextField aGenreTextField;

    /**
     * Movie to be edited, if any.
     */
    private Movie aMovie;

    /**
     * Set movie to be edited. Can be set to null to add new movie.
     * @param pMovie Movie to be edited, adding new if null.
     */
    public void setMovie(Movie pMovie) {
        this.aMovie = pMovie;
        if (pMovie != null) {
            this.aTitleTextField.setText(pMovie.getMovieName());
            this.aGenreTextField.setText(pMovie.getGenre());
        }
    }

    /**
     * Executed on save button click. Saves changes or new movie depending.
     * @param pEvent Triggered event. Not used, but necessary for JavaFX.
     */
    @FXML
    protected void saveButtonClick(ActionEvent pEvent) {
        MovieList list = MovieList.getInstance();
        if (this.aMovie == null) {
            // if the movie is new
            Movie newMovie = new Movie(this.aTitleTextField.getText(), this.aGenreTextField.getText());
            list.addMovie(newMovie);
        } else {
            // if the movie is edited
            this.aMovie.setMovieName(this.aTitleTextField.getText());
            this.aMovie.setGenre(this.aGenreTextField.getText());
        }
        backButtonClick(pEvent);
    }

    /**
     * Executed on back button click. Going back without saving.
     * @param pEvent Triggered event. Not used, but necessary for JavaFX.
     */
    @FXML
    protected void backButtonClick(ActionEvent pEvent) {
        Stage currentStage = (Stage) this.aTitleTextField.getScene().getWindow();
        currentStage.close();
    }
}
