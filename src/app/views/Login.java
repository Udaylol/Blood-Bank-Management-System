package app.views;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.HashMap;


public class Login {

    static HashMap<String, String> map = new HashMap<>();

    @FXML
    private TextField userField;
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
            stage = (Stage) userField.getScene().getWindow();
            stage.setScene(scene);
            stage.show();
        } catch (IOException e) {

        }
    }

    @FXML
    private void handleLogin() {
        String username = userField.getText();
        String password = passwordField.getText();

        if (username.isEmpty() || password.isEmpty()) {
            messageBox.setText("Field cannot be empty!");
        } else if (map.containsKey(username) && map.get(username).equals(password)) {
            messageBox.setText("Login Successful");
            loadHomePage();
        } else {
            messageBox.setText("Incorrect username or password");
        }
    }

    public void handleCreateAccount() {
        String username = userField.getText();
        String password = passwordField.getText();
        if (map.containsKey(username))
        {
            messageBox.setText("Username is already taken!");
        }
        else
        {
            map.put(username,password);
            messageBox.setText("Account created succesfully!");
            passwordField.setText("");
        }
    }
}
