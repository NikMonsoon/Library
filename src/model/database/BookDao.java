package model.database;

import model.Book;
import model.BookImpl;

import java.util.List;

public interface BookDao {

    BookImpl get(Integer id);

    BookImpl get(String title);

    boolean create(BookImpl book);

    void update(BookImpl book);

    void delete(Integer id);

    List<BookImpl> getByClientID(Integer id);

    List<BookImpl> getAll();

}
