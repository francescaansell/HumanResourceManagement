/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import controller.*; 
import java.util.*; 
/**
 *
 * @author frank
 */
public class PreviousTimesheets {
    private TimeSheetCntl timeSheetCntl; 
    
    private Integer prevTotalHoursWorked; 
    private Date startTimeFrame; 
    private Date endTimeFrame; 
    
    private Employee employee; 
    private ApproveTimesheet approveTimesheet; 

   
    /**
     * This is the default constructor for this class 
     * @param timeSheetCntl
     * @param totalHoursWorked
     * @param startTimeFrame
     * @param endTimeFrame
     * @param employee
     * @param approveTimesheet 
     */
    public PreviousTimesheets(TimeSheetCntl timeSheetCntl, Integer totalHoursWorked, Date startTimeFrame, Date endTimeFrame, Employee employee, ApproveTimesheet approveTimesheet) {
        this.timeSheetCntl = timeSheetCntl;
        
        this.prevTotalHoursWorked = totalHoursWorked;
        this.startTimeFrame = startTimeFrame;
        this.endTimeFrame = endTimeFrame;
        this.employee = employee;
       
    }
    
    public PreviousTimesheets(TimeSheetCntl timeSheetCntl) {
        this.timeSheetCntl = timeSheetCntl;
        
        this.prevTotalHoursWorked = 0;
        this.startTimeFrame = new Date();
        this.endTimeFrame = new Date();
        this.employee = new Employee("First Name", "Last Name", "username",  "password", "department", 0, 0);
  
    }
    
    
    /**
     * If the number of hours is consistent with the requirements return true
     * @return 
     */
    public Boolean checkNumHours(){
        return true; 
       
    }
    
    public TimeSheetCntl getTimeSheetCntl() {
        return timeSheetCntl;
    }

    public void setTimeSheetCntl(TimeSheetCntl timeSheetCntl) {
        this.timeSheetCntl = timeSheetCntl;
    }

    public Integer getPrevTotalHoursWorked() {
        return prevTotalHoursWorked;
    }

    public void setPrevTotalHoursWorked(Integer prevTotalHoursWorked) {
        this.prevTotalHoursWorked = prevTotalHoursWorked;
    }

    public Date getStartTimeFrame() {
        return startTimeFrame;
    }

    public void setStartTimeFrame(Date startTimeFrame) {
        this.startTimeFrame = startTimeFrame;
    }

    public Date getEndTimeFrame() {
        return endTimeFrame;
    }

    public void setEndTimeFrame(Date endTimeFrame) {
        this.endTimeFrame = endTimeFrame;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }    
}
