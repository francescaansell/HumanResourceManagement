package model;
import java.io.Serializable;
import java.util.*; 

/**
 * This class will be used to make an instance of an Employee and Store any information about that employee
 *@author Group1HRM 
 */
public class Employee implements Serializable{
    protected String firstName;
    protected String lastName;
    protected String userName;
    protected String pw;
    protected Department department; 
    protected int employeeID; 
    protected int numLeaveDays;
    protected Boolean fullTime; 
    protected ArrayList<TimeSheet> previousTimeSheets; 
    protected Role role; 
    protected Integer supervisorID; 

    
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
    public Employee(String firstName, String lastName, String userName, String pw, Department department, Role role,
     int employeeID, int numLeaveDays, ArrayList<TimeSheet> previousTimesheets, Boolean fullTime, Integer supervisorID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.department = department; 
        this.role = role; 
        this.pw = pw; 
        this.employeeID = employeeID;
        this.numLeaveDays = numLeaveDays;  
        this.fullTime = fullTime; 
        this.previousTimeSheets = previousTimesheets; 
        this.supervisorID = supervisorID; 
        
    }
    
    //Information Employee Can Enter
    public Employee(String firstName, String lastName, String userName, String pw, Boolean fullTime, Integer supervisorID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.pw = pw; 
        this.fullTime = fullTime; 
        this.supervisorID = supervisorID; 
        

        //null for now 
        this.department = null;  
        this.employeeID = 0;
        this.numLeaveDays = 0;  
        this.previousTimeSheets = null; 
        this.role = new Role();
        this.role.setRoleName("Pending");  

    }

    //Information Supervisor Can Enter
    public Employee(String firstName, String lastName, String userName, String pw, Department department, Role role, int employeeID, int numLeaveDays, Boolean fullTime, ArrayList<TimeSheet> previousTimesheets) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.department = department;
        this.role = role;  
        this.pw = pw; 
        this.employeeID = employeeID;
        this.numLeaveDays = numLeaveDays; 
        this.fullTime = fullTime; 
        this.previousTimeSheets = previousTimesheets; 
    
    }
    
    /**
     * This is the empty constructor for the employee class
     */
    public Employee() {
        this.firstName = "First";
        this.lastName = "Last";
        this.userName = "username";
        this.department = new Department(); 
        this.role = new Role(); 
        this.role.setRoleName("Pending"); 
        this.pw = "pw"; 
        this.employeeID = 0123;
        this.numLeaveDays = 1; 
        this.previousTimeSheets = new ArrayList<TimeSheet>(); 
        this.department = new Department(); 

        
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
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

    public String getRole() {
     
        return role.getRoleName(); 
    }

    public void setRole(String roleName){
        role.setRoleName(roleName);
    }

    @Override
    public String toString()
    {
        return "Employee{" + firstName + ", " + lastName + ", " + department + ", " + getRole() + ", " + employeeID +'}';
    }
}
