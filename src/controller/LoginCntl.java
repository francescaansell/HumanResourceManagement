package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.*;

import view.EmployeeUI;
import view.LoginUI;

public class LoginCntl implements ActionListener{

    public LoginUI loginUI;
    public EmployeeUI employeeUI;  

    EmployeeCntl employeeCntl; 
    NavigationCntl naCntl; 

    private ArrayList<Employee> listOfEmployees;
    public UserList userList; 

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

        userList = new UserList(); 
        //issue here?
        listOfEmployees = userList.getUserList(); 
   
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginUI.getLoginBtn()) {
            String username;
            String password;
        
            username = loginUI.getUsernameTextField().getText();
            password = String.valueOf(loginUI.getPasswordField().getPassword());


            System.out.println("USERNAME" + username);
            System.out.println("PW" + password); 

           

            for (Employee employee : listOfEmployees){

                //System.out.print(listOfEmployees);

                System.out.println("For loop");

                //System.out.println(employee.getUserName());
                //System.out.println(employee.getPw());
            
                if (username.equalsIgnoreCase(employee.getUserName()) && password.equalsIgnoreCase(employee.getPw())) {           
                    if (employee.getRole().equals("Admin")){
                        //this is a superviosr
                        SupervisorNav superNavCntl = new SupervisorNav(); 
                        loginUI.setVisible(false);
                        
                    }else {
                        //this is a regular employee
                        NavigationCntl navCntl = new NavigationCntl(); 
                        loginUI.setVisible(false); 
                    }
                } 
            }//end for loop 
            
            if (loginUI.isVisible()){
                JOptionPane.showMessageDialog(this.loginUI, "Invalid Username or Password, create a new account", "Login", JOptionPane.ERROR_MESSAGE);
            }
            
            
        }//end if click login 

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
            EmployeeCntl EmployeeCntl = new EmployeeCntl();
            loginUI.dispose();  
        }
    }

}
