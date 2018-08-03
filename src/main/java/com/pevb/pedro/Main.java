package com.pevb.pedro;
/**
 * Created by BARREPE on 8/3/2018.
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/MainWindow.fxml"));
        Pane pane = loader.load();
        Scene scene = new Scene(pane, 550,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
