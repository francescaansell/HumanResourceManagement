package controller;
import model.*; 
import view.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
/**
 *
 * @author Group1HRM
 */
public class RequestAccountCntl implements ActionListener{
    
    public EmployeeList employeeList; 
    public Employee employee;
    public RequestAccountUI employeeUI;  
    public ArrayList<Employee> listOfEmployees; 
    public LoginCntl loginCntl; 
    
    public RequestAccountCntl() {
        employeeUI = new RequestAccountUI(this); 
        employeeUI.setTitle("New Employee Form");
        employeeUI.setVisible(true);
        employeeUI.setBounds(10, 10, 370, 600);
        employeeUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        employeeUI.setResizable(true);
        employeeUI.submit.addActionListener(this); 

        employeeList = new EmployeeList();
        listOfEmployees = employeeList.getemployeeList(); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == employeeUI.getSubmitBtn()){
            Employee employee = new Employee(); 
            
            employee.setUserName(employeeUI.getUsername());
            employee.setPw(employeeUI.getPassword());
            employee.setFirstName(employeeUI.getFirstName());
            employee.setLastName(employeeUI.getLastName());
            employee.setFullTime(employeeUI.getFullTime());

            listOfEmployees.add(employee); 
            employeeList.writeEmployeeListFile(); 
           
            //New Employee Does show up in this list 
            employeeList.printEmployeeList();

            employeeUI.setVisible(false);

            LoginCntl loginCntl = new LoginCntl(); 

        }
    }
 }

