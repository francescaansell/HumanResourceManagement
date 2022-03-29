//done 
package controller;
import model.*;
import view.*; 

/**
 *
 * @author Group 1 HRM
 */
public class VacationCntl {
    public VacationRequest vacationRequest; //her model
    public MyVacationUI view; 
 
    public VacationCntl(VacationRequest vacationRequest, MyVacationUI view) {
        this.vacationRequest = vacationRequest;
        this.view = view; 
    }

    
    public void setApproved(Boolean approved){
        vacationRequest.approved = approved; 
    }
    public void setNumDaysRequested(Integer numDaysRequested){
        vacationRequest.numDaysRequested = numDaysRequested; 
    }
    public void setAssignedEmployee(Employee assignedEmployee){
        vacationRequest.assignedEmployee =  assignedEmployee; 
    }
    public void setVacationEleigibility(VacationEligibility vacationEligibility){
        vacationRequest.vacationEligibility = vacationEligibility; 
    }
    public void setRequestingEmployee(Employee requestingEmployee){
        vacationRequest.requestingEmployee = requestingEmployee; 
    }

    public Boolean getApproved(){
        return vacationRequest.getApproved(); 
    }
    public Integer getNumDaysRequested(){
        return vacationRequest.getNumDaysRequested();
    }
    public Employee getAssignedEmployee(){
        return vacationRequest.getAssignedEmployee(); 
    }
    public VacationEligibility getVacationEligbility(){
        return vacationRequest.getVacationEligibility(); 
    }
    public Employee getRequestingEmployee(){
        return vacationRequest.getRequestingEmployee(); 
    }


    public void updateView(){
        
        view.printVacationDetails(vacationRequest.getApproved(), vacationRequest.getNumDaysRequested(), vacationRequest.getAssignedEmployee(), vacationRequest.getVacationEligibility(), vacationRequest.getRequestingEmployee());
    }

}
