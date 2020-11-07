package models;

import controllers.ApplicationController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        stage.setWidth(711);
        stage.setHeight(712);
        stage.setResizable(false);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../views/application.fxml"));
        BorderPane application = loader.load();

        ApplicationController controller = loader.getController();
        Group group1 = controller.initBoard();
        Group group2 = controller.initNextPiece();
                       controller.initOtherSections();
        application.getChildren().addAll(group1, group2);
        Scene scene = new Scene(application);
        scene.getStylesheets().add("stylesheets/stylesheet.css");
        stage.setScene(scene);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
        Tetris.running = false;
    }
}
