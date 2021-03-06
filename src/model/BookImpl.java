package model;

public class BookImpl implements Book{

    private Integer id;
    private String title;
    private Integer year;
    private String genre;

    public BookImpl(){}

    public BookImpl(Integer id, String title, Integer year, String genre){
        this.id = id;
        this.title = title;
        this.year = year;
        this.genre = genre;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public Integer getYear() {
        return year;
    }

    @Override
    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String getGenre() {
        return genre;
    }

    @Override
    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }
}
