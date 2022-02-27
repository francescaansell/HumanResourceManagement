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
    private CloseComplaint approveComplaint; 
    private Employee employee; 
    private MyComplaintsUI myComplaintsUI; 

    public ComplaintCntl(CloseComplaint approveComplaint, Employee employee) {
        this.approveComplaint = approveComplaint;
        this.employee = employee;
    }

    public CloseComplaint getApproveComplaint() {
        return approveComplaint;
    }

    public void setApproveComplaint(CloseComplaint approveComplaint) {
        this.approveComplaint = approveComplaint;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    
    
    
}
