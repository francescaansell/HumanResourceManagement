package view;

import javax.swing.*;

import controller.LoginCntl;

import java.awt.*;


/**
 * This class will function as the user interface for the Employee Login
 * @author Group1HRM
 */
public class LoginUI extends JFrame  {

    protected String login; 
    protected String pw; 
    protected LoginCntl loginCntl; 

    //Frame
    Container container = getContentPane();
    public JLabel usernameLabel = new JLabel("USERNAME");
    public JLabel passwordLabel = new JLabel("PASSWORD");
    public JTextField usernameTextField = new JTextField();
    public JPasswordField passwordField = new JPasswordField();
    public JButton loginButton = new JButton("LOGIN");
    public JButton resetButton = new JButton("RESET");
    public JButton requestAccessButton = new JButton("Request New Account");
    public JCheckBox showPassword = new JCheckBox("Show Password");

    public LoginUI(LoginCntl loginCntl) {   
        this.loginCntl = loginCntl; 
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();  
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

    public JButton getLoginBtn(){
        return loginButton;
    }

    public String getUsername(){
        return usernameTextField.getText().trim();
    }
    public void setUsername(String str){
        usernameTextField.setText(str);
    }

    public JPasswordField getPasswordField(){
        return passwordField;
    }
    public void setPasswordField(String str){
        passwordField.setText(str);
    }

    public JButton getResetButton(){
        return resetButton; 
    }

    public JCheckBox getShowPassword(){
        return  showPassword;
    }

    public JButton getRequestAccessButton(){
        return requestAccessButton; 
    }
    
    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        usernameLabel.setBounds(50, 150, 100, 30);
        passwordLabel.setBounds(50, 220, 100, 30);
        usernameTextField.setBounds(150, 150, 150, 30);
        passwordField.setBounds(150, 220, 150, 30);
        showPassword.setBounds(150, 250, 150, 30);
        loginButton.setBounds(50, 300, 100, 30);
        resetButton.setBounds(200, 300, 100, 30);
        requestAccessButton.setBounds(70, 350, 200, 30);
    }

    public void addComponentsToContainer() {
        container.add(usernameLabel);
        container.add(passwordLabel);
        container.add(usernameTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(resetButton);
        container.add(requestAccessButton);
    }
}
