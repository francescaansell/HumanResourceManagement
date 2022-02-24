/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import model.*;

/**
 *
 * @author Group 1 HRM
 */
public class LeaveCntl {
    private Employee employee;
    private VacationEligibility vacationEligibilty; 
    private VacationRequest vacationRequest;
 
    public LeaveCntl(Employee employee, VacationEligibility vacationEligibilty, VacationRequest vacationRequest) {
        this.employee = employee;
        this.vacationEligibilty = vacationEligibilty;
        this.vacationRequest = vacationRequest;
    }
    
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public VacationEligibility getVacationEligibilty() {
        return vacationEligibilty;
    }

    public void setVacationEligibilty(VacationEligibility vacationEligibilty) {
        this.vacationEligibilty = vacationEligibilty;
    }

    public VacationRequest getVacationRequest() {
        return vacationRequest;
    }

    public void setVacationRequest(VacationRequest vacationRequest) {
        this.vacationRequest = vacationRequest;
    }
    
    
    
    
}
