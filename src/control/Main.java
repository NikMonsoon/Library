package control;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.Book;
import model.BookImpl;
import model.ClientImpl;
import model.database.ClientDao;
import model.database.DaoFactory;
import model.database.DaoFactoryImpl;
import model.database.sql.SqlClientDao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main /*extends Application */{


    public static void main(String[] args) throws Exception {

        DaoFactory daoFactory = new DaoFactoryImpl();
        Scanner sc = new Scanner(System.in);
        String log, pass;
        int select;
        char assepting;
        boolean run = true;
        ClientImpl client;
        List<BookImpl> books;
        BookImpl book;

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
                    switch (client.getPrivilege()){
                        case "Client":
                            while(run) {
                                System.out.println("Что бы вы хотели сделать?\nПосмотреть список ваших книг? Введите '1'.\nПосмотреть список всех книг? Введите '2'.\nПосмотреть информацию о книге? Введите '3'.\nВзять новую книгу? Введите '4'.\nВыйти? Введите '5'.");
                                select = sc.nextInt();
                                int bookID;
                                switch (select) {
                                    case 1:
                                        books = daoFactory.book().getByClientID(client.getId());
                                        for (int i = 0; i < books.size(); i++) {
                                            System.out.println(books.get(i).getTitle());
                                        }
                                        break;
                                    case 2:
                                        books = daoFactory.book().getAll();
                                        for (int i = 0; i < books.size(); i++) {
                                            System.out.println(books.get(i).getTitle());
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Введите ID книги: ");
                                        bookID = sc.nextInt();
                                        book = daoFactory.book().get(bookID);
                                        System.out.println(book.getTitle() + " " + book.getYear() + " " + book.getGenre());
                                        break;
                                    case 4:
                                        System.out.print("Введите ID книги: ");
                                        bookID = sc.nextInt();
                                        daoFactory.client().getBook(client.getId(), bookID);
                                        break;
                                    case 5:
                                        run=false;
                                        break;
                                }
                            }
                            break;
                        case "Admin":
                            break;
                        case "Moder":
                            break;
                    }
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
