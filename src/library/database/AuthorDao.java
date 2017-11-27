package library.database;

import library.classes.Author;

import java.sql.SQLException;
import java.util.List;

public interface AuthorDao {

    Author read(Integer id);

    Author create();

    void update(Author author);

    void delete(Integer id);

    List<Author> getAll() throws SQLException;

}
