package model.database;

import model.Author;

import java.util.List;

public interface AuthorDao {

    Author get(Integer id);

    Author get(String name);

    boolean create(Author author);

    void update(Author author);

    void delete(Integer id);

    List<Author> getAll();

}
