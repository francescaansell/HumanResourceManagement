package Stubs; 

import java.util.Scanner;

import view.LoginUI;

public class LoginUIStub extends LoginUI {
    public LoginUIStub(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter LoginID: ");
        this.login = scn.next();
        System.out.print("\nEnter Password: ");
        //Read Password
        this.pw = scn.next();
            
    }
   
    
}
