package model;

public interface Client {

    public Integer getId();

    public String getLogin();

    public String getPass();

    public String getPrivilege();

    public void setId(Integer id);

    public void setLogin(String login);

    public void setPass(String pass);

    public void setPrivilege(String privilege);

}
