package app.core;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/app/views/Login.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        stage.setTitle("BloodLink");
        stage.setScene(scene);
        stage.show();
    }
}