package Stubs; 

import java.util.Scanner;

import view.LoginUI;

public class LoginUIStub extends LoginUI {

    public void loginUIStub(){
        Scanner scn = new Scanner(System.in);
        System.out.println("hi");
        this.login = scn.next();
        System.out.println("\nEnter Password: ");
        //Read Password
        this.pw = scn.next();
            
    }
   
    
}
