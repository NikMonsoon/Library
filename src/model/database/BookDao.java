package model.database;

import model.Book;

import java.sql.SQLException;
import java.util.List;

public interface BookDao {

    Book read(Integer id);

    Book create();

    void update(Book book);

    void delete(Integer id);

    List<Book> getAll() throws SQLException;

}
