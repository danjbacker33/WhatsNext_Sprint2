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
import javafx.scene.layout.AnchorPane;

import javafx.stage.Stage;


/**
 *
 * @author mattb
 */
public class MainMenuUIController {
    
    @FXML private AnchorPane pane;
    @FXML protected void handleProfileButtonAction(ActionEvent event) {
        
        
        try{
                Stage stage1 = (Stage)pane.getScene().getWindow();
                FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("CreateProfile.fxml"));
                Parent root = (Parent) fxmlLoader.load();
                
                Scene scene = new Scene(root, 400, 400);
                stage1.setHeight(400);
                stage1.setWidth(400);
                
                stage1.setScene(scene);

                stage1.show();
            }catch(Exception e){
                    System.out.println("Something fucked up");
            }
    }
    
    

        
    
    
}
