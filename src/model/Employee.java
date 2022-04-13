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
    protected Integer employeeID; 
    protected Integer numLeaveDays;
    protected Boolean fullTime; 
    protected ArrayList<TimeSheet> previousTimeSheets; 
    protected Role role; 
    protected Integer supervisorID; 
    protected String address; 
    protected String payscale; 

    
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

     //TODO: make supervisor an employee attrivute or just use there id then search based on ID? thinking second one
    public Employee(String firstName, String lastName, String userName, String pw, Department department, Role role,
     Integer employeeID, Integer numLeaveDays, ArrayList<TimeSheet> previousTimesheets, Boolean fullTime, Integer supervisorID, String address) {
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
        this.address = address;  
        //TODO: change later
        this.payscale = ""; 
        
    }
    
    //Information Employee Can Enter
    public Employee(String firstName, String lastName, String userName, String pw) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.pw = pw; 
    
        //null for now 
        this.fullTime = null; 
        this.address = ""; 
        this.supervisorID = 0; 
        this.department = new Department();  
        this.employeeID = 0;
        this.numLeaveDays = 0;  
        this.previousTimeSheets = null; 
        this.role = new Role();
        this.role.setRoleName("Pending");  
        this.employeeID = 2345678;
        this.payscale = ""; 
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

    public Integer getEmployeeID() {
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
    public String getDepartmentName(){
        return department.getDeptName(); 
    }

    public void setDepartment(String department) {
        this.department.setDeptName(department); 
    }

    public Integer getNumLeaveDays() {
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

    //TODO add equals method in Role
    public String getRole() {
     
        return role.getRoleName(); 
    }
    public Role getRoleObject(){
        return role; 
    }

    public void setRole(String roleName){
        role.setRoleName(roleName);
    }

    public void setAddress(String str){
        this.address = str; 
    }
    public String getAddress(){
        return address; 
    }
    public void setPayScale(String str){
        this.payscale = str; 
    }
    public String getPayScale(){
        return this.payscale; 
    }

    @Override
    public String toString()
    {
        return "Employee{" + firstName + ", " + lastName + '}';
    }

    public Boolean equals(Employee employee){
        if ( (this.firstName.equals(employee.getFirstName())) && (this.lastName.equals(employee.getLastName())) && (this.employeeID == employee.getEmployeeID()) ){
            return true; 
        } else {
            return false; 
        }
    }
}
