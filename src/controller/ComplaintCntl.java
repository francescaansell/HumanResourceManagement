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
        listOfComplaints = complaintList.getcomplaintList(); 
    }

    public Integer createComplaintID(){
        ComplaintList complaintList = new ComplaintList(); 
        Random rand = new Random();
        Integer id = rand.nextInt(1000); 
        ArrayList<Integer> employeeIDs = complaintList.getComplaintIDs(); 
        int i = 0; 
        while (i < employeeIDs.size()){
            if (id == employeeIDs.get(i)){
                id = rand.nextInt(1000); 
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
            NavigationCntl navigationCntl = new NavigationCntl(employee); //return to home page 
        }
        if(e.getSource() == myComplaintsUI.getSubmit()){
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
            Random rand = new Random();
            Date date = new Date(System.currentTimeMillis());
            formatter.format(date); 
            String complaintType = (String) myComplaintsUI.getComplaintType();
            Integer i = 0; 
            Complaint complaint = new Complaint(i, complaintType, null, date, myComplaintsUI.getDate(), employee, true, false, myComplaintsUI.getInvolved(), myComplaintsUI.getDescription());

            //TODO Change involved to ArrayList<Employee> at some point if possible
          
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
            myComplaintsUI.resetDate(); 
          
            listOfComplaints.add(complaint);
            complaintList.writecomplaintListFile();
            complaintList.printcomplaintList();
            
          
        }
        
    }
}
