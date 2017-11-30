package control;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.ClientImpl;
import model.database.ClientDao;
import model.database.DaoFactory;
import model.database.DaoFactoryImpl;
import model.database.sql.SqlClientDao;

import java.util.Scanner;

public class Main /*extends Application */{


    public static void main(String[] args) throws Exception {

        DaoFactory daoFactory = new DaoFactoryImpl();
        Scanner sc = new Scanner(System.in);
        String log, pass;
        char assepting;
        boolean run = true;
        ClientImpl client;

        while(run) {
            System.out.print("Введите ваш логин: ");
            log = sc.next();

            System.out.print("Введите ваш пароль: ");
            pass = sc.next();

            client = daoFactory.client().get(log);

            if (client != null) {
                if (client.getPass().equals(pass)) {
                    //тело программы. работа с клиентом
                    System.out.println("Здравствуй, " + client.getLogin());
                    //
                } else {
                    System.out.println("Неверный пароль");
                }
            } else {
                System.out.println("Такого пользователя нет");
            }
            System.out.print("Попробуете войти снова?(y): ");
            assepting = sc.next().charAt(0);
            if(assepting=='y'){
            }else {
                run=false;
            }
        }
    }


    //Пока отложим вывод в формы и сделаем консольный интерфейс. Позже уже пойдем во фронт
    /*@Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("../view/sample.fxml"));
        primaryStage.setTitle("Логин");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }*/


}
