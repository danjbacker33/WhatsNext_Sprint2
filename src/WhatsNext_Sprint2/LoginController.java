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
    private LoginUIController theLoginUIController;
    
    public LoginController(LoginUIController a)
    {
        this.userList = new UserList(); // Initializes List
        this.theLoginUIController = a;
        
    }
    
    public boolean requestAuthenticate(String authUsername, String authPassword)
    { 
        System.out.println("ButtonPressed");
        
        for(User u:userList.getTheList())
        {
            
            if(authUsername.equals(u.getUsername()))
            {
                System.out.println("Username checked");
                if(authPassword.equals(u.getPassword()))
                {
                    System.out.println("Password checked"); 
                    
                    return true;
                }
            }
        }
        
        return false;
    }
    
}
