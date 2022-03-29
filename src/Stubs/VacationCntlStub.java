package Stubs;
import model.*;
import view.*; 
import controller.*; 
public class VacationCntlStub extends VacationCntl{
    public VacationCntlStub(VacationRequest vacationRequest, MyVacationUI view){
        super(vacationRequest, view);
    }
    @Override 
    public void updateView(){
        // public void printVacationDetails(boolean approved, int numDaysRequested, Employee emmployee, VacationEligibility vacationEligibility)
        view.printVacationDetails(vacationRequest.getApproved(), vacationRequest.getNumDaysRequested(), vacationRequest.getAssignedEmployee(), vacationRequest.getVacationEligibility(), vacationRequest.getRequestingEmployee());
    }
}
