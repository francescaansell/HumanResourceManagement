/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller; 
import view.*;
import model.*; 


/**
 *
 * @author Group 1 HRM
 */
public class ComplaintCntl {
    public Complaint complaint; 
    public Employee employee; 
    public MyComplaintsUI view; 

    public ComplaintCntl(Complaint complaint, Employee employee, MyComplaintsUI view) {
        this.complaint = complaint;
        this.employee = employee;
        this.view = view; 
    }


    
    
    
    
}
