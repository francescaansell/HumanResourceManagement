package model;
import java.io.Serializable;
import java.util.Date;


/**
 *
 * @author Group1HRM
 */
public class Complaint implements Serializable{
    protected Employee assignedEmployee; 
    protected java.util.Date openDate; 
    protected java.util.Date closedDate; 
    protected Employee claimant;
    protected Boolean open; 
    protected String description; 
    //TODO GOAL protected ArrayList<Employee> involved; 
    protected String involved; 
    protected Integer id; 
    protected String type; 
    protected java.util.Date incidentDate; 

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
    public Complaint(Integer id, String type, Employee assignedEmployee, java.util.Date openDate, java.util.Date incidentDate, Employee claimant, String involved, String description, Boolean open, java.util.Date closedDate){
        this.openDate = openDate; 
        this.claimant = claimant; 
        this.open = open; 
        this.involved = involved; 
        this.id = id; 
        this.claimant = claimant; 
        this.description = description; 
        this.type = type; 
        this.assignedEmployee = assignedEmployee; 
        this.incidentDate = incidentDate; 

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

    public String formatOpen(){
        if(this.open){
            return "Open";
        }else {
            return "Closed"; 
        }
    }

    public void setDescription(String text) {
    }
    public void setClosedDate(java.util.Date date){
        this.openDate = date; 
    }

    @Override
    public String toString(){
        //(Integer id, String type, Employee assignedEmployee, java.util.Date openDate, java.util.Date incidentDate, Employee claimant, String involved, String description, Boolean open, java.util.Date closedDate)
        if(this.open){
            return "Complaint{" + "ID: " + this.id + ", Assigned Employee: " + this.assignedEmployee.getEmployeeID() + ", Type: " + type + " , Open date: " + this.openDate + ", Incident Date: " + incidentDate +  ", Claimant: " + this.claimant.getEmployeeID()  + ", Involed: " + this.involved + ", Description: " + this.description + ", " + formatOpen() + '}';
        } else {
            return "Complaint{" + "ID: " + this.id + ", Assigned Employee: " + this.assignedEmployee.getEmployeeID() + ", Type: " + type + ", Open date: " + this.openDate + ", Incident Date: " + incidentDate +  ", Claimant: " + this.claimant.getEmployeeID()  + ", Involed: " + this.involved + ", Description: " + this.description + ", " + formatOpen() + ", " + "Closed Date: " + closedDate + '}';
        }
    }

 
}


