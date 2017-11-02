/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WhatsNext_Sprint2;

/**
 *
 * @author mattb
 */
public class LoginController {
    private UserList userList;
    
    public LoginController()
    {
        this.userList = new UserList(); // Initializes List
    }
    
    public boolean requestAuthenticate(String authUsername, String authPassword)
    {
        for(User u:userList.getTheList())
        {
            if(authUsername.equals(u.getUsername()))
            {
                System.out.println("Username checked");
                if(authPassword.equals(u.getPassword()))
                {
                   System.out.println("Password checked"); 
                    //navCtrl = new NavCtrl();
                    //loginUI.setVisible(false);
                    return true;
                }
            }
        }
        
        return false;
    }
    
}
