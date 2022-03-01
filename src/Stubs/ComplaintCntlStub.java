//done 
package Stubs;

import view.*; 
import model.*; 
import controller.*; 
public class ComplaintCntlStub extends ComplaintCntl{

    public ComplaintCntlStub(Complaint complaint, MyComplaintsUI view) {
        super(complaint, view);   
    }

    @Override 
    public void updateView(){
        //public void printComplaintDetails(Employee assignedEmployee, Date openDate, Employee claimant, Boolean open)
        view.printComplaintDetails(complaint.getAssignedEmployee(), complaint.getOpenDate(), complaint.getClaimant(), complaint.getOpen()); 
    }
}


