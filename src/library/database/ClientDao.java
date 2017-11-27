package library.database;

import library.classes.Client;

import java.sql.SQLException;
import java.util.List;

public interface ClientDao {

    Client get(Integer id) throws SQLException;

    Client get(String name) throws SQLException;

    Client create();

    void update(Client client);

    void delete(Integer id);

    List<Client> getAll() throws SQLException;

}
