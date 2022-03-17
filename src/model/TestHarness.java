/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.*;
import Stubs.EmployeeUIStub;
import Stubs.LoginUIStub;
import Stubs.MyComplaintsStub;
import Stubs.MyHoursStub;
import Stubs.MyVacationStub;
import Stubs.VacationRequestStub;
import controller.*;
import view.*;
import model.*;

/**
 *
 * @author Group 1 HRM
 */
public class TestHarness {
     
    private static Employee retriveEmployeeFromDatabase(String login){
        Employee employee = new Employee();
        employee.setFirstName("Vincent");
        employee.setLastName("Semrau");
        employee.setDepartment("Human resources");
        employee.setEmployeeID(180880);
        employee.setNumLeaveDays(14);
        employee.setFullTime(true);
        employee.setUserName("vss5123");
        employee.setPw("12345");
        return employee;

    }

    private static Complaint retrieveComplaintFromDatabase(Employee employee){
        Complaint complaint = new Complaint(new Employee(), new Date(), new Employee(), false);
        complaint.setAssignedEmployee(new Employee());
        complaint.setOpenDate(new Date());
        complaint.setClaimant(new Employee());
        complaint.setOpen(false);
        return complaint; 
    }

    private static TimeSubmission retrieveTimeSubmissionFromDatabase(Employee employee){
        TimeSubmission timeSubmission = new TimeSubmission(0, new Date(), new Date(), new Employee());
        timeSubmission.setEmployee(new Employee());
        timeSubmission.setStartTimeFrame(new Date());
        timeSubmission.setEndTimeFrame(new Date());
        timeSubmission.setTotalHours(0);
        return timeSubmission;
       
    }
    private static VacationRequest retreiveVacationRequestFromDatabase(Employee employee){
        VacationRequest vacationRequest = new VacationRequest(false, 4, employee, new VacationEligibility(), new Employee());
        vacationRequest.setApproved(false);
        vacationRequest.setAssignedEmployee(new Employee());
        vacationRequest.setNumDaysRequested(5);
        vacationRequest.setRequestingEmployee(new Employee());
        vacationRequest.setVacationEleigibility(new VacationEligibility());
        return vacationRequest;
    }

    

    //Main method
    public static void main(String[] args) {

        //EmployeeUI eView = new EmployeeUIStub();
        LoginUIStub lView = new LoginUIStub(); 
        EmployeeUIStub empView = new EmployeeUIStub();
        MyComplaintsStub cmpView = new MyComplaintsStub();
        MyHoursStub hoursView = new MyHoursStub();
        MyVacationStub vacView = new MyVacationStub(); 

        
        Employee emp = retriveEmployeeFromDatabase(lView.getLogin());

        Employee employee = new Employee();
        Complaint cmp = retrieveComplaintFromDatabase(employee);
        VacationRequest vac = retreiveVacationRequestFromDatabase(employee);
    
        
        System.out.println();
        EmployeeCntl empCntl = new EmployeeCntl(emp, empView);
        empCntl.updateView(); 

        System.out.println();
        ComplaintCntl cmpCntl = new ComplaintCntl(cmp, cmpView); 
        cmpCntl.updateView();

        System.out.println();
        VacationCntl leaveCntl = new VacationCntl(vac, vacView);
        leaveCntl.updateView(); 
     
        }

        
        

    }
  
 
