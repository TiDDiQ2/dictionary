package com.uetoop.main.Dic_main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("/com/uetoop/main/Dic_main/menuBar.fxml"));
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root,701,440);
        stage.setTitle("Dictionary");
        stage.setScene(scene);
        stage.show();
    }


    //public String

    public static void main(String[] args) {
        launch();
    }
}