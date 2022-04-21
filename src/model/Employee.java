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
    protected String employeeID;
    protected char[] pw;
    protected String department; 
    protected EmployeeList employeeList; 
    protected Integer numLeaveDays;
    protected Boolean fullTime; 
    protected Role role; 
    protected String supervisorID; 
    protected String address; 
    protected String payscale; 


    
    /**
     * This is the default constructor 
     * @param firstName employee first name
     * @param lastName employee last name
     * @param employeeID employee user name
     * @param pw employee password
     * @param employeeID employee ID number
     * @param numLeaveDays the number of leave days an employee has left 
     * @param department the department in which the employee works for 
     * @param previousTimeSheets 
     */
    public Employee(String firstName, String lastName, String employeeID, char[] pw, String department, Role role,
     Integer numLeaveDays, Boolean fullTime, String supervisorID, String address, String payscale) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = employeeID;
        this.department = department; 
        this.role = role; 
        this.pw = pw; 
        this.employeeID = employeeID;
        this.numLeaveDays = numLeaveDays;  
        this.fullTime = fullTime; 
        this.supervisorID = supervisorID;
        this.address = address;  
        this.payscale = payscale; 
        
        
    }
    
    //Information Employee Can Enter
    public Employee(String firstName, String lastName, String employeeID, char[] pw) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.employeeID = createEmployeeID(employeeID);
        this.pw = pw; 
    
        //null for now 
        this.fullTime = true; 
        this.address = ""; 
        this.supervisorID = ""; 
        this.department = "";
        this.numLeaveDays = 0;  
        this.role = new Role();
        this.role.setRoleName("Pending");  
        this.payscale = ""; 
    }
    
    public String createEmployeeID(String employeeID){
        EmployeeList employeeList = new EmployeeList(); 
        Random rand = new Random();
        String id = employeeID + rand.nextInt(1000); 
        ArrayList<String> employeeIDs = employeeList.getEmployeeIDs(); 
        int i = 0; 
        while (i < employeeIDs.size()){
            if (id == employeeIDs.get(i)){
                id = employeeID + rand.nextInt(1000); 
                i = 0; 
            } else {
                i += 1; 
            }
        }
        return id; 
        
        
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
        return employeeID;
    }
    
    public void setUserName(String userName) {
        this.employeeID = userName;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public char[] getPw() {
        return pw;
    }
    public String getPwString(){
        return pw.toString(); 
    }

    public void setPw(char[] pw) {
        this.pw = pw;
    }

 
    public String getDepartmentName(){
        return department;
    }

    public void setDepartment(String d) {
       
        this.department = d;

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

    public void setPassword(String str){
        this.pw = str.toCharArray();
    }

    public void setPayScale(String str){
        this.payscale = str; 
    }

    public String getPayScale(){
        return this.payscale; 
    }

    public String getSupervisorID(){
        return supervisorID; 
    }

    public void setSupervisorID(String str){
        supervisorID = str; 
    }

    @Override
    public String toString()
    {
        //return "Employee{" + firstName + ", " + lastName + ", " + employeeID + '}';
        return "Employee{" + firstName + ", " + lastName + ", " + employeeID  + ", "  + supervisorID + ", " + department + ", " +  payscale  + ", }";
    }

    public Boolean equals(Employee employee){
        if (this.employeeID.equals(employee.getEmployeeID())){
                return true; 
            } else {
            return false; 
        }
    }
}

