/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import model.*; 
import controller.*; 


/**
 *
 * @author Group 1 HRM
 */
public class ApproveTimesheet {
    private Boolean approved; 
    
    private Employee employee; 
    private TimeSubmission timeSubmission;
    private TimeSheetCntl timeSheetCntl; 
    

    /**
     * This is the default constructor for this class
     * @param approved
     * @param timeSubmission
     */
    public ApproveTimesheet(Boolean approved, TimeSubmission timeSubmission, TimeSheetCntl timeSheetCntl) {
        this.approved = approved;
        this.timeSubmission = timeSubmission;
        this.timeSheetCntl = timeSheetCntl; 
    }

    /**
     * Will be used to updated if the Time Sheet is approved
     */
    public void approveTimeSheet() {
        this.approved = true;
    }
       
    /**
     * This return wethers the TimeSheet has been approved 
     * @return 
     */
    public Boolean approvalStatus() {
        return approved;
    }
    
    /**
     * Gets the previous Time Sheet for an employee
     * @param employee
     * @return previous time sheets 
     */
    public PreviousTimesheets getPreviousTimeSheet(Employee employee){
        //return employee.getPreviousTimesheet(); 
        PreviousTimesheets previousTimesheets = new PreviousTimesheets(this.timeSheetCntl); 
        return previousTimesheets; 
    }
    
    public TimeSubmission getTimeSubmission() {
        return timeSubmission;
    }

    public void setTimeSubmission(TimeSubmission timeSubmission) {
        this.timeSubmission = timeSubmission;
    }  

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
}
