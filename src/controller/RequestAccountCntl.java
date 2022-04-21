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
        requestAccountUI.setBounds(10, 10, 1000, 700);
        requestAccountUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        requestAccountUI.setResizable(true);
        
        employeeList = new EmployeeList();
        listOfEmployees = employeeList.getemployeeList(); 

        requestAccountUI.getSubmitBtn().addActionListener(this); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == requestAccountUI.getSubmitBtn()){
            if (requestAccountUI.getEmployeeID().length() != 3){
                JOptionPane.showMessageDialog(this.requestAccountUI, "You must choose 3 characters for your ID", "Login", JOptionPane.ERROR_MESSAGE);
                requestAccountUI.setEmployeeID("");
            } else {
                Employee employee = new Employee(requestAccountUI.getFirstName(), requestAccountUI.getLastName(), requestAccountUI.getEmployeeID(), requestAccountUI.getPassword());  
                listOfEmployees.add(employee); 
                employeeList.writeEmployeeListFile(); 
                requestAccountUI.setVisible(false);
                LoginCntl loginCntl = new LoginCntl(); 

            }
            
        }
    }
 }

