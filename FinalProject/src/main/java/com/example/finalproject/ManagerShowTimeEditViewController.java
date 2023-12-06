package com.example.finalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class ManagerShowTimeEditViewController {
    /**
     * Text field for movie title.
     */
    @FXML
    private TextField aMovieTextField;

    /**
     * Text field for number of tickets
     */
    @FXML
    private TextField aNumOfTicketTextField;

    /**
     * Text field for screening room
     */
    @FXML
    private TextField aScreeningRoomTextField;
    /**
     * Date picker for show date
     */
    @FXML
    private DatePicker aShowDatePicker;

    /**
     * Combo box for showtime for hour
     */
    @FXML
    private ComboBox<Integer> aShowTimeHourComboBox;
    /**
     * Combo box for showtime for minute
     */
    @FXML
    private ComboBox<Integer> aShowTimeMinuteComboBox;

    /**
     * Show time to be edited if any
     */
    private ShowTime aShowTime;

    @FXML
    private void initialize(){
        aShowTimeHourComboBox.getItems().addAll(6, 9);
        aShowTimeMinuteComboBox.getItems().addAll(0, 30);
    }

    /**
     * Set movie to be edited. Can be set to null to add new movie.
     * @param pShowTime Showtime to be edited, adding new if null.
     */
    public void setShowTime(ShowTime pShowTime) {
        this.aShowTime = pShowTime;
        if (pShowTime != null) {
            this.aMovieTextField.setText(pShowTime.getMovie());
            this.aScreeningRoomTextField.setText(Integer.toString(pShowTime.getScreeningRoom()));
            this.aNumOfTicketTextField.setText(Integer.toString(pShowTime.getNumOfTickets()));
            this.aShowDatePicker.setValue(pShowTime.getShowDate().toLocalDate());
            this.aShowTimeHourComboBox.setValue(pShowTime.getShowDate().getHour());
            this.aShowTimeMinuteComboBox.setValue(pShowTime.getShowDate().getMinute());
        }
    }

    /**
     * Executed on save button click. Saves changes or new movie depending.
     * @param pEvent Triggered event. Not used, but necessary for JavaFX.
     */
    @FXML
    protected void saveButtonClick(ActionEvent pEvent) {
        ShowTimeList list = ShowTimeList.getInstance();
        if (this.aShowTime == null) {
            ShowTime newShowTime = new ShowTime(this.aMovieTextField.getText(), Integer.parseInt(this.aScreeningRoomTextField.getText()),
                    Integer.parseInt(this.aNumOfTicketTextField.getText()), this.aShowDatePicker.getValue().atTime(aShowTimeHourComboBox.getValue(),aShowTimeMinuteComboBox.getValue()));
            list.addShowTime(newShowTime);
        } else {
            this.aShowTime.setMovie(this.aMovieTextField.getText());
            this.aShowTime.setScreeningRoom(Integer.parseInt(this.aScreeningRoomTextField.getText()));
            this.aShowTime.setNumOfTickets(Integer.parseInt(this.aNumOfTicketTextField.getText()));
            LocalDate date = (LocalDate) this.aShowDatePicker.getValue();
            int hour = this.aShowTimeHourComboBox.getValue();
            int minutes = this.aShowTimeMinuteComboBox.getValue();
            this.aShowTime.setShowDate(LocalDateTime.of(date, LocalTime.of(hour, minutes)));
        }
        backButtonClick(pEvent);
    }

    /**
     * Executed on back button click. Going back without saving.
     * @param pEvent Triggered event. Not used, but necessary for JavaFX.
     */
    @FXML
    protected void backButtonClick(ActionEvent pEvent) {
        Stage currentStage = (Stage) this.aScreeningRoomTextField.getScene().getWindow();
        currentStage.close();
    }
}
