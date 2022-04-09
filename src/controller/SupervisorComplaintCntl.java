//done 
package controller; 
import view.*;
import model.*; 
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList; 

/**
 *
 * @author Group 1 HRM
 */
public class SupervisorComplaintCntl implements ActionListener {

    public Complaint complaint; 
    public SupervisorComplaintUI supervisorComplaintUI; 
    private Employee employee; 
    private ComplaintList complaintList; 
    private SupervisorNavCntl supervisorNavCntl; 
    private ArrayList<Complaint> assignedComplaints; 
    private ArrayList<Complaint> listOfComplaints; 

    public SupervisorComplaintCntl(Employee employee) {
        supervisorComplaintUI = new SupervisorComplaintUI(this);
        supervisorComplaintUI.setTitle("Handle Complaints"); 
        supervisorComplaintUI.setVisible (true);
        supervisorComplaintUI.setBounds(10, 10, 1000, 600);
        supervisorComplaintUI.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        supervisorComplaintUI.setResizable(true);
        supervisorComplaintUI.getBack().addActionListener(this); 
        supervisorComplaintUI.getRetrieveComplaintsBtn().addActionListener(this);
        supervisorComplaintUI.getAssignEmployeeBtn().addActionListener(this); 
        
        complaintList = new ComplaintList(); 
        listOfComplaints = complaintList.getComplaintList(); 
        complaintList.printComplaintList(); 

        this.employee = employee; 
        System.out.println(this.employee); 
        assignedComplaints = new ArrayList<Complaint>(); 
        
        
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == supervisorComplaintUI.getBack()){
            supervisorComplaintUI.setVisible(false); 
            supervisorNavCntl = new SupervisorNavCntl(employee); //return to home page 
        }
        if(e.getSource() == supervisorComplaintUI.getRetrieveComplaintsBtn()){
            
            for (Complaint complaint: listOfComplaints){
                //System.out.println(complaint.getAssignedEmployee());
                if ( (complaint.getAssignedEmployee()).equals(this.employee) ){
                    this.assignedComplaints.add(complaint);
                }
            }
            supervisorComplaintUI.setTextField(this.assignedComplaints.toString()); 
        }
        //TODO START HERE NEXT TIME so we can assign complaints to people 
        if (e.getSource() == supervisorComplaintUI.getAssignEmployeeBtn()){

        }
        
    }
}
