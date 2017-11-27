package library.classes;

public class Client {

    //Обычный класс клиента для описания его структуры и работы с данными, полученными из базы

    private Integer id;
    private String login;
    private String pass;
    private String privilege;

    public Client(){ }

    public Client( Integer id, String login, String pass, String privilege){

        this.id = id;
        this.login = login;
        this.pass = pass;
        this.privilege = privilege;
    }

    public Integer getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public String getPrivilege() {
        return privilege;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setPrivilege(String privilege) {
        this.privilege = privilege;
    }

}
