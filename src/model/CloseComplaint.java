/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 * 
 * @author Group 1 HRM
 */
public class CloseComplaint {
    private Boolean approved; 
    private Complaint complaint;
    
    /**
     * This is the default constructor for this class 
     * @param complaint 
     * @param approved 
     */
    public CloseComplaint(Boolean approved, Complaint complaint){
        this.approved = approved; 
        this.complaint = complaint;
    }
     /*
    idea for testharness:
    //concern, when populating this stuff would we need to include their available days? and their password? gonna alter in employee
    CloseComplaint complaint = new CloseComplaint(new Complaint(new Employee("hannah","kitchell","h123","password","IT","12345",7), Date openDate, new Employee("jen","hodsdon","j123","password","IT","54321",3), Boolean open);
    */
    
    public void approveComplaint(){
        this.approved = true; 
    }
    
    public Boolean getApproved(){
        return approved; 
    }
    
    
    /**
     * Will check and make sure all requirements are meet to close complaint
     * @return 
     */
    public Boolean checkRequirements(){
        
        if (this.complaint != null){
            approveComplaint();
        } else {
            
        }
        return this.getApproved();   
    }
    
    /**
     * Will send out proper response to the complaint in order to correct the issue
     * @return 
     */
    public String sendOutResponse(){
        return "Sample Response";
        
    }

    public Complaint getComplaint() {
        return complaint;
    }

    public void setComplaint(Complaint complaint) {
        this.complaint = complaint;
    }
    
    
}

