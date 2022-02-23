/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;


/**
 * This class will contain a list of all our current employees 
 * @author Group1HRM
 */
public class EmployeeList {
    private ArrayList<Employee> listofEmployees;

    /**
     * This is the default constructor (eventually we will be pulling from a file here) 
     */
    public EmployeeList() {
    }

    /**
     * This constructor will be used is there is already a list of employees 
     * @param listofEmployees 
     */
    public EmployeeList(ArrayList<Employee> listofEmployees) {
        this.listofEmployees = listofEmployees;
    }
    
    
}
