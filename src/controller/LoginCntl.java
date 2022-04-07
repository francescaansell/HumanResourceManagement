package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.*;
import view.*; 
public class LoginCntl implements ActionListener{

    public LoginUI loginUI;
    public EmployeeUI employeeUI;  
    EmployeeCntl employeeCntl; 
    NavigationCntl navCntl; 
    SupervisorNavCntl supervisorNavCntl; 
    private ArrayList<Employee> listOfEmployees;
    public EmployeeList employeeList; 

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

        employeeList = new EmployeeList(); 
        listOfEmployees = employeeList.getemployeeList(); 
   
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginUI.getLoginBtn()) {
            String username;
            String password;
            username = loginUI.getUsernameTextField().getText();
            password = String.valueOf(loginUI.getPasswordField().getPassword());
            //System.out.println("USERNAME" + username);
            //System.out.println("PW" + password); 
            for (Employee employee : employeeList.getemployeeList()){

                //System.out.print(listOfEmployees);
                //System.out.println("For loop");
                //System.out.println(employee.getUserName());
                //System.out.println(employee.getPw());
            
                if (username.equalsIgnoreCase(employee.getUserName()) && password.equalsIgnoreCase(employee.getPw())) {           
                    if (employee.getRole().equals("Admin")){
                        //this is a superviosr
                        //System.out.println("Supervisor");
                        SupervisorNavCntl supervisorNavCntl = new SupervisorNavCntl(); 
                        loginUI.setVisible(false);
                        
                    } else if (employee.getRole().equals("Pending")){
                        //this is an employee that is pending
                        JOptionPane.showMessageDialog(this.loginUI, "Your account is still pending", "Login", JOptionPane.ERROR_MESSAGE);
                    }
                    
                    else {
                        //this is a regular employee
                        //System.out.println("Employee");
                        NavigationCntl navCntl = new NavigationCntl(); 
                        loginUI.setVisible(false); 
                    }
                } 
            }//end for loop 
            if (loginUI.isVisible()){
                JOptionPane.showMessageDialog(this.loginUI, "Invalid Username or Password, create a new account or wait while your are approved", "Login", JOptionPane.ERROR_MESSAGE);
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
