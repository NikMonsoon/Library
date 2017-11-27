package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import library.classes.Client;
import library.database.ClientDao;
import library.database.DaoFactory;
import library.database.SqlDaoFactory;

import java.sql.Connection;
import java.util.List;
import java.util.Locale;

public class Controller {

    @FXML
    private Button log;
    @FXML
    private Button reg;
    @FXML
    private TextField login;
    @FXML
    private TextField pass;

    private DaoFactory factory = new SqlDaoFactory();

    private Registration registration = new Registration();

    private Cabinet cabinet = new Cabinet();

    public static Client client = new Client();

    @FXML
    public void login(){
        Locale.setDefault(Locale.ENGLISH);
        try (Connection connection = factory.getConnection()){
            ClientDao clientDao = factory.getClient(connection);
            List<Client> clients = clientDao.getAll();
            for(int i = 0; i < clients.size(); i++) {
                if (login.getText().equals(clients.get(i).getLogin())){
                    Stage stage = new Stage();
                    client = clients.get(i);
                    try {
                        cabinet.start(stage);
                    }catch (Exception e1){
                        e1.printStackTrace();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @FXML
    public void registration(){
        Stage stage = new Stage();
        try{
            registration.start(stage);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
