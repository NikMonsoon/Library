package model.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlDaoFactory implements DaoFactory{

    private String url = "jdbc:oracle:thin:@localhost:1521:XE";
    private String name = "GAV_6308";
    private String password = "qwerty";
    private String driver = "oracle.jdbc.driver.OracleDriver";

    @Override
    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url,name,password);
    }

    @Override
    public ClientDao getClient(Connection connection) {
        return new SqlClientDao(connection);
    }

    @Override
    public BookDao getBook(Connection connection) {
        return null;
    }

    @Override
    public AuthorDao getAuthor(Connection connection) {
        return null;
    }

    public SqlDaoFactory() {
        try {
            Class.forName(driver);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
