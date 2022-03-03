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
import controller.*;
import view.*;
import model.*;

/**
 *
 * @author Group 1 HRM
 */
public class TestHarness {
     
    private static Employee retriveEmployeeFromDatabase(String courseid){
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
    private static VacationRequest retreiveVacationRequestFromDatabase(String login){
        VacationRequest vacationRequest = new VacationRequest(false, 4, new Employee(), new VacationEligibility(), new Employee());
        vacationRequest.setApproved(false);
        vacationRequest.setAssignedEmployee(new Employee());
        vacationRequest.setNumDaysRequested(5);
        vacationRequest.setRequestingEmployee(new Employee());
        vacationRequest.setVacationEleigibility(new VacationEligibility());
        return vacationRequest;
    }

    

    //Main method
    public static void main(String[] args) {

        EmployeeUI eView = new EmployeeUIStub();
        LoginUI lView = new LoginUIStub(); 
        Employee employee1 = new Employee("Vincent", "Semrau", "vss5123", "12345", "Human Resources", 180880, 14, true);
        Employee employee2 = new Employee("Frankie", "Ansell", "kla349", "12345", "Human Resources", 179384, 5, false);



        // loginView lview = new loginViewStub();
        // Faculty fac = retriveFacultyFromDatabase(lview.getLogin());
        // if(fac.authenticate(lview.getPwd())){
        //     Course model  = retriveCourseFromDatabase(fac.getCourseID());
        //     CourseView view = new CourseViewStub();
        //     CourseControllerStub controller = new CourseControllerStub(fac, model, view);
        //     controller.updateView();
        //     }
        // else
        //     System.out.println("Invalid Login/Password");
        }

        
        

    }
  
 
