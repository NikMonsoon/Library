package model.database.sql;

import model.Book;
import model.database.BookDao;

import java.util.List;

public class SqlBookDao implements BookDao {
    @Override
    public Book get(Integer id) {
        return null;
    }

    @Override
    public Book get(String name) {
        return null;
    }

    @Override
    public boolean create(Book book) {
        return false;
    }

    @Override
    public void update(Book book) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Book> getAll() {
        return null;
    }
}
