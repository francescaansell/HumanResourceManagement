/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.*; 
import view.*; 

/**
 *
 * @author Group 1 HRM
 */
public class TimeSheetCntl {
    private ApproveTimesheet approveTimesheet; 
    private PreviousTimesheets previousTimesheets; 
    private TimeSubmission timeSubmission; 
    private MyHoursUI myHoursUI; 

    public TimeSheetCntl(ApproveTimesheet approveTimesheet, PreviousTimesheets previousTimesheets, TimeSubmission timeSubmission, MyHoursUI myHoursUI) {
        this.approveTimesheet = approveTimesheet;
        this.previousTimesheets = previousTimesheets;
        this.timeSubmission = timeSubmission;
        this.myHoursUI = myHoursUI;
    }

    public ApproveTimesheet getApproveTimesheet() {
        return approveTimesheet;
    }

    public void setApproveTimesheet(ApproveTimesheet approveTimesheet) {
        this.approveTimesheet = approveTimesheet;
    }

    public PreviousTimesheets getPreviousTimesheets() {
        return previousTimesheets;
    }

    public void setPreviousTimesheets(PreviousTimesheets previousTimesheets) {
        this.previousTimesheets = previousTimesheets;
    }

    public TimeSubmission getTimeSubmission() {
        return timeSubmission;
    }

    public void setTimeSubmission(TimeSubmission timeSubmission) {
        this.timeSubmission = timeSubmission;
    }

    public MyHoursUI getMyHoursUI() {
        return myHoursUI;
    }

    public void setMyHoursUI(MyHoursUI myHoursUI) {
        this.myHoursUI = myHoursUI;
    }
    
    
    
}
