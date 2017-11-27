package sample;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import library.classes.Client;


public class Cabinet extends Application {


    @FXML
    private Label label;

    Client client = Controller.client;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("cabinet.fxml"));
        primaryStage.setTitle("Личный кабинет");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

/*
    public Cabinet(String name){
        this.label.setText(name);
    }*/
}
