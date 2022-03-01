package model;
public class ApproveTimesheetStub extends ApproveTimesheet{
    
    public ApproveTimesheetStub(Boolean approved, TimeSubmission timeSubmission) {
        super(approved, timeSubmission);
    }

    @Override
    public PreviousTimesheets getPreviousTimeSheet(Employee employee){
        //return employee.getPreviousTimesheet(); 
        PreviousTimesheets previousTimesheets = new PreviousTimesheets(); 
        return previousTimesheets; 
    }

    @Override
    public Boolean checkRequirements(Employee employee){
        PreviousTimesheets previousTimesheets = this.getPreviousTimeSheet(employee); 
        if (previousTimesheets != null){
            approveTimeSheet();
        } else {
            
        }
        return this.getApproved();        
    }
    
    @Override
    public void setApproved(Boolean approved) {
        this.approved = approved;
    }
          
    @Override
    public Boolean getApproved() {
        return approved;
    }

    @Override
    public TimeSubmission getTimeSubmission() {
        return timeSubmission;
    }

    @Override
    public void setTimeSubmission(TimeSubmission timeSubmission) {
        this.timeSubmission = timeSubmission;
    }
    
    
}
