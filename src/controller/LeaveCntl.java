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
    public Employee employee; //her fac
    public VacationRequest vacationRequest; //her model
 
    public LeaveCntl(Employee employee, VacationRequest vacationRequest) {
        this.employee = employee;
        this.vacationRequest = vacationRequest;
    }

}
