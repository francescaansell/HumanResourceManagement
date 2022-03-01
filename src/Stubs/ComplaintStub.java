package Stubs;

import java.util.*;
import model.*; 


public class ComplaintStub extends Complaint {
    private Employee assignedEmployee; 
    private Date openDate; 
    private Employee claimant;
    private Boolean open; 

    public ComplaintStub(Employee assignedEmployee, Date openDate, Employee claimant, Boolean open) {
        super(assignedEmployee, openDate, claimant, open);
    }   
}
