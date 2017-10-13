import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.event.ActionEvent;

public class Controller{
    @FXML private TextField usernameField;
    @FXML private TextField passwordField;

    @FXML protected void handleLoginButtonPressed(ActionEvent event){
        System.out.println("LOGIN");
        System.out.println("username:  " + usernameField.getText());
        System.out.println("password:  " + passwordField.getText());
    }
    @FXML protected void handleRegisterButtonPressed(ActionEvent event){
        System.out.println("Registers");
    }
}
