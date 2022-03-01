package Stubs;

import model.*; 


public class CloseComplaintStub extends CloseComplaint {
    private Boolean approved; 
    private Complaint complaint;
    
    
    public CloseComplaintStub(Boolean approved, Complaint complaint){
        super(approved, complaint);
    }
     
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

