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
    private NavigationCntl navigationCntl; 
   
    public ComplaintCntl(Employee employee) {
        myComplaintsUI = new MyComplaintsUI(this);
        myComplaintsUI.setTitle("My Complaints"); 
        myComplaintsUI.setVisible (true);
        myComplaintsUI.setBounds(10, 10, 1000, 700);
        myComplaintsUI.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        myComplaintsUI.setResizable(true);
        myComplaintsUI.getBack().addActionListener(this); 
        myComplaintsUI.getSubmit().addActionListener(this);
        this.employee = employee; 
        employeeList = new EmployeeList(); 
        complaintList = new ComplaintList(); 

    }
    
    public Integer createComplaintID(){
        Random rand = new Random();
        Integer id = rand.nextInt(1000); 
        ArrayList<Integer> employeeIDs = complaintList.getComplaintIDs(); 
        int i = 0; 
        while (i < employeeIDs.size()){
            if (id == employeeIDs.get(i)){
                id = rand.nextInt(100); 
                i = 0; 
            } else {
                i += 1; 
            }
        }
        return id; 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == myComplaintsUI.getBack()){
            myComplaintsUI.setVisible(false); 
            navigationCntl = new NavigationCntl(employee); //return to home page 
        }
        if(e.getSource() == myComplaintsUI.getSubmit()){
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
            Date date = new Date(System.currentTimeMillis());
            formatter.format(date); 
            String complaintType = (String) myComplaintsUI.getComplaintType();
            Integer i = createComplaintID(); 
              //(Integer id, String, Employee assignedEmployee, java.util.Date openDate, java.util.Date incidentDate, Employee claimant, String involved, String description, Boolean open, java.util.Date closedDate)
            Complaint complaint = new Complaint(i, complaintType, null, myComplaintsUI.getDate(), myComplaintsUI.getDate(), this.employee, myComplaintsUI.getInvolved(), myComplaintsUI.getDescription(), true, null);
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
            myComplaintsUI.setType(""); 
            myComplaintsUI.setDate(""); 
          
            complaintList.getcomplaintList().add(complaint);
            complaintList.writecomplaintListFile();
            complaintList.printcomplaintList();
            
          
        }
        
    }
}
