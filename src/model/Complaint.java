/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;


/**
 *
 * @author Group1HRM
 */
public class Complaint {
    private Employee assignedEmployee; 
    private Date openDate; 
    private Employee claimant;
    private Boolean open; 

    /**
     * This is the default constructor
     * @param assignedEmployee the employee assigned to the complaint
     * @param openDate the date the complaint was opened 
     * @param claimant the employee making the complaint
     * @param open whether or not the complaint is currently open
     */
    public Complaint(Employee assignedEmployee, Date openDate, Employee claimant, Boolean open) {
        this.assignedEmployee = assignedEmployee;
        this.openDate = openDate;
        this.claimant = claimant;
        this.open = open;
    }   
}
