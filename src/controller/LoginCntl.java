package controller;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import model.*;
import view.*; 
public class LoginCntl implements ActionListener{

    private LoginUI loginUI;
    private RequestAccountUI employeeUI;  
    private RequestAccountCntl requestAccountCntl; 
    private EmployeeList employeeList; 

    public LoginCntl(){
        loginUI = new LoginUI(this);
        loginUI.setTitle("Login Form");
        loginUI.setVisible(true);
        loginUI.setBounds(20, 20, 370, 600);
        loginUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        loginUI.setResizable(true);
        loginUI.loginButton.addActionListener(this);
        loginUI.resetButton.addActionListener(this);
        loginUI.showPassword.addActionListener(this);
        loginUI.requestAccessButton.addActionListener(this);

        employeeList = new EmployeeList(); 
    }
    
   


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginUI.getLoginBtn()) {
            String username = loginUI.getUsername();
            char[] password = loginUI.getPassword(); 
            
            for (Employee employee : employeeList.getemployeeList()){   
                if (username.equalsIgnoreCase(employee.getUserName()) && java.util.Arrays.equals(password, employee.getPw())) {         
                    if (employee.getRole().equalsIgnoreCase("Admin") || employee.getRole().equalsIgnoreCase("Supervisor")){ //this is a superviosr
                        System.out.println(employee); 
                        SupervisorNavCntl supervisorNavCntl = new SupervisorNavCntl(employee); 
                        loginUI.setVisible(false);
                        
                    } else if (employee.getRole().equals("Pending")){ //this is an employee that is pending
                        JOptionPane.showMessageDialog(this.loginUI, "Your account is still pending", "Login", JOptionPane.ERROR_MESSAGE);
                        LoginCntl loginCntl = new LoginCntl(); 
                        loginUI.dispose();
                    }else { //this is a regular employee
                        System.out.println(employee);
                        NavigationCntl navCntl = new NavigationCntl(employee); 
                        loginUI.setVisible(false); 
                    }
                } 
            }//end for loop 
            if (loginUI.isVisible()){
                JOptionPane.showMessageDialog(this.loginUI, "Invalid Username or Password, create a new account or wait while your are approved", "Login", JOptionPane.ERROR_MESSAGE);
            }
        }//end if click login 

        if (e.getSource() == loginUI.getResetButton()) {
            loginUI.setUsername("");
            loginUI.setPasswordField("");;
        }
        if (e.getSource() == loginUI.getShowPassword()) {
            if (loginUI.getShowPassword().isSelected()) {
                loginUI.getPasswordField().setEchoChar((char) 0);
            } else {
                loginUI.getPasswordField().setEchoChar('*');
            }
        }
        if (e.getSource() == loginUI.getRequestAccessButton()) {
            RequestAccountCntl requestAccountCntl = new RequestAccountCntl();
            loginUI.dispose();  
        }
    }
}
