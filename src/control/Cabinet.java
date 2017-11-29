package control;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import model.Client;


public class Cabinet extends Application {


    @FXML
    private Label log;

    Client client = Controller.client;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../view/cabinet.fxml"));
        primaryStage.setTitle("Личный кабинет");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        //log.setText(client.getLogin());
    }

/*
    public Cabinet(String name){
        this.label.setText(name);
    }*/
}
