/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Group 1 HRM
 */
public class ApproveTimesheet {
    private Boolean approved; 
    private TimeSubmission timeSubmission; 
    
    /**
     * This is the default constructor for this class
     * @param approved
     * @param timeSubmission
     */
    public ApproveTimesheet(Boolean approved, TimeSubmission timeSubmission) {
        this.approved = approved;
        this.timeSubmission = timeSubmission; 
    }

    /**
     * Will be used to updated if the Time Sheet is approved
     */
    public void approveTimeSheet() {
        this.approved = true;
    }
       
    /**
     * This return wether the TimeSheet has been approved 
     * @return approval status
     */
    public Boolean getApproved() {
        return approved;
    }
    
    /**
     * Gets the previous Time Sheet for an employee
     * @param employee
     * @return previous time sheets 
     */
    public PreviousTimesheets getPreviousTimeSheet(Employee employee){
        //return employee.getPreviousTimesheet(); 
        PreviousTimesheets previousTimesheets = new PreviousTimesheets(); 
        return previousTimesheets; 
    }

    /**
     * Will check and make sure all requirements are meet to approve Time Sheet, will use attribute timeSubmission
     * @param employee
     * @return 
     */
    public Boolean checkRequirements(Employee employee){
        PreviousTimesheets previousTimesheets = this.getPreviousTimeSheet(employee); 
        if (previousTimesheets != null){
            approveTimeSheet();
        } else {
            
        }
        return this.getApproved();        
    }
    
 
    public void setApproved(Boolean approved) {
        this.approved = approved;
    }

    public TimeSubmission getTimeSubmission() {
        return timeSubmission;
    }

    public void setTimeSubmission(TimeSubmission timeSubmission) {
        this.timeSubmission = timeSubmission;
    }
    
    
}
