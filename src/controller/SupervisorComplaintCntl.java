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
    private Employee user; 
    private ComplaintList complaintList; 
    private SupervisorNavCntl supervisorNavCntl; 
    private SupervisorComplaintCntl supervisorComplaintCntl; 
    private ArrayList<Complaint> assignedComplaints; 
    private ArrayList<Complaint> listOfComplaints; 
    private EmployeeList employeeList; 
    private Employee tempEmployee; 

    public SupervisorComplaintCntl(Employee u) {
        supervisorComplaintUI = new SupervisorComplaintUI(this);
        supervisorComplaintUI.setTitle("Handle Complaints"); 
        supervisorComplaintUI.setVisible (true);
        supervisorComplaintUI.setBounds(10, 10, 1000, 600);
        supervisorComplaintUI.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        supervisorComplaintUI.setResizable(true);
        supervisorComplaintUI.getBack().addActionListener(this); 
        supervisorComplaintUI.getRetrieveComplaintsBtn().addActionListener(this);
        supervisorComplaintUI.getAssignEmployeeBtn().addActionListener(this); 
        supervisorComplaintUI.getSearchBtn().addActionListener(this);
        supervisorComplaintUI.getTypePicker().addActionListener(this);
        
        complaintList = new ComplaintList(); 
        listOfComplaints = complaintList.getcomplaintList();  
        complaintList.printcomplaintList();

        this.user = u; 
        System.out.println(this.user); 
        assignedComplaints = new ArrayList<Complaint>(); 
        employeeList = new EmployeeList(); 

        updateAssignedComplaints(); 
        String formated = "";
        for (Complaint c: assignedComplaints){
            formated = formated + c.toString() + "\r\n";
        }
        if (!formated.isEmpty()){
            supervisorComplaintUI.setTextField(formated);
            System.out.println(formated); 
             
        } else {
            supervisorComplaintUI.setTextField("No currrent complaints assigned to you");
            System.out.println("No currrent complaints assigned to you");
            
        }
    }

    public void updateAssignedComplaints(){
        for (Complaint complaint: listOfComplaints){
            //System.out.println(complaint.getAssignedEmployee());
            if ( (complaint.getAssignedEmployee()).equals(this.user) ){
                this.assignedComplaints.add(complaint);
            }
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == supervisorComplaintUI.getBack()){
            supervisorComplaintUI.setVisible(false); 
            supervisorNavCntl = new SupervisorNavCntl(this.user); //return to home page 
        }
        if (e.getSource() == supervisorComplaintUI.getAssignEmployeeBtn()){
            Complaint tempComplaint = null; 
            if (tempEmployee != null && !this.assignedComplaints.isEmpty()){
                this.assignedComplaints.get(0).setAssignedEmployee(tempEmployee);
                for (Complaint complaint : this.assignedComplaints){
                    if(complaint.getId().equals(supervisorComplaintUI.getComplaintID())){
                        System.out.println("IDs match"); 
                        tempComplaint = complaint; 
                    } else {
                        System.out.println("IDs do not match");
                    }
                }
            
                complaintList.writecomplaintListFile();
                JOptionPane.showMessageDialog(this.supervisorComplaintUI, "Assigned "+ tempEmployee.getFirstName() + " to " + tempComplaint, "Handle Complaints", JOptionPane.INFORMATION_MESSAGE);
                updateAssignedComplaints();
                System.out.println("Assigned Employee"); 
                supervisorComplaintUI.dispose(); 
                supervisorComplaintCntl = new SupervisorComplaintCntl(this.user);    
            }  
            else {
                JOptionPane.showMessageDialog(this.supervisorComplaintUI, "Search for an employee or Make sure you have complaints assigned to you", "Handle Complaints", JOptionPane.ERROR_MESSAGE);
            }          
        }

        if (e.getSource() == supervisorComplaintUI.getSearchBtn()){
            Boolean found = false; 
            for (Employee employee : employeeList.getemployeeList()){
                if (employee.getRole().equalsIgnoreCase("Supervisor")){
                    if (employee.getRole().equalsIgnoreCase("Supervisor") && supervisorComplaintUI.getEmployeeID().equals((employee.getEmployeeID()))){
                        System.out.println("Found"); 
                        supervisorComplaintUI.setEmployeeInfo(employee.toString());
                        tempEmployee = employee; 
                        found = true; 
                        break; 
                    } 
                } 
                else if (supervisorComplaintUI.getEmployeeID().equalsIgnoreCase(employee.getEmployeeID()) && employee.getRole().equals("Employee")){
                    JOptionPane.showMessageDialog(this.supervisorComplaintUI, "Employee Must be a Supervisor to be assinged to handle a complaint", "Handle Complaints", JOptionPane.ERROR_MESSAGE);
                    found = true; 
                    supervisorComplaintUI.setEmployeeID("");
                    supervisorComplaintUI.setEmployeeInfo("");
                } 
            }
            if(!found){
                JOptionPane.showMessageDialog(this.supervisorComplaintUI, "Cannot Find Employee with those credentials", "Handle Complaints", JOptionPane.ERROR_MESSAGE);
                supervisorComplaintUI.setEmployeeID("");
                supervisorComplaintUI.setEmployeeInfo("");
            }
        }
        if (e.getSource() == supervisorComplaintUI.getTypePicker()){
            ArrayList<Complaint> complaintType = new ArrayList<>(); 
            for (Complaint complaint : this.assignedComplaints){
                if(complaint.getType().equals(supervisorComplaintUI.getComplaintType())){
                    complaintType.add(complaint);
                } 
            }
            String formated = ""; 
            for (Complaint c: complaintType){
                formated = formated + c.toString() + "\r\n";
            }
            if (!formated.isEmpty()){
                supervisorComplaintUI.setTextField(formated);
                System.out.println(formated); 
                 
            } else {
                supervisorComplaintUI.setTextField("No Complaints that match that type");
                System.out.println("No Complaints that match that type");
                
            }
        }
    }
}
