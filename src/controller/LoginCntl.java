/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Employee;
import model.EmployeeList;
import view.LoginUI;



/**
 *
 * @author Group1HRM
 */
public class LoginCntl {
    EmployeeList currentEmployeeList; 
    LoginUI employeeUI; 
    ArrayList<Employee> listOfEmployee = new ArrayList<>(); 

    /**
     * This is the default constructor 
     * @param currentEmployeeList current list of employees 
     * @param employeeUI this the instance of the UI
     */
    public LoginCntl(EmployeeList currentEmployeeList) {
        this.currentEmployeeList = currentEmployeeList;
    }
    
    /**
     * Verify an employees exists in the system
     * @param userName username for employee
     * @param PW password for employee
     * 
     */
    public void authenticateUser(String userName, String PW)
       {
           
       }

    /**
     * Adding a new User to the system
     * @param fName first name
     * @param lName last name
     * @param userName employee user name
     * @param pw employee password
     */
    public void addNewUser(String fName, String lName, String userName, String pw){
      

    }

    
    
    
    
}
