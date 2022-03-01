//done

package Stubs;

import view.*;
import model.*; 
import java.util.*; 

public class MyComplaintsStub extends MyComplaintsUI {
    @Override
    public void printComplaintDetails(Employee assignedEmployee, Date openDate, Employee claimant, Boolean open){
        System.out.println("Complaint Details: ");
        System.out.println("Assigned Employee: " + assignedEmployee);
        System.out.println("Open Date: " + openDate); 
        System.out.println("Claimant: " + claimant); 
        System.out.println("Open: " + open );
    }
    
}
