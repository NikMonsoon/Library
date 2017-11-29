package model.database;

import model.Book;

import java.util.List;

public interface BookDao {

    Book get(Integer id);

    Book get(String name);

    boolean create(Book book);

    void update(Book book);

    void delete(Integer id);

    List<Book> getAll();

}
