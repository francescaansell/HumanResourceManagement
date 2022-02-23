/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.util.ArrayList;
import model.Employee;
import model.EmployeeList;
import view.HomePageUI;



/**
 *
 * @author Group1HRM
 */
public class EmployeeCntl {
    
    private HomePageUI homeUI;
    private Employee employee;
    private int currentIndex = 0;
    ArrayList<Employee> employeeArrayList;

    public EmployeeCntl(HomePageUI homeUI, Employee employee, ArrayList<Employee> employeeArrayList) {
        this.homeUI = homeUI;
        this.employee = employee;
        this.employeeArrayList = employeeArrayList;
    }
  
    /**
    * A place to add buttons and action listeners to UI
    */
    public void setupNewUI(){
    
    }
   

 }

