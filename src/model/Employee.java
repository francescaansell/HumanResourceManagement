package model;
import java.util.*; 

/**
 * This class will be used to make an instance of an Employee and Store any information about that employee
 *@author Group1HRM 
 */
public class Employee {
    protected String firstName;
    protected String lastName;
    protected String userName;
    protected String pw;
    protected String department; 
    protected int employeeID; 
    protected int numLeaveDays;
    protected Boolean fullTime; 
    protected ArrayList<TimeSheet> previousTimeSheets; 
    
    
    

    /**
     * This is the default constructor 
     * @param firstName employee first name
     * @param lastName employee last name
     * @param userName employee user name
     * @param pw employee password
     * @param employeeID employee ID number
     * @param numLeaveDays the number of leave days an employee has left 
     * @param department the department in which the employee works for 
     * @param previousTimeSheets 
     */
    public Employee(String firstName, String lastName, String userName, String pw, String department, int employeeID, int numLeaveDays, ArrayList<TimeSheet> previousTimesheets, Boolean fullTime) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.department = department; 
        this.pw = pw; 
        this.employeeID = employeeID;
        this.numLeaveDays = numLeaveDays;  
        this.fullTime = fullTime; 
        this.previousTimeSheets = previousTimesheets; 
        
    }
    
    public Employee(String firstName, String lastName, String userName, String pw, String department, int employeeID, int numLeaveDays, Boolean fullTime) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.department = department; 
        this.pw = pw; 
        this.employeeID = employeeID;
        this.numLeaveDays = numLeaveDays; 
        this.fullTime = fullTime; 
        this.previousTimeSheets = new ArrayList<TimeSheet>(); 
  
        
    }
    
    /**
     * This is the empty constructor for the employee class
     */
    public Employee() {
        this.firstName = "First";
        this.lastName = "Last";
        this.userName = "username";
        this.department = "Delivery Management"; 
        this.pw = "pw"; //not sure how we navigate this when creating complaint and needing to know this info... maybe we need one general employee class and one for HR employees eyes only?
        this.employeeID = 0123;
        this.numLeaveDays = 1; 
        this.previousTimeSheets = new ArrayList<TimeSheet>(); 
        
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

    public Boolean getFullTime(){
        return this.fullTime; 
    }

    public void setFullTime(Boolean fullTime){
        this.fullTime = true;
    }

    public void setPreviousTimesheets(ArrayList<TimeSheet> previousTimesheets){
        this.previousTimeSheets = previousTimesheets; 
    }

    public ArrayList<TimeSheet> getPreviousTimesheets(){
        return this.previousTimeSheets; 
    }

    @Override
    public String toString()
    {
        return "Employee{" + "firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName + ", pw=" + pw + ", department=" + department + ", employeeID=" + employeeID + ", numLeaveDays=" + numLeaveDays + ", fullTime=" + fullTime + ", previousTimesheets=" + previousTimeSheets + '}';
    }
}
