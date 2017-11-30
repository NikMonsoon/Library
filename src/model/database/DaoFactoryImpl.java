package model.database;

import model.database.sql.SqlDaoFactoryImpl;

public class DaoFactoryImpl implements DaoFactory{

    SqlDaoFactoryImpl sql = new SqlDaoFactoryImpl();

    @Override
    public ClientDao client() throws Exception {
        if(sql.getConnecting()) {
            return sql.client();
        }else{
            //должно быть подключение к xml файлу и считывание клиента с него
            throw new Exception(sql.getConnectException());
        }
    }

    @Override
    public BookDao book() throws Exception {
        if(sql.getConnecting()) {
            return sql.book();
        }else{
            //должно быть подключение к xml файлу и считывание книги с него
            throw new Exception(sql.getConnectException());
        }
    }

    @Override
    public AuthorDao author() throws Exception {
        if(sql.getConnecting()) {
            return sql.author();
        }else{
            //должно быть подключение к xml файлу и считывание автора с него
            throw new Exception(sql.getConnectException());
        }
    }
}
