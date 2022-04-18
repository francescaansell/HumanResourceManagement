package controller;
import view.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.*;

public class EmployeeCntl implements ActionListener{

    private Employee user; 
    private EmployeeUI employeeUI; 
    private NavigationCntl navigationCntl; 
    private EmployeeList employeeList; 
    

    
    public EmployeeCntl(Employee u){
        employeeUI = new EmployeeUI(this);
        employeeUI.setTitle("Employee Information Page");
        employeeUI.setVisible(true);
        employeeUI.setBounds(10, 10, 1000, 600);
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
       // employeeUI.setFullTime(this.user.getFullTime());
        employeeUI.setSupervisorField(this.user.getSupervisorID());
        employeeUI.setPayScale(this.user.getPayScale());
        
        employeeUI.getBackBtn().addActionListener(this); 
        employeeUI.getUpdateBtn().addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == employeeUI.getUpdateBtn()){
            Boolean updated = false; 
            for (Employee employee: employeeList.getemployeeList()){
                // System.out.println(this.user.equals(employee)); 
                // System.out.println(this.user);
                // System.out.println(employee);

                if ((this.user).equals(employee)){ //If found current user in employee list 
                    employee.setAddress(employeeUI.getAddress());
                    employee.setPassword(employeeUI.getPassword()); 
                    employeeList.writeEmployeeListFile();
                    JOptionPane.showMessageDialog(this.employeeUI, "Updated!!", "Employee", JOptionPane.INFORMATION_MESSAGE);
                    employeeUI.dispose();
                    EmployeeCntl employeeCntl = new EmployeeCntl(employee); 
                    updated = true; 
                    break; 
                } 

                //TODO how can we verify the current user is the one being acsessed in the list 

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
