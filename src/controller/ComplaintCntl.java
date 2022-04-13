//done 
package controller; 
import view.*;
import model.*; 

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

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
    private EmployeeList employeeList; 
    public ComplaintList complaintList;
    private ArrayList<Complaint> listOfComplaints;   
  

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
        employeeList = new EmployeeList(); 
        complaintList = new ComplaintList(); 
        listOfComplaints = complaintList.getComplaintList(); 
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == myComplaintsUI.getBack()){
            myComplaintsUI.setVisible(false); 
            NavigationCntl navigationCntl = new NavigationCntl(employee); //return to home page 
        }
        if(e.getSource() == myComplaintsUI.getSubmit()){
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
            Random rand = new Random();
            Date date = new Date(System.currentTimeMillis());
            formatter.format(date); 
            Complaint complaint = new Complaint(date, employee, true, false, myComplaintsUI.getInvolved(), myComplaintsUI.getDescription(), rand.nextInt(10000));

            //TODO Change this to ArrayList<Employee> at some point if possible
            complaint.setInvoled(myComplaintsUI.getInvolved());

            complaint.setOpen(true);
            complaint.setOpenDate(myComplaintsUI.getDate());
            complaint.setDescription(myComplaintsUI.getDescription());
            complaint.setID(); 
            complaint.setClaimant(employee); 
          
            try{
                for (Employee employee : employeeList.getemployeeList()){
                    if (employee.getRole().equals("Admin")){
                        complaint.setAssignedEmployee(employee);
                    }
                }
            } catch (Exception x){
                System.out.println("ERROR CANNOT FIND ADMIN"); 
                x.printStackTrace(); 
            }
            
            
            JOptionPane.showMessageDialog(this.myComplaintsUI, "Created Complaint: " + complaint.toString(), "Complaint", JOptionPane.DEFAULT_OPTION);
            myComplaintsUI.setInvolved("");
            myComplaintsUI.setDescription("");
          
            listOfComplaints.add(complaint);
            complaintList.writeComplaintListFile();
            complaintList.printComplaintList();
            
          
        }
        
    }
}
