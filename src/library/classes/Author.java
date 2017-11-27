package library.classes;

public class Author {

    private Integer id;
    private String name;

    public Author(){}

    public Author(Integer id, String name){
        this.id = id;
        this. name = name;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
