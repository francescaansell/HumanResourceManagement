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
    private Employee user; 
    private ComplaintList complaintList; 
    private SupervisorNavCntl supervisorNavCntl; 
    private SupervisorComplaintCntl supervisorComplaintCntl; 
    private ArrayList<Complaint> assignedComplaints; 
    private ArrayList<Complaint> listOfComplaints; 
    private EmployeeList employeeList; 
    private Employee tempEmployee; 

    public SupervisorComplaintCntl(Employee user) {
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
        
        complaintList = new ComplaintList(); 
        listOfComplaints = complaintList.getComplaintList(); 
        complaintList.printComplaintList(); 

        this.user = user; 
        System.out.println(this.user); 
        assignedComplaints = new ArrayList<Complaint>(); 
        employeeList = new EmployeeList(); 

        updateAssignedComplaints(); 
        String formated = "";
        for (Complaint c: assignedComplaints){
            formated = formated + c.toString() + "\r\n";
        }
        System.out.println(formated); 
        supervisorComplaintUI.setTextField(formated); 
        
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
            supervisorNavCntl = new SupervisorNavCntl(user); //return to home page 
        }
        //TODO START HERE NEXT TIME so we can assign complaints to people 
        if (e.getSource() == supervisorComplaintUI.getAssignEmployeeBtn()){
            if (tempEmployee != null){
                this.assignedComplaints.get(0).setAssignedEmployee(tempEmployee);
                complaintList.writeComplaintListFile();
                JOptionPane.showMessageDialog(this.supervisorComplaintUI, "Assigned "+ tempEmployee.getFirstName() + " to " + this.assignedComplaints.get(0), "Handle Complaints", JOptionPane.INFORMATION_MESSAGE);
                updateAssignedComplaints();
                System.out.println("Assigned Employee"); 
                supervisorComplaintUI.dispose(); 
                supervisorComplaintCntl = new SupervisorComplaintCntl(user); 
                
            }  
            else {
                JOptionPane.showMessageDialog(this.supervisorComplaintUI, "Search for an employee", "Handle Complaints", JOptionPane.ERROR_MESSAGE);
            }          
        }

        if (e.getSource() == supervisorComplaintUI.getSearchBtn()){
            Boolean found = false; 
            for (Employee employee : employeeList.getemployeeList()){
                if (supervisorComplaintUI.getEmployeeName().equalsIgnoreCase(employee.getLastName()) && employee.getRole().equalsIgnoreCase("Supervisor")){
                    if (supervisorComplaintUI.getEmployeeName().equalsIgnoreCase(employee.getLastName()) && employee.getRole().equalsIgnoreCase("Supervisor") && supervisorComplaintUI.getEmployeeID().equals((employee.getEmployeeID()))){
                        System.out.println("Found"); 
                        supervisorComplaintUI.setEmployeeInfo(employee.toString());
                        tempEmployee = employee; 
                        found = true; 
                        break; 
                    } 
                } 
                //TODO should search by id instead of last name
                else if (supervisorComplaintUI.getEmployeeName().equalsIgnoreCase(employee.getLastName()) && employee.getRole().equals("Employee")){
                    JOptionPane.showMessageDialog(this.supervisorComplaintUI, "Employee Must be a Supervisor to be assinged to handle a complaint", "Handle Complaints", JOptionPane.ERROR_MESSAGE);
                    found = true; 
                    supervisorComplaintUI.setEmployeeName("");
                    supervisorComplaintUI.setEmployeeID("");
                    supervisorComplaintUI.setEmployeeInfo("");
                } 
            }
            if(!found){
                JOptionPane.showMessageDialog(this.supervisorComplaintUI, "Cannot Find Employee with those credentials", "Handle Complaints", JOptionPane.ERROR_MESSAGE);
                supervisorComplaintUI.setEmployeeName("");
                supervisorComplaintUI.setEmployeeID("");
                supervisorComplaintUI.setEmployeeInfo("");
            }
        }
    }
}
