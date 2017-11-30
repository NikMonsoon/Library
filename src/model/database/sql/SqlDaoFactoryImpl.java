package model.database.sql;

import java.sql.DriverManager;
import java.util.Locale;

public class SqlDaoFactoryImpl implements SqlDaoFactory{

    private String url = "jdbc:oracle:thin:@localhost:1521:XE";
    private String name = "GAV_6308";
    private String password = "qwerty";

    @Override
    public boolean getConnecting(){
        try {
            Locale.setDefault(Locale.ENGLISH);
            DriverManager.getConnection(url, name, password);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    @Override
    public String getConnectException() {
        try {
            Locale.setDefault(Locale.ENGLISH);
            DriverManager.getConnection(url, name, password);
            return "Connected by second try";
        }catch (Exception e){
            return e.getMessage();
        }
    }

    @Override
    public SqlClientDao client() {
        return new SqlClientDao();
    }

    @Override
    public SqlAuthorDao author() {
        return new SqlAuthorDao();
    }

    @Override
    public SqlBookDao book() {
        return new SqlBookDao();
    }
}
