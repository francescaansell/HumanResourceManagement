package Stubs;

import model.*; 

public class VacationRequestStub extends VacationRequest{

    public VacationRequestStub(boolean approved, int numDaysRequested, Employee assignedEmployee, VacationEligibility vacationEligibility) {
        super(approved, numDaysRequested, assignedEmployee, vacationEligibility);
    }
    
    
}
