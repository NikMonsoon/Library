package control;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import model.Client;
import model.database.Select;

public class Controller {

    @FXML
    private Button log;
    @FXML
    private Button reg;
    @FXML
    private TextField login;
    @FXML
    private TextField pass;
    @FXML
    private Label wrong;

    private Registration registration = new Registration();

    private Cabinet cabinet = new Cabinet();

    public static Client client = new Client();

    @FXML
    public void login(){
        client = Select.getClient(login.getText());
        if (client != null) {
            if(client.getPass().equals(pass.getText())) {
                Stage stage = new Stage();
                try {
                    cabinet.start(stage);
                    Main.end();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else{
                wrong.setText("Incorrect password");
                wrong.setVisible(true);
            }
        }else {
            wrong.setText("Invalid login");
            wrong.setVisible(true);
        }
    }

    @FXML
    public void registration(){
        Stage stage = new Stage();
        try{
            registration.start(stage);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
