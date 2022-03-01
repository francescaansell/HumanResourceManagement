package controller;
import model.*; 
import view.*; 

/**
 *
 * @author Group 1 HRM
 */
public class TimeSheetCntl { 
    public TimeSubmission timeSubmission; //her model  
    public MyHoursUI view; 

    public TimeSheetCntl(TimeSubmission timeSubmission, MyHoursUI view) {
        this.timeSubmission = timeSubmission;
        this.view = view;
    }

    public Employee getTimeSubmissionEmployee(){
        return timeSubmission.getEmployee(); 
    }
    public Integer getTotalHours(){
        return timeSubmission.getTotalHours(); 
    }

    public void updateView(){
        //view.printHoursDetails(timeSubmission.getEmployee(), timeSubmission.getStartTimeFrame(), timeSubmission.getEndTimeFrame(), timeSubmission.getTotalHours()); 
    }
    
}
