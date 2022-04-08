//done 
package controller; 
import view.*;
import model.*; 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane; 

/**
 *
 * @author Group 1 HRM
 */
public class ComplaintCntl implements ActionListener {

    public Complaint complaint; 
    public MyComplaintsUI myComplaintsUI; 
    private Employee employee; 

    public ComplaintCntl(Employee employee) {
        myComplaintsUI = new MyComplaintsUI(this);
        myComplaintsUI.setTitle("My Complaints"); 
        myComplaintsUI.setVisible (true);
        myComplaintsUI.setBounds(10, 10, 1000, 600);
        myComplaintsUI.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        myComplaintsUI.setResizable(true);
        myComplaintsUI.getBack().addActionListener(this); 
        myComplaintsUI.getSubmit().addActionListener(this);
        this.employee = employee; 
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == myComplaintsUI.getBack()){
            myComplaintsUI.setVisible(false); 
            NavigationCntl navigationCntl = new NavigationCntl(employee); //return to home page 
        }
        if(e.getSource() == myComplaintsUI.getSubmit()){
            Complaint complaint = new Complaint();
            //TODO can we keep track of who logged in or do it manually for now 
            //complaint.setClaimant(claimant)

            //TODO Change this to ArrayList<Employee> at some point if possible
            complaint.setInvoled(myComplaintsUI.getInvoledField().getText());

            complaint.setOpen(true);
            complaint.setOpenDate(myComplaintsUI.getDate());
            complaint.setDescription(myComplaintsUI.getDescriptionField().getText());
            complaint.setID(); 
            complaint.setClaimant(employee);


            JOptionPane.showMessageDialog(this.myComplaintsUI, "Created Complaint: " + "Compalint", "Complaint", JOptionPane.DEFAULT_OPTION);
            myComplaintsUI.setInvoledField("");
            myComplaintsUI.setDescriptionField("");
            myComplaintsUI.setDate(null);
          
        }
        
    }
}
