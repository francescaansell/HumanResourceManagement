package model;

import java.io.Serializable;
import java.util.*; 

public class Department implements Serializable{
    public String deptName; 
    public int deptID; 
    public ArrayList<Employee> employeeList; 

    public Department(String deptName, int deptID, ArrayList<Employee> employeeList) {
        deptID = this.deptID; 
        deptName = this.deptName; 
        employeeList = this.employeeList; 
    }

    public Department() {
        deptID = 1; 
        deptName = "Shipping"; 
        employeeList = new ArrayList<Employee>(); 
    }

    public void setDeptID(int deptID) {
        this.deptID = deptID;
    }
    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }
    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }
    public int getDeptID() {
        return deptID;
    }
    public String getDeptName() {
        return deptName;
    }
    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    @Override
    public String toString() {
        return "Department: " + this.deptName + " Department ID: " + this.deptID + " Employees " + this.employeeList; 
    }


    
}
