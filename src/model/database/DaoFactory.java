package model.database;

public interface DaoFactory {

    boolean getConnecting();

    String getConnectException();

    SqlClientDao getClient();

}
