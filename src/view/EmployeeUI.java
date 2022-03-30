package view;

import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import model.*;

public class EmployeeUI {
    protected Employee employee;

    Container container = getContentPane();
    JLabel usernameLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField usernameTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JButton requestAccessButton = new JButton("Request New Account");
    JCheckBox showPassword = new JCheckBox("Show Password");

    public EmployeeUI(){
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
    }

    private Container getContentPane() {
        return null;
    }

    public JButton getLoginBtn(){
        return loginButton;
    }

    public JTextField getUsernameTextField(){
        return usernameTextField;
    }

    public JPasswordField getPasswordField(){
        return passwordField;
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
    //JFrame 
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
