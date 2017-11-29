package model.database;

public interface SqlDaoFactory extends DaoFactory {

    @Override
    boolean getConnecting();

    @Override
    String getConnectException();

    @Override
    SqlClientDao getClient();

}
