package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ManagerMovieEditViewController {

    @FXML
    private TextField aTitleTextField;

    @FXML
    private TextField aGenreTextField;

    private Movie aMovie;

    public void setMovie(Movie pMovie) {
        this.aMovie = pMovie;
        if (pMovie != null) {
            this.aTitleTextField.setText(pMovie.getMovieName());
            this.aGenreTextField.setText(pMovie.getGenre());
        }
    }

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

    @FXML
    protected void backButtonClick(ActionEvent pEvent) {
        Stage currentStage = (Stage) this.aTitleTextField.getScene().getWindow();
        currentStage.close();
    }
}
