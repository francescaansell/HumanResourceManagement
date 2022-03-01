package model; 
import java.util.*; 
public class TimeSubmissionStub extends TimeSubmission{

    public TimeSubmissionStub(int totalHours, Date startTimeFrame, Date endTimeFrame, Employee employee) {
        super(totalHours, startTimeFrame, endTimeFrame, employee); 
    }
    
    @Override
    public int calculateTotalHours(){
        return 1; 
    }

    @Override
    public int getTotalHours() {
        return totalHours;
    }

    @Override
    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

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

    @Override
    public Employee getEmployee() {
        return employee;
    }

    @Override
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    
    
    
}
