package model.database;

import model.ClientImpl;

import java.util.List;

public interface ClientDao{

    ClientImpl get(Integer id);

    ClientImpl get(String login);

    boolean create(ClientImpl client);

    void update(ClientImpl client);

    void delete(Integer id);

    List<ClientImpl> getAll();

}
