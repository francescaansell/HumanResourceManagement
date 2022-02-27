/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model; 
import java.util.*; 

/**
 * This class will be used to create an instance of a time submission
 * @author Group1HRM
 */
public class TimeSubmission {
    private int totalHours;
    private Date startTimeFrame; 
    private Date endTimeFrame; 
    private Employee employee;

    public TimeSubmission(int totalHours, Date startTimeFrame, Date endTimeFrame, Employee employee) {
        this.totalHours = totalHours;
        this.startTimeFrame = startTimeFrame;
        this.endTimeFrame = endTimeFrame;
        this.employee = employee;
    }
    
    /**
     * This method will be used to calculate the total number of hours worked by the employee within the time frame given 
     * @return 
     */
    public int calculateTotalHours(){
        return 1; 
    }

    public int getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    public Date getStartTimeFrame() {
        return startTimeFrame;
    }

    public void setStartTimeFrame(Date startTimeFrame) {
        this.startTimeFrame = startTimeFrame;
    }
    
    public Date getEndTimeFrame() {
        return endTimeFrame;
    }

    public void setEndTimeFrame(Date endTimeFrame) {
        this.endTimeFrame = endTimeFrame;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    
    
    
}
