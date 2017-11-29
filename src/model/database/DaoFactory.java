package model.database;

import java.sql.Connection;
import java.sql.SQLException;

public interface DaoFactory {

    Connection getConnection() throws SQLException;

    ClientDao getClient(Connection connection);

    BookDao getBook(Connection connection);

    AuthorDao getAuthor(Connection connection);

}
