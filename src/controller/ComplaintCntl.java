//done 
package controller; 
import view.*;
import model.*; 
import java.util.*; 

/**
 *
 * @author Group 1 HRM
 */
public class ComplaintCntl {
    protected Complaint complaint; 
    protected MyComplaintsUI view; 

    public ComplaintCntl(Complaint complaint, MyComplaintsUI view) {
        this.complaint = complaint;
        this.view = view; 
    }

    public void setAssignedEmployee(Employee assignedEmployee){
        complaint.setAssignedEmployee(assignedEmployee);
    }
    public void setClaimant(Employee claimant){
        complaint.setClaimant(claimant);
    }
    public void setOpenDate(Date openDate){
        complaint.setOpenDate(openDate);
    }
    public void setOpen(Boolean open){
        complaint.setOpen(open);
    }

    public Employee getAssignedEmployee(){
        return complaint.getAssignedEmployee(); 
    }
    public Employee getClaimant(){
        return complaint.getClaimant();
    }
    public Date getOpenDate(){
        return complaint.getOpenDate();
    }
    public Boolean getOpen(){
        return complaint.getOpen(); 
    }    

    public void updateView(){
        //public void printComplaintDetails(Employee assignedEmployee, Date openDate, Employee claimant, Boolean open)
        view.printComplaintDetails(complaint.getAssignedEmployee(), complaint.getOpenDate(), complaint.getClaimant(), complaint.getOpen());
    }
}
