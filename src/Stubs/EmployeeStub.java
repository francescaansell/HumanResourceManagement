package Stubs;

import model.*; 
public class EmployeeStub extends Employee {
    private String firstName, lastName, userName, pw, department; 
    private int employeeID; 
    private int numLeaveDays;
    private Boolean fullTime; 
    
    private PreviousTimesheets previousTimesheets; 
    

    public EmployeeStub(String firstName, String lastName, String userName, String pw, String department, int employeeID, int numLeaveDays, PreviousTimesheets previousTimesheets, Boolean fullTime) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.department = department; 
        this.pw = pw; 
        this.employeeID = employeeID;
        this.numLeaveDays = numLeaveDays; 
        this.previousTimesheets = previousTimesheets; 
        this.fullTime = fullTime; 
        
    }
    
    public EmployeeStub() {
        this.firstName = "First";
        this.lastName = "Last";
        this.userName = "username";
        this.department = "Delivery Management"; 
        this.pw = "pw"; //not sure how we navigate this when creating complaint and needing to know this info... maybe we need one general employee class and one for HR employees eyes only?
        this.employeeID = 0123;
        this.numLeaveDays = 1; 
        this.previousTimesheets = new PreviousTimesheets(); 
        
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }
    
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getNumLeaveDays() {
        return numLeaveDays;
    }

    public void setNumLeaveDays(int numLeaveDays) {
        this.numLeaveDays = numLeaveDays;
    }
}