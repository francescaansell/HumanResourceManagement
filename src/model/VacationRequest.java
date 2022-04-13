//done
package model;



/**
 * This class will be used to crate an instance of a vacation request
 * @author Group1HRM
 */
public class VacationRequest {
    public boolean approved; 
    public Integer numDaysRequested;
    public Employee assignedEmployee;
    public Employee requestingEmployee; 
    public VacationEligibility vacationEligibility; 


    /**
     * This is the default constructor 
     * @param approved Has the Vacation Request been approved
     * @param numDaysRequested the number of days the employee requested off
     * @param assignedEmployee the employee assigned to approve the request 
     */
    public VacationRequest(boolean approved, Integer numDaysRequested, Employee assignedEmployee, VacationEligibility vacationEligibility, Employee requestingEmployee) {
        this.approved = approved;
        this.numDaysRequested = numDaysRequested;
        this.assignedEmployee = assignedEmployee; 
        this.vacationEligibility = vacationEligibility; 
        this.requestingEmployee = requestingEmployee; 
    }

    //check Eligibility vs Employee.getDays()
    public Boolean checkRequirements(){
        return true; 
    }

    public void setApproved(Boolean approved){
        this.approved  = approved; 
    }
    public Boolean getApproved(){
        return this.approved; 
    }
    
    public void setNumDaysRequested(int numDaysRequested){
        this.numDaysRequested = numDaysRequested; 
    }
    public Integer getNumDaysRequested(){
        return this.numDaysRequested; 
    }

    public void setAssignedEmployee(Employee employee){
        this.assignedEmployee = employee; 
    }
    public Employee getAssignedEmployee(){
        return this.assignedEmployee; 
    }

    public void setVacationEleigibility(VacationEligibility vacationEligibility){
        this.vacationEligibility = vacationEligibility; 
    }
    public VacationEligibility getVacationEligibility(){
        return this.vacationEligibility; 
    }

    public void setRequestingEmployee(Employee requestingEmployee){
        this.requestingEmployee = requestingEmployee; 
    }
    public Employee getRequestingEmployee(){
        return this.requestingEmployee; 
    }

    @Override
    public String toString()
    {
        return "VacationRequest{" + "approved=" + approved + ", numDaysRequested=" + numDaysRequested + ", assignedEmployee=" + assignedEmployee + ", requestingEmployee=" + requestingEmployee + ", vacationEligibility=" + vacationEligibility + '}';
    }
}
