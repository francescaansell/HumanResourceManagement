package model;

import java.util.*; 

public class Department {
    public String deptName; 
    public int deptID; 
    public ArrayList<Employee> employeeList; 

    public Department(String deptName, int deptID, ArrayList<Employee> employeeList){
        deptID = this.deptID; 
        deptName = this.deptName; 
        employeeList = this.employeeList; 
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
