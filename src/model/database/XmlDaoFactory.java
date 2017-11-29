package model.database;

public interface XmlDaoFactory extends DaoFactory {

    @Override
    boolean getConnecting();

    @Override
    String getConnectException();

    @Override
    SqlClientDao getClient();

}
