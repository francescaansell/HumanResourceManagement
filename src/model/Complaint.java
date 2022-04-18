package model;
import java.io.Serializable;
import java.util.ArrayList;
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
    protected String type; 
   

    /**
     * 
     * @param openDate
     * @param claimant
     * @param open
     * @param approved
     * @param involved
     * @param description
     * @param id
     */
    public Complaint(Integer id, String type, Employee assignedEmployee, java.util.Date openDate, java.util.Date incidentDate, Employee claimant, Boolean open, Boolean approved, String involved, String description){
        this.openDate = openDate; 
        this.claimant = claimant; 
        this.open = open; 
        this.approved = approved; 
        this.involved = involved; 
        this.id = id; 
        this.claimant = claimant; 
        this.description = description; 
        this.type = type; 
        this.assignedEmployee = assignedEmployee; 

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

    public Boolean getApproved() {
        return this.approved;
    }
    
    public Boolean checkRequirements(){
        return true; 
    }
    
    public String sendOutResponse(){
        return ""; 
    }

    public void setID(Integer newID){
        this.id = newID; 

    }

  

    public void setType(String str){
        this.type = str; 
    }

    public String getType(){
        return this.type; 
    }

    public Integer getId(){
        return this.id; 
    }

    @Override
    public String toString(){
        return "Complaint{" + "ID: " + this.id + ", Assigned Employee: " + this.assignedEmployee.getEmployeeID() + ", Open date: " + this.openDate + ", Claimant: " + this.claimant.getEmployeeID() + ", Open: " + this.open + ", Description: " + this.description + '}';
    }

    public void setDescription(String text) {
    }
}


