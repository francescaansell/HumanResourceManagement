package controller;
import model.*;
import view.*; 

/**
 *
 * @author Group 1 HRM
 */
public class LeaveCntl {
    public Employee employee; //her fac
    public VacationRequest vacationRequest; //her model
    public MyVacationUI view; 
 
    public LeaveCntl(Employee employee, VacationRequest vacationRequest, MyVacationUI view) {
        this.employee = employee;
        this.vacationRequest = vacationRequest;
    }

}
