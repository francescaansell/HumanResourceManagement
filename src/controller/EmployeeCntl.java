package controller;

import model.*;
import view.*;
import java.util.*; 

import view.EmployeeUI;
import view.LoginUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.Employee;

/**
 *
 * @author Group1HRM
 */
public class EmployeeCntl implements ActionListener{
    
    public UserList userList; 
    public Employee employee;
    public EmployeeUI employeeUI;  
    ArrayList<Employee> listOfUsers; 


 
    public EmployeeCntl() {
        employeeUI = new EmployeeUI(this); 
        employeeUI.setTitle("New Employee Form");
        employeeUI.setVisible(true);
        employeeUI.setBounds(10, 10, 370, 600);
        employeeUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        employeeUI.setResizable(true);
        employeeUI.submit.addActionListener(this); 

        userList = new UserList();
        listOfUsers = userList.getUserList(); 

    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == employeeUI.getSubmitBtn()){
            Employee employee = new Employee(); 
            
            employee.setUserName(employeeUI.getUsername());
            employee.setFirstName(employeeUI.getPassword());
            employee.setLastName(employeeUI.getLastName());

            listOfUsers.add(employee);
            userList.writeUserListFile(); 
            employeeUI.setVisible(false);

            NavigationCntl navCntl = new NavigationCntl(); 

            
            
            
        }
    }
 }

