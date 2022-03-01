//done 
package Stubs;

import java.util.*; 
import model.*; 
import view.*; 

public class MyVacationStub extends MyVacationUI{
    @Override
    public void printVacationDetails(boolean approved, int numDaysRequested, Employee assignmedEmployee, VacationEligibility vacationEligibility, Employee requestingEmployee){
        System.out.println("Approved: " + approved);
        System.out.println("Num Days Requested" + numDaysRequested);
        System.out.println("Assigned Employee: " + assignmedEmployee); 
        System.out.println("VacationEligibility: " + vacationEligibility);
        System.out.println("Requesting Employee: " + requestingEmployee); 
    }   
}


