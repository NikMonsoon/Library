package model;

public class AuthorImpl implements Author{

    private Integer id;
    private String name;

    public AuthorImpl(){}

    public AuthorImpl(Integer id, String name){
        this.id = id;
        this. name = name;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
