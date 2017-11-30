package model.database.sql;

import model.Author;
import model.database.AuthorDao;

import java.util.List;

public class SqlAuthorDao implements AuthorDao {
    @Override
    public Author get(Integer id) {
        return null;
    }

    @Override
    public Author get(String name) {
        return null;
    }

    @Override
    public boolean create(Author author) {
        return false;
    }

    @Override
    public void update(Author author) {

    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Author> getAll() {
        return null;
    }
}
