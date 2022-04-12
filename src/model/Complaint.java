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
    public Complaint(java.util.Date openDate, Employee claimant, Boolean open, Boolean approved, String involved, String description, Integer id) {
        this.openDate = openDate; 
        this.claimant = claimant; 
        this.open = open; 
        this.approved = approved; 
        this.involved = involved; 
        this.id = id; 
        this.claimant = claimant; 
        this.description = description; 

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
        return this.claimant;
    }

    public void setClaimant(Employee claimant) {
        this.claimant = claimant;
    }

    public java.util.Date getOpenDate() {
        return this.openDate;
    }

    public void setOpenDate(java.util.Date openDate) {
        this.openDate = openDate;
    }

    public Employee getAssignedEmployee() {
        return this.assignedEmployee;
    }

    public void setAssignedEmployee(Employee assign) {
        this.assignedEmployee = assign;
    }   

    public void approveComplaint(){

    }

    public Boolean getApproved() {
        return this.approved;
    }
    
    public Boolean checkRequirements(){
        return true; 
    }
    
    public String sendOutResponse(){
        return ""; 
    }
    public void setID(){
        Random rand = new Random();
        //TODO: while complaint in complaint list if id = this id then create a different id 
        this.id = rand.nextInt(10000);
    }
    public Integer getId(){
        return this.id; 
    }
    @Override
    public String toString()
    {
        return "Complaint{" + "Assigned Employee: " + this.assignedEmployee + ", Open date: " + this.openDate + ", Claimant: " + this.claimant + ", Open: " + this.open + '}';
    }

    public void setDescription(String text) {
    }
}


