package library.database;

import javafx.stage.Stage;
import library.classes.Client;

import java.sql.Connection;
import java.util.List;
import java.util.Locale;

public class Select {

    private static DaoFactory factory = new SqlDaoFactory();

    public static Client getClient(int id){
        Locale.setDefault(Locale.ENGLISH);
        try (Connection connection = factory.getConnection()){
            ClientDao clientDao = factory.getClient(connection);
            return clientDao.get(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static Client getClient(String login){
        Locale.setDefault(Locale.ENGLISH);
        try (Connection connection = factory.getConnection()){
            ClientDao clientDao = factory.getClient(connection);
            return clientDao.get(login);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static List<Client> getClients(){
        Locale.setDefault(Locale.ENGLISH);
        try (Connection connection = factory.getConnection()){
            ClientDao clientDao = factory.getClient(connection);
            return clientDao.getAll();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
