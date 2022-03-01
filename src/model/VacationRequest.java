/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 * This class will be used to crate an instance of a vacation request
 * @author Group1HRM
 */
public class VacationRequest {
    protected boolean approved; 
    protected int numDaysRequested;
    protected Employee assignedEmployee;

    /**
     * This is the default constructor 
     * @param approved Has the Vacation Request been approved
     * @param numDaysRequested the number of days the employee requested off
     * @param assignedEmployee the employee assigned to approve the request 
     */
    public VacationRequest(boolean approved, int numDaysRequested, Employee assignedEmployee) {
        this.approved = approved;
        this.numDaysRequested = numDaysRequested;
        this.assignedEmployee = assignedEmployee; 
    }
    
   
}
