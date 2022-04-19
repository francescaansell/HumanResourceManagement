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

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == employeeUI.getUpdateBtn()){
            Boolean updated = false; 
            for (Employee employee: employeeList.getemployeeList()){
                if ((this.user).equals(employee)){ //If found current user in employee list 
                    employee.setAddress(employeeUI.getAddress());
                    employee.setPassword(employeeUI.getPassword()); 
                    employeeList.writeEmployeeListFile();
                    JOptionPane.showMessageDialog(this.employeeUI, "Updated!!", "Employee", JOptionPane.INFORMATION_MESSAGE);
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
