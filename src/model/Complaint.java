//done
package model;

import java.util.Date;


/**
 *
 * @author Group1HRM
 */
public class Complaint {
    protected Employee assignedEmployee; 
    protected Date openDate; 
    protected Employee claimant;
    protected Boolean open; 
    protected Boolean approved; 
    protected String description; 

    /**
     * This is the default constructor
     * @param assignedEmployee the employee assigned to the complaint
     * @param openDate the date the complaint was opened 
     * @param claimant the employee making the complaint
     * @param open whether or not the complaint is currently open
     * @param approved 
     */
    public Complaint(Employee assignedEmployee, Date openDate, Employee claimant, Boolean open, Boolean approved) {
        this.assignedEmployee = assignedEmployee; 
        this.openDate = openDate; 
        this.claimant = claimant; 
        this.open = open; 
        this.approved = approved; 

    }

    public Boolean getOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    public Employee getClaimant() {
        return claimant;
    }

    public void setClaimant(Employee claimant) {
        this.claimant = claimant;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public Employee getAssignedEmployee() {
        return assignedEmployee;
    }

    public void setAssignedEmployee(Employee assignedEmployee) {
        this.assignedEmployee = assignedEmployee;
    }   

    public void approveComplaint(){

    }

    public Boolean getApproved() {
        return approved;
    }
    
    public Boolean checkRequirements(){
        return true; 
    }
    
    public String sendOutResponse(){
        return ""; 
    }



    @Override
    public String toString()
    {
        return "Complaint{" + "assignedEmployee=" + assignedEmployee + ", openDate=" + openDate + ", claimant=" + claimant + ", open=" + open + '}';
    }
}


