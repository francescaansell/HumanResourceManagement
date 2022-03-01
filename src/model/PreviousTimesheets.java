package model;
import java.util.*; 
/**
 *
 * @author Group 1 HRM
 */
public class PreviousTimesheets {
    //private Integer prevTotalHoursWorked; 
    public Date startTimeFrame; 
    public Date endTimeFrame; 
   
   
    /**
     * This is the default constructor for this class 
     * @param totalHoursWorked
     * @param startTimeFrame
     * @param endTimeFrame
     */
    public PreviousTimesheets(Integer totalHoursWorked, Date startTimeFrame, Date endTimeFrame) {        
        //this.prevTotalHoursWorked = totalHoursWorked;
        this.startTimeFrame = startTimeFrame;
        this.endTimeFrame = endTimeFrame;
    }
    
    /** 
     * This is an empty constructor that sets all attributes to default values
     */
    public PreviousTimesheets() {
        //this.prevTotalHoursWorked = 0;
        this.startTimeFrame = new Date();
        this.endTimeFrame = new Date();
    }
    
    public int calcTotalHours(){
        return 1; 
    }
    
    /*
    public Integer getPrevTotalHoursWorked() {
        return prevTotalHoursWorked;
    }

    public void setPrevTotalHoursWorked(Integer prevTotalHoursWorked) {
        this.prevTotalHoursWorked = prevTotalHoursWorked;
    }
    */
    
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


}
