package app.views;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;


public class Login {
    @FXML
    private TextField usernameField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label messageBox;
    @FXML
    Parent root;
    @FXML
    Scene scene;
    @FXML
    Stage stage;

    private void loadHomePage() {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/app/views/HomePage.fxml"));
            root = loader.load();
            scene = new Scene(root);
            stage = (Stage) usernameField.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {

        }
    }

    @FXML
    private void handleLogin() {
        String username = usernameField.getText();
        String password = passwordField.getText();

        if (username.isEmpty() || password.isEmpty()) {
            messageBox.setText("Field cannot be empty!");
        } else if (username.equals("admin") && password.equals("1234")) {
            messageBox.setText("Login Successful");
            loadHomePage();
        } else {
            messageBox.setText("Incorrect username or password");
        }
    }
}
