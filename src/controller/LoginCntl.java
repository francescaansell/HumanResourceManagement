package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.Employee;

import view.EmployeeUI;
import view.LoginUI;

public class LoginCntl implements ActionListener{

    public LoginUI loginUI;
    public EmployeeUI employeeUI;  

    EmployeeCntl employeeCntl; 
    NavigationCntl naCntl; 

    public LoginCntl(){
        loginUI = new LoginUI(this);
        loginUI.setTitle("Login Form");
        loginUI.setVisible(true);
        loginUI.setBounds(10, 10, 370, 600);
        loginUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginUI.setResizable(true);
        loginUI.loginButton.addActionListener(this);
        loginUI.resetButton.addActionListener(this);
        loginUI.showPassword.addActionListener(this);
        loginUI.requestAccessButton.addActionListener(this);
   
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginUI.getLoginBtn()) {
            String usernameText;
            String passwordText;
        
            usernameText = loginUI.getUsernameTextField().getText();
            passwordText = String.valueOf(loginUI.getPasswordField().getPassword());

            //TODO NEED TO PARSE FILE HERE POSSIBLEY HASHMAP IN THAT FILE THAT HAS USERNAME
            if (usernameText.equalsIgnoreCase("abc") && passwordText.equalsIgnoreCase("12345")) {
                JOptionPane.showMessageDialog(this.loginUI, "Login Successful");
                NavigationCntl navCntl = new NavigationCntl(); 
                loginUI.dispose(); 
            } else {
                JOptionPane.showMessageDialog(this.loginUI, "Invalid Username or Password", "Login", JOptionPane.ERROR_MESSAGE);
            }

        }
        if (e.getSource() == loginUI.getResetButton()) {
            loginUI.getUsernameTextField().setText("");
            loginUI.getPasswordField().setText("");
        }
        if (e.getSource() == loginUI.getShowPassword()) {
            if (loginUI.getShowPassword().isSelected()) {
                loginUI.getPasswordField().setEchoChar((char) 0);
            } else {
                loginUI.getPasswordField().setEchoChar('*');
            }


        }
        if (e.getSource() == loginUI.getRequestAccessButton()) {
            JOptionPane.showMessageDialog(this.loginUI, "Request New Account");

            EmployeeCntl EmployeeCntl = new EmployeeCntl();
            loginUI.dispose(); 

           
            
        }
    }

}
