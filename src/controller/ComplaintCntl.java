/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller; 
import java.util.*;
import model.*; 


/**
 *
 * @author Group 1 HRM
 */
public class ComplaintCntl {
    private ApproveComplaint approveComplaint; 
    private Employee employee; 

    public ComplaintCntl(ApproveComplaint approveComplaint, Employee employee) {
        this.approveComplaint = approveComplaint;
        this.employee = employee;
    }

    public ApproveComplaint getApproveComplaint() {
        return approveComplaint;
    }

    public void setApproveComplaint(ApproveComplaint approveComplaint) {
        this.approveComplaint = approveComplaint;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    
    
    
}
