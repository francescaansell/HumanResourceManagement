package Stubs;
import java.util.*;

import model.PreviousTimesheets; 

public class PreviousTimesheetsStub extends PreviousTimesheets {
 
    public PreviousTimesheetsStub(Integer totalHoursWorked, Date startTimeFrame, Date endTimeFrame) {        
        super(totalHoursWorked, startTimeFrame, endTimeFrame);
    }

    @Override
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
    
    @Override
    public Date getStartTimeFrame() {
        return startTimeFrame;
    }

    @Override
    public void setStartTimeFrame(Date startTimeFrame) {
        this.startTimeFrame = startTimeFrame;
    }

    @Override
    public Date getEndTimeFrame() {
        return endTimeFrame;
    }

    @Override
    public void setEndTimeFrame(Date endTimeFrame) {
        this.endTimeFrame = endTimeFrame;
    }


}
