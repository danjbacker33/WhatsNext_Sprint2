/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WhatsNext_Sprint2;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

/**
 *
 * @author Laura
 */
public class CreateProfileUIController {
    @FXML private TextField username;
    @FXML private PasswordField cpassword;
    @FXML private PasswordField password;
    @FXML private GridPane pane;
    
    
    
    @FXML protected void handleNewProfileButtonAction(ActionEvent event) {
        ProfileList pList = new ProfileList();
        Profile profile1 = new Profile(username.getText(), cpassword.getText());
        pList.addProfile(profile1);
        
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("MainMenu.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage1 = new Stage();
            Scene scene = new Scene(root, 400, 400);
            stage1.setScene(scene);

            stage1.show();
        }catch(Exception e){

        }
       
    }
}
