package model.database;

import java.sql.DriverManager;

public class SqlDaoFactoryImpl implements SqlDaoFactory{

    private String url = "jdbc:oracle:thin:@localhost:1521:XE";
    private String name = "GAV_6308";
    private String password = "qwerty";

    @Override
    public boolean getConnecting(){
        try {
            DriverManager.getConnection(url, name, password);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public String getConnectException() {
        try {
            DriverManager.getConnection(url, name, password);
            return "Connected by second try";
        }catch (Exception e){
            return e.getMessage();
        }
    }

    @Override
    public SqlClientDao getClient() {
        return new SqlClientDao();
    }

}
