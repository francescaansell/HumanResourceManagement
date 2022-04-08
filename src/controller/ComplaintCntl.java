//done 
package controller; 
import view.*;
import model.*; 
import java.util.*;

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

/**
 *
 * @author Group 1 HRM
 */
public class ComplaintCntl implements ActionListener {
    public Complaint complaint; 
    public MyComplaintsUI myComplaintsUI; 

    public ComplaintCntl() {
        myComplaintsUI = new MyComplaintsUI(this);
        myComplaintsUI.setTitle("My Complaints"); 
        myComplaintsUI.setVisible (true);
        myComplaintsUI.setBounds(10, 10, 1000, 600);
        myComplaintsUI.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        myComplaintsUI.setResizable(true);
        myComplaintsUI.back.addActionListener(this); 
    }

    public void setAssignedEmployee(Employee assignedEmployee){
        complaint.setAssignedEmployee(assignedEmployee);
    }
    public void setClaimant(Employee claimant){
        complaint.setClaimant(claimant);
    }
    public void setOpenDate(Date openDate){
        complaint.setOpenDate(openDate);
    }
    public void setOpen(Boolean open){
        complaint.setOpen(open);
    }

    public Employee getAssignedEmployee(){
        return complaint.getAssignedEmployee(); 
    }
    public Employee getClaimant(){
        return complaint.getClaimant();
    }
    public Date getOpenDate(){
        return complaint.getOpenDate();
    }
    public Boolean getOpen(){
        return complaint.getOpen(); 
    }    


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == myComplaintsUI.getBack()){
            myComplaintsUI.setVisible(false); 
            NavigationCntl navigationCntl = new NavigationCntl(); //return to home page 
        }
        
    }
}
