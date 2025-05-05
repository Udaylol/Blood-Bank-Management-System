package app.views;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HomePage {
    @FXML
    Parent root;
    @FXML
    Scene scene;
    @FXML
    Stage stage;
    @FXML
    VBox logoutButton;
    @FXML
    private void logout() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/app/views/Login.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage = (Stage) logoutButton.getScene().getWindow();
        stage.setTitle("BloodLink");
        stage.setScene(scene);
        stage.show();
    }
}
