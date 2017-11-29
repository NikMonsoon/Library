package model.database;

import model.ClientImpl;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class SqlClientDao implements ClientDao{

    private String url = "jdbc:oracle:thin:@localhost:1521:XE";
    private String name = "GAV_6308";
    private String password = "qwerty";
    private static String driver = "oracle.jdbc.driver.OracleDriver";

    private static Connection connection = null;

    public ClientImpl get(Integer id){

        String sql = "SELECT * FROM Client WHERE ID = ?";
        try {
            Locale.setDefault(Locale.ENGLISH);
            Class.forName(driver);
            connection = DriverManager.getConnection(url, name, password);

            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setInt(1, id);

            ResultSet result = statement.executeQuery();

            return getResult(result);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public ClientImpl get(String login){
        String sql = "SELECT * FROM Client WHERE Login = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);

            statement.setString(1, login);

            ResultSet result = statement.executeQuery();

            return getResult(result);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }



    @Override
    public boolean create(ClientImpl client) {
        return false;
    }

    @Override
    public void update(ClientImpl client) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<ClientImpl> getAll(){
        String sql = "SELECT * FROM Client";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet result = statement.executeQuery();

            List<ClientImpl> clients = new ArrayList<ClientImpl>();
            while (result.next()) {
                ClientImpl client = new ClientImpl();

                client.setId(result.getInt("ID"));
                client.setLogin(result.getString("Login"));
                client.setPass(result.getString("Pass"));
                client.setPrivilege(result.getString("Privilege"));

                clients.add(client);
            }
            return clients;
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    private static ClientImpl getResult(ResultSet result) throws SQLException {
        if(result.next()){
            ClientImpl client = new ClientImpl();

            client.setId(result.getInt("ID"));
            client.setLogin(result.getString("Login"));
            client.setPass(result.getString("Pass"));
            client.setPrivilege(result.getString("Privilege"));

            return client;
        }else {
            return null;
        }
    }

    /*private static DaoFactory factory = new SqlDaoFactoryImpl();

    public static ClientImpl getClient(int id){
        Locale.setDefault(Locale.ENGLISH);
        try (Connection connection = factory.getConnection()){
            ClientDao clientDao = factory.getClient(connection);
            return clientDao.get(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static ClientImpl getClient(String login){
        Locale.setDefault(Locale.ENGLISH);
        try (Connection connection = factory.getConnection()){
            ClientDao clientDao = factory.getClient(connection);
            return clientDao.get(login);
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    public static List<ClientImpl> getClients(){
        Locale.setDefault(Locale.ENGLISH);
        try (Connection connection = factory.getConnection()){
            ClientDao clientDao = factory.getClient(connection);
            return clientDao.getAll();
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }*/

    public SqlClientDao(){}
}
