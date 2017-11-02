package WhatsNext_Sprint2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class LoginUIController {
    
    @FXML private Text actiontarget;
    @FXML private TextField username;
    @FXML private PasswordField password;
    
    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        LoginController loginCtrl = new LoginController();
        loginCtrl.requestAuthenticate(username.getText(), password.getText());
        
        
    }
}
