package app.views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.stage.Stage;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class AddDonor {

    @FXML private TextField donorID;
    @FXML private TextField fullName;
    @FXML private TextField fathersName;
    @FXML private TextField mothersName;
    @FXML private DatePicker dateOfBirth;
    @FXML private TextField phoneNumber;
    @FXML private TextField emailAddress;
    @FXML private ComboBox<String> bloodGroup;
    @FXML private TextField city;
    @FXML private TextArea address;
    @FXML private ComboBox<String> gender;
    @FXML private Button saveButton;

    @FXML
    public void handleSaveAction(ActionEvent event) {
        System.out.println("Form saved successfully");
        Stage stage = (Stage) saveButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    public void handleResetAction(ActionEvent event) {
        clearForm();
    }

    private void clearForm() {
        fullName.clear();
        fathersName.clear();
        mothersName.clear();
        dateOfBirth.setValue(null);
        phoneNumber.clear();
        emailAddress.clear();
        bloodGroup.setValue("A+");
        city.clear();
        address.clear();
        gender.setValue("Male");
        fullName.requestFocus();
    }
}