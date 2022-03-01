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

    /**
     * This is the default constructor
     * @param assignedEmployee the employee assigned to the complaint
     * @param openDate the date the complaint was opened 
     * @param claimant the employee making the complaint
     * @param open whether or not the complaint is currently open
     */
    public Complaint(Employee assignedEmployee, Date openDate, Employee claimant, Boolean open) {
        this.setAssignedEmployee(assignedEmployee);
        this.setOpenDate(openDate);
        this.setClaimant(claimant);
        this.setOpen(open);

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

    @Override
    public String toString()
    {
        return "Complaint{" + "assignedEmployee=" + assignedEmployee + ", openDate=" + openDate + ", claimant=" + claimant + ", open=" + open + '}';
    }
}


