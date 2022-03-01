package Stubs;

import model.*; 


public class CloseComplaintStub extends CloseComplaint {
    private Boolean approved; 
    private Complaint complaint;
    
    
    public CloseComplaintStub(Boolean approved, Complaint complaint){
        super(approved, complaint);
    }
     /*
    idea for testharness:
    //concern, when populating this stuff would we need to include their available days? and their password? gonna alter in employee
    CloseComplaint complaint = new CloseComplaint(new Complaint(new Employee("hannah","kitchell","h123","password","IT","12345",7), Date openDate, new Employee("jen","hodsdon","j123","password","IT","54321",3), Boolean open);
    */

    @Override
    public void approveComplaint(){
        this.approved = true; 
    }
    
    @Override
    public Boolean getApproved(){
        return approved; 
    }
    
    
    @Override
    public Boolean checkRequirements(){
        
        if (this.complaint != null){
            approveComplaint();
        } else {
            
        }
        return this.getApproved();   
    }
    
    @Override
    public String sendOutResponse(){
        return "Sample Response";
        
    }

    @Override
    public Complaint getComplaint() {
        return complaint;
    }

    @Override
    public void setComplaint(Complaint complaint) {
        this.complaint = complaint;
    }
    
    
}

