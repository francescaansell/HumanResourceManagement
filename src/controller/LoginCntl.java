package controller;

import view.EmployeeUI;
import view.LoginUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.Employee;

public class LoginCntl implements ActionListener{

    private LoginUI loginUI; 

    public LoginCntl(){
        loginUI = new LoginUI(this);
        loginUI.setTitle("Login Form");
        loginUI.setVisible(true);
        loginUI.setBounds(10, 10, 370, 600);
        loginUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginUI.setResizable(false);
        // addActionEvent();
        loginUI.loginButton.addActionListener(this);
        loginUI.resetButton.addActionListener(this);
        loginUI.showPassword.addActionListener(this);
        loginUI.requestAccessButton.addActionListener(this);
    }

    // public void addActionEvent() {
    //     loginUI.getLoginBtn().addActionListener(this);
    //     loginUI.getResetButton().addActionListener(this);
    //     loginUI.getShowPassword().addActionListener(this);
    //     loginUI.getRequestAccessButton().addActionListener(this);
    // }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginUI.getLoginBtn()) {
            String usernameText;
            String passwordText;
        
            usernameText = loginUI.getUsernameTextField().getText();
            passwordText = String.valueOf(loginUI.getPasswordField().getPassword());
            if (usernameText.equalsIgnoreCase("vss5123") && passwordText.equalsIgnoreCase("12345")) {
                JOptionPane.showMessageDialog(this.loginUI, this, "Login Successful", 0);
            } else {
                JOptionPane.showMessageDialog(this.loginUI, this, "Invalid Username or Password", 0);
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
            //JOptionPane.showMessageDialog(this.loginUI, this, "Request Access", 0);
           
            loginUI.dispose(); 

            Employee employee = new Employee();

            EmployeeCntl emplCntl = new EmployeeCntl(employee, new EmployeeUI());

            
        }
    }

}