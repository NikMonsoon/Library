package library.database;

import library.classes.Client;

import java.sql.SQLException;
import java.util.List;

public interface ClientDao {

    Client read(Integer id) throws SQLException;

    Client create();

    void update(Client client);

    void delete(Integer id);

    List<Client> getAll() throws SQLException;

}
