package model.database.sql;

import model.database.DaoFactory;

import java.sql.SQLException;

public interface SqlDaoFactory extends DaoFactory {

    boolean getConnecting();

    String getConnectException();

    SqlClientDao client();

    SqlAuthorDao author();

    SqlBookDao book();

}
