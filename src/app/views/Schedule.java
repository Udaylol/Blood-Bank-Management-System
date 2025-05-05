package app.views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Schedule {
    @FXML
    private Button submitButton;
    public void handleSubmit(ActionEvent actionEvent) {
        System.out.println("form submitted");
        Stage stage = (Stage) submitButton.getScene().getWindow();
        stage.close();
    }
}
