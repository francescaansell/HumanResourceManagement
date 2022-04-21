package controller;
import view.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.*;

public class EmployeeInfoCntl implements ActionListener{

    private Employee user; 
    private EmployeeUI employeeUI; 
    private NavigationCntl navigationCntl; 
    private EmployeeList employeeList; 
    
    public EmployeeInfoCntl(Employee u){
        employeeUI = new EmployeeUI(this);
        employeeUI.setTitle("Employee Information Page");
        employeeUI.setVisible(true);
        employeeUI.setBounds(10, 10, 1000, 700);
        employeeUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        employeeUI.setResizable(true);

        this.user = u; 
        employeeList = new EmployeeList(); 

        employeeUI.setFirstNameField(this.user.getFirstName());
        employeeUI.setLastNameField(this.user.getLastName());
        employeeUI.setEmployeeIdField(this.user.getEmployeeID());
        employeeUI.setUsernameField(this.user.getUserName());
        employeeUI.setPasswordField(this.user.getPw());
        employeeUI.setAddressField(this.user.getAddress());
        employeeUI.setRoleField(this.user.getRole());
        employeeUI.setFullTime(this.user.getFullTime());
        employeeUI.setSupervisorField(this.user.getSupervisorID());
        employeeUI.setPayScale(this.user.getPayScale());
        
        employeeUI.getBackBtn().addActionListener(this); 
        employeeUI.getUpdateBtn().addActionListener(this);

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
        if(e.getSource() == employeeUI.getUpdateBtn()){
            Boolean updated = false; 
            for (Employee employee: employeeList.getemployeeList()){
                if ((this.user).equals(employee)){ //If found current user in employee list 
                    employee.setAddress(employeeUI.getAddress());
                    if (checkPassword(employeeUI.getPassword().toCharArray())){
                        employee.setPassword(employeeUI.getPassword()); 
                    } else {
                        JOptionPane.showMessageDialog(this.employeeUI, "Password but have a lowercase letter, uppercase letter, a spceical character, a number, and longer than 8 charcters", "Employee", JOptionPane.ERROR_MESSAGE);
                        employeeUI.setPasswordField(employee.getPw());
                        return;  
                    }
                    employeeList.writeEmployeeListFile();
                    employeeUI.dispose();
                    EmployeeInfoCntl employeeCntl = new EmployeeInfoCntl(employee); 
                    updated = true; 
                    break; 
                } 
            }//end list search
            if (!updated){
                JOptionPane.showMessageDialog(this.employeeUI, "Unable to Updated Information", "Employee", JOptionPane.ERROR_MESSAGE);
            }
        }         
        if(e.getSource() == employeeUI.getBackBtn()){
            employeeUI.setVisible(false);
            navigationCntl = new NavigationCntl(this.user);
        }
    }
}
