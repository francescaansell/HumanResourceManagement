//done 
package controller; 
import view.*;
import model.*; 
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

/**
 *
 * @author Group 1 HRM
 */
public class SupervisorComplaintCntl implements ActionListener {

    public Complaint complaint; 
    public SupervisorComplaintUI supervisorComplaintUI; 
    private Employee employee; 
    private ComplaintList complaintList; 

    public SupervisorComplaintCntl(Employee employee) {
        supervisorComplaintUI = new SupervisorComplaintUI(this);
        supervisorComplaintUI.setTitle("Handle Complaints"); 
        supervisorComplaintUI.setVisible (true);
        supervisorComplaintUI.setBounds(10, 10, 1000, 600);
        supervisorComplaintUI.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        supervisorComplaintUI.setResizable(true);
        supervisorComplaintUI.getBack().addActionListener(this); 
        supervisorComplaintUI.getRetrieveComplaintsBtn().addActionListener(this);
        this.employee = employee; 

        complaintList = new ComplaintList(); 
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == supervisorComplaintUI.getBack()){
            supervisorComplaintUI.setVisible(false); 
            SupervisorComplaintCntl supervisorComplaintCntl = new SupervisorComplaintCntl(employee); //return to home page 
        }
        if(e.getSource() == supervisorComplaintUI.getRetrieveComplaintsBtn()){
           
            //TODO add functionality if the complaint is assigned to them or not 
            /*
            for (Complaint complaint: complaintList.getComplaintList()){
                if the comlaint belongs to them
            }
            */
            supervisorComplaintUI.setTextField(complaintList.toString()); 
      
        }
        
    }
}
