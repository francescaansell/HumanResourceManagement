package controller;

import model.*;
import view.*;
import java.util.*; 

/**
 *
 * @author Group1HRM
 */
public class EmployeeCntl {
    
    public Employee employee;
    public EmployeeUI view; 

 
    public EmployeeCntl(Employee employee, EmployeeUI view) {
        this.employee = employee;
        this.view = view; 
    }

    public void setFirstName(String firstName){
        employee.setFirstName(firstName);
    }

    public void setLastName(String lastName){
        employee.setLastName(lastName);
    }

    public void setUserName(String userName){
        employee.setUserName(userName);
    }

    public void setEmployeeID(int employeeID){
        employee.setEmployeeID(employeeID);
    }

    public void setPw(String pw){
        employee.setPw(pw);
    }

    public void setDepartment(String department){
        employee.setDepartment(department);
    }

    public void setNumLeaveDays(int numLeaveDays){
        employee.setNumLeaveDays(numLeaveDays);
    }

    public void setFullTime(boolean fullTime){
        employee.setFullTime(fullTime);
    }

    public void setPreviousTimesheets(ArrayList<TimeSheet> previousTimesheets){
        employee.setPreviousTimesheets(previousTimesheets);
    }

    public String getFirstName(){
        return employee.getFirstName();
    }

    public String getLastName(){
        return employee.getLastName();
    }

    public String getUserName(String userName){
        return employee.getUserName();
    }
  
    public int getEmployeeID(){
        return employee.getEmployeeID();
    }

    public String getPw(String pw){
        return employee.getPw();
    }

    public String getDepartment(){
        return employee.getDepartment();
    }

    public int getNumLeaveDays(){
        return employee.getNumLeaveDays();
    }

    public boolean getFullTime(){
        return employee.getFullTime();
    }

    public ArrayList<TimeSheet>  getPreviousTimesheets(){
        return employee.getPreviousTimesheets();
    }



    public void updateView(){
        view.printEmployeeDetails(employee.getFirstName(), employee.getLastName(), employee.getUserName(), employee.getDepartment(), employee.getEmployeeID(), employee.getFullTime());
    }
   
    //    public Employee(String firstName, String lastName, String userName, String pw, String department, int employeeID, int numLeaveDays, PreviousTimesheets previousTimesheets, Boolean fullTime) {

    
 }

