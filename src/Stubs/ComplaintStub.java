//done 

package Stubs;

import java.util.*;
import model.*; 


public class ComplaintStub extends Complaint {

    public ComplaintStub(Employee assignedEmployee, Date openDate, Employee claimant, Boolean open, Boolean approved) {
        super(assignedEmployee, openDate, claimant, open, approved);
    }   

    @Override
    public Boolean getOpen() {
        return open;
    }

    @Override
    public void setOpen(Boolean open) {
        this.open = open;
    }

    @Override
    public Employee getClaimant() {
        return claimant;
    }

    @Override
    public void setClaimant(Employee claimant) {
        this.claimant = claimant;
    }

    @Override
    public Date getOpenDate() {
        return openDate;
    }

    @Override
    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    @Override
    public Employee getAssignedEmployee() {
        return assignedEmployee;
    }

    @Override
    public void setAssignedEmployee(Employee assignedEmployee) {
        this.assignedEmployee = assignedEmployee;
    }   
}
