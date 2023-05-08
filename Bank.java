import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class Bank {

    @FXML
    private Button gawe;

    @FXML
    private AnchorPane login;

    @FXML
    private AnchorPane loglog;

    @FXML
    private PasswordField password;

    @FXML
    private PasswordField password1;

    @FXML
    private Button regis;

    @FXML
    private TextField username;

    @FXML
    private TextField username1;

    @FXML
    void log(ActionEvent event) {

    }

    @FXML
    void register(ActionEvent event) {

    }

    @FXML
    void switch_form(ActionEvent event) {
        if(event.getSource()==gawe){
            loglog.setVisible(true);
            login.setVisible(false);
        }
    }

}
