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
    private EmployeeList employeeList; 
    private Employee tempEmployee; 

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
        supervisorComplaintUI.getSearchBtn().addActionListener(this);
        
        complaintList = new ComplaintList(); 
        listOfComplaints = complaintList.getComplaintList(); 
        complaintList.printComplaintList(); 

        this.employee = employee; 
        System.out.println(this.employee); 
        assignedComplaints = new ArrayList<Complaint>(); 
        employeeList = new EmployeeList(); 

        updateAssignedComplaints(); 
            supervisorComplaintUI.setTextField(this.assignedComplaints.toString()); 
        
    }

    public void updateAssignedComplaints(){
        for (Complaint complaint: listOfComplaints){
            //System.out.println(complaint.getAssignedEmployee());
            if ( (complaint.getAssignedEmployee()).equals(this.employee) ){
                this.assignedComplaints.add(complaint);
            }
        }

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == supervisorComplaintUI.getBack()){
            supervisorComplaintUI.setVisible(false); 
            supervisorNavCntl = new SupervisorNavCntl(employee); //return to home page 
        }
        //TODO START HERE NEXT TIME so we can assign complaints to people 
        if (e.getSource() == supervisorComplaintUI.getAssignEmployeeBtn()){
            if (tempEmployee != null){
                this.assignedComplaints.get(0).setAssignedEmployee(tempEmployee);
                complaintList.writeComplaintListFile();
                JOptionPane.showMessageDialog(this.supervisorComplaintUI, "Assigned "+ tempEmployee.getFirstName() + " to " + this.assignedComplaints.get(0), "Handle Complaints", JOptionPane.ERROR_MESSAGE);
                updateAssignedComplaints();
                System.out.println("Assigned Employee"); 
            }  
            else {
                JOptionPane.showMessageDialog(this.supervisorComplaintUI, "Search for an employee", "Handle Complaints", JOptionPane.ERROR_MESSAGE);
            }          
        }

        if (e.getSource() == supervisorComplaintUI.getSearchBtn()){
            Boolean found = false; 
            for (Employee emp : employeeList.getemployeeList()){
                if (supervisorComplaintUI.getEmployeeName().equalsIgnoreCase(emp.getLastName()) && emp.getRole().equalsIgnoreCase("Supervisor")){
                    if (supervisorComplaintUI.getEmployeeName().equalsIgnoreCase(emp.getLastName()) && emp.getRole().equalsIgnoreCase("Supervisor") && supervisorComplaintUI.getEmployeeID().equals((emp.getEmployeeID()))){
                        System.out.println("Found"); 
                        supervisorComplaintUI.setEmployeeInfo(emp.toString());
                        tempEmployee = emp; 
                        found = true; 
                        break; 
                    } 
                } 

                else if (supervisorComplaintUI.getEmployeeName().equalsIgnoreCase(employee.getLastName()) && employee.getRole().equals("Employee")){
                    JOptionPane.showMessageDialog(this.supervisorComplaintUI, "Employee Must be a Supervisor to be assinged to handle a complaint", "Handle Complaints", JOptionPane.ERROR_MESSAGE);
                } 
            }
            if(!found){
                JOptionPane.showMessageDialog(this.supervisorComplaintUI, "Cannot Find Employee with those credentials", "Handle Complaints", JOptionPane.ERROR_MESSAGE);
            }
        
            if (supervisorComplaintUI.getEmployeeName().equals("")){
                JOptionPane.showMessageDialog(this.supervisorComplaintUI, "No Matches", "Handle Complaints", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }
}
