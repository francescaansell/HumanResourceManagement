//done
package model;

import java.io.Serializable;
import java.util.Random;


/**
 *
 * @author Group1HRM
 */
public class Complaint implements Serializable{
    protected Employee assignedEmployee; 
    protected java.util.Date openDate; 
    protected Employee claimant;
    protected Boolean open; 
    protected Boolean approved; 
    protected String description; 
    //TODO GOAL protected ArrayList<Employee> involved; 
    protected String involved; 
    protected Integer id; 

    /**
     * This is the default constructor
     * @param assignedEmployee the employee assigned to the complaint
     * @param openDate the date the complaint was opened 
     * @param claimant the employee making the complaint
     * @param open whether or not the complaint is currently open
     * @param approved 
     */
    public Complaint(java.util.Date openDate, Employee claimant, Boolean open, Boolean approved, String involved, Integer id) {
        this.assignedEmployee = assignedEmployee; 
        this.openDate = openDate; 
        this.claimant = claimant; 
        this.open = open; 
        this.approved = approved; 
        this.involved = involved; 
        this.id = id; 

    }
    public Complaint() {
        this.assignedEmployee = null; 
        this.openDate = new java.util.Date(); 
        this.claimant = new Employee(); 
        this.open = true; 
        this.approved = true; 
        this.involved = "";
    }

    public void setInvoled(String involved){
        this.involved = involved; 
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

    public java.util.Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(java.util.Date openDate) {
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
    public void setID(){
        Random rand = new Random();
        this.id = rand.nextInt(10000);
    }
    public Integer getId(){
        return this.id; 
    }
    @Override
    public String toString()
    {
        return "Complaint{" + "Assigned Employee: " + assignedEmployee + ", Open date: " + openDate + ", Claimant: " + claimant.toString() + ", Open: " + open + '}';
    }
    public void setDescription(String text) {
    }
}


