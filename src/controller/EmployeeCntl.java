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
    
    public Employee employee;
    public EmployeeUI employeeUI;  

 
    public EmployeeCntl() {
        employeeUI = new EmployeeUI(this); 
        employeeUI.setTitle("Login Form");
        employeeUI.setVisible(true);
        employeeUI.setBounds(10, 10, 370, 600);
        employeeUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        employeeUI.setResizable(true);
        employeeUI.submit.addActionListener(this); 
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Employee employee = new Employee(); 
        if (e.getSource() == employeeUI.getSubmitBtn()){
        
            employee.setUserName(employeeUI.getUsername());
            employee.setFirstName(employeeUI.getPassword());
            employee.setLastName(employeeUI.getLastName());
            JOptionPane.showMessageDialog(this.employeeUI, employee.toString());            
        }
    }
 }

