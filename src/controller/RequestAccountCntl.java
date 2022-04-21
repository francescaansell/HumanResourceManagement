package controller;
import model.*; 
import view.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Group1HRM
 */
public class RequestAccountCntl implements ActionListener{
    
    public EmployeeList employeeList; 
    public Employee employee;
    public RequestAccountUI requestAccountUI;  
    public ArrayList<Employee> listOfEmployees; 
    public LoginCntl loginCntl; 
    
    public RequestAccountCntl() {
        requestAccountUI = new RequestAccountUI(this); 
        requestAccountUI.setTitle("New Employee Form");
        requestAccountUI.setVisible(true);
        requestAccountUI.setBounds(20, 20, 370, 600);
        requestAccountUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        requestAccountUI.setResizable(true);
        
        employeeList = new EmployeeList();
        listOfEmployees = employeeList.getemployeeList(); 

        requestAccountUI.getSubmitBtn().addActionListener(this); 
    }

    public boolean checkPassword(char[] password)
    {
        int digit = 0, lower = 0, upper = 0; //setting digit/lowercase/uppercase presence to nonexistent (0), if it is found it will change to 1
        boolean hasSpecialChar = false; //setting special character presence to nonexistent (false), if found it will change to true
      
        //checking if password is appropriate length - if it doesn't meet this requirement it automatically is not strong enough
        if(password.length < 8)
        {
            return false;
        }
  
        //for loop that iterates through the length of the password
        for(int i = 0; i < password.length; i++)
        {
            char c = password[i]; //setting up a character (c) at every point of iteration (i)
            char[] specialChar = {'!','@','#','$','%','^','&','*','(',')','[',']','{','}','?'}; //setting up an array of allowed special characters
           
            //checking if there is a number present, if there is, set digit to 1
            if(Character.isDigit(c))
            {
                digit = 1;
            }
            //checking if there is a lowercase letter present, if there is, set lower to 1
            else if(Character.isLowerCase(c))
            {
                lower = 1;
            }
            //checking if there is an uppercase letter present, if there is, set upper to 1
            else if(Character.isUpperCase(c))
            {
                upper = 1;
            }
            //checking if there is a special character from the array of allowed special characters present, if there is, hasSpecialChar to true
            for (Character ch : specialChar) {
                if (c == ch){
                    hasSpecialChar = true;
                }
           }
        }
        //if there is a number, lowercase letter, uppercase letter, and special character in the password, this method returns true (the password is strong enough)
        if(digit == 1 && lower == 1 && upper == 1 && hasSpecialChar == true)
        {
            return true;
        }
        //if the requirements are not met, method returns false (password is not strong enough) but the user can immediately try again until it is strong enough
        return false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == requestAccountUI.getSubmitBtn()){
            char[] password = requestAccountUI.getPassword();
            if (requestAccountUI.getEmployeeID().length() != 3){
                JOptionPane.showMessageDialog(this.requestAccountUI, "You must choose 3 characters for your ID", "Login", JOptionPane.ERROR_MESSAGE);
                requestAccountUI.setEmployeeID("");
            } else if (!checkPassword(password)){
                JOptionPane.showMessageDialog(this.requestAccountUI, "Password but have a lowercase letter, uppercase letter, a spceical character, a number, and longer than 8 charcters", "Login", JOptionPane.ERROR_MESSAGE);
                requestAccountUI.setPw(""); 
            }
            else {
                Employee employee = new Employee(requestAccountUI.getFirstName(), requestAccountUI.getLastName(), requestAccountUI.getEmployeeID(), requestAccountUI.getPassword());  
                listOfEmployees.add(employee); 
                employeeList.writeEmployeeListFile(); 
                requestAccountUI.setVisible(false);
                LoginCntl loginCntl = new LoginCntl(); 

            }
            
        }
    }
 }

