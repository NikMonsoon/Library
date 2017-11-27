package library.database;

import library.classes.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SqlClientDao implements ClientDao{

    private final Connection connection;

    @Override
    public Client get(Integer id) throws SQLException {

        String sql = "SELECT * FROM Client WHERE ID = ?";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setInt(1,id);

        ResultSet result = statement.executeQuery();

        return getResult(result);
    }

    @Override
    public Client get(String login) throws SQLException {
        String sql = "SELECT * FROM Client WHERE Login = ?";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1,login);

        ResultSet result = statement.executeQuery();

        return getResult(result);
    }

    public Client getResult(ResultSet result) throws SQLException {
        if(result.next()){
            Client client = new Client();

            client.setId(result.getInt("ID"));
            client.setLogin(result.getString("Login"));
            client.setPass(result.getString("Pass"));
            client.setPrivilege(result.getString("Privilege"));

            return client;
        }else {
            return null;
        }
    }

    @Override
    public Client create() {
        return null;
    }

    @Override
    public void update(Client client) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Client> getAll() throws SQLException {
        String sql = "SELECT * FROM Client";
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet result = statement.executeQuery();

        List<Client> clients = new ArrayList<Client>();
        while(result.next()){
            Client client = new Client();

            client.setId(result.getInt("ID"));
            client.setLogin(result.getString("Login"));
            client.setPass(result.getString("Pass"));
            client.setPrivilege(result.getString("Privilege"));

            clients.add(client);
        }
        return clients;
    }
    public SqlClientDao(Connection connection) {
        this.connection = connection;
    }
}
