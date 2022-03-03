package view;

import java.util.Scanner;

/**
 * This class will function as the user interface for the Employee Login
 * @author Group1HRM
 */
public class LoginUI {

    protected String login; 
    protected String pw; 

    public LoginUI() {       
    }

    public String getLogin(){
        return login; 
    }
    public void setLogin(String login){
        this.login = login; 
    }
    public String getPw(){
        return pw; 
    }
    public void setPw(String pw){
        this.pw = pw; 
    }   
}
