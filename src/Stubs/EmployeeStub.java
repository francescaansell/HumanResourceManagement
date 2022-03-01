package Stubs;

import model.*; 
public class EmployeeStub extends Employee {

    public EmployeeStub(String firstName, String lastName, String userName, String pw, String department, int employeeID, int numLeaveDays, PreviousTimesheets previousTimesheets, Boolean fullTime) {
        super(firstName, lastName, userName, pw, department, employeeID, numLeaveDays, previousTimesheets, fullTime);
    }
    
   
    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String getUserName() {
        return userName;
    }
    
    @Override
    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Override
    public int getEmployeeID() {
        return employeeID;
    }

    @Override
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    @Override
    public String getPw() {
        return pw;
    }

    @Override
    public void setPw(String pw) {
        this.pw = pw;
    }

    @Override
    public String getDepartment() {
        return department;
    }

    @Override
    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public int getNumLeaveDays() {
        return numLeaveDays;
    }

    @Override
    public void setNumLeaveDays(int numLeaveDays) {
        this.numLeaveDays = numLeaveDays;
    }

    @Override
    public Boolean getFullTime(){
        return this.fullTime; 
    }

    @Override
    public void setFullTime(Boolean fullTime){
        this.fullTime = true;
    }

    @Override
    public void setPreviousTimesheets(PreviousTimesheets previousTimesheets){
        this.previousTimesheets = previousTimesheets; 
    }

    @Override
    public PreviousTimesheets getPreviousTimesheets(){
        return this.previousTimesheets; 
    }
}