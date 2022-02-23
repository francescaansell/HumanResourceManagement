/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.EmployeeCntl;


/**
 * This class will function as the user interface to create a new employee 
 * This class can only be viewed by HR employees 
 * @author Group1HRM
 */
public class NewEmployeeUI {

    EmployeeCntl employeeCntl; 

    /**
     * This is the default constructor
     * @param employeeCntl 
     */
    public NewEmployeeUI(EmployeeCntl employeeCntl) {
        this.employeeCntl = employeeCntl;
    }
}
