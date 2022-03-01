//done

package Stubs;

import model.*; 

public class VacationRequestStub extends VacationRequest{

    public VacationRequestStub(boolean approved, int numDaysRequested, Employee assignedEmployee, VacationEligibility vacationEligibility, Employee requestingEmployee) {
        super(approved, numDaysRequested, assignedEmployee, vacationEligibility, requestingEmployee);
    }
    
   
    @Override
    public Boolean checkRequirements(){
        return true; 
    }

    @Override
    public void setApproved(Boolean approved){
        this.approved  = approved; 
    }
    @Override
    public Boolean getApproved(){
        return this.approved; 
    }
    @Override
    public void setNumDaysRequested(int numDaysRequested){
        this.numDaysRequested = numDaysRequested; 
    }
    @Override
    public int getNumDaysRequested(){
        return this.numDaysRequested; 
    }
    @Override
    public void setAssignedEmployee(Employee employee){
        this.assignedEmployee = employee; 
    }
    @Override
    public Employee getAssignedEmployee(){
        return this.assignedEmployee; 
    }
    @Override
    public void setVacationEleigibility(VacationEligibility vacationEligibility){
        this.vacationEligibility = vacationEligibility; 
    }
    @Override
    public VacationEligibility getVacationEligibility(){
        return this.vacationEligibility; 
    }
    
}


