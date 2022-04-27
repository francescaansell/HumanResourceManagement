package controller; 
import view.*;
import model.*; 
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
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
        supervisorComplaintUI.setBounds(10, 10, 1000, 900);
        supervisorComplaintUI.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        supervisorComplaintUI.setResizable(true);
        supervisorComplaintUI.getBack().addActionListener(this); 
        supervisorComplaintUI.getRetrieveComplaintsBtn().addActionListener(this);
        supervisorComplaintUI.getAssignEmployeeBtn().addActionListener(this); 
        supervisorComplaintUI.getSearchBtn().addActionListener(this);
        supervisorComplaintUI.getTypePicker().addActionListener(this);
        supervisorComplaintUI.getFilterOpenBox().addActionListener(this); 
       
        
        complaintList = new ComplaintList(); 
        listOfComplaints = complaintList.getcomplaintList();  
        complaintList.printcomplaintList();

        this.user = u; 
        //System.out.println(this.user); 
        assignedComplaints = new ArrayList<Complaint>(); 
        employeeList = new EmployeeList(); 

        updateAssignedComplaints(); 
        formatComplaintList();
        
    }

    public void updateAssignedComplaints(){
        for (Complaint complaint: listOfComplaints){
            if ( (complaint.getAssignedEmployee()).equals(this.user) ){
                this.assignedComplaints.add(complaint);
            }
        }

    }

    public void formatComplaintList(){
        ArrayList<Complaint> filteredList = new ArrayList<>(); 
        for (Complaint complaint: assignedComplaints){
            if(supervisorComplaintUI.getComplaintType().equals("") && !supervisorComplaintUI.getFilterOpen().equals("")){ // filter only open 
                if(complaint.formatOpen().equals((supervisorComplaintUI.getFilterOpen()))){
                    filteredList.add(complaint);
                } 
            } if (!supervisorComplaintUI.getComplaintType().equals("") && supervisorComplaintUI.getFilterOpen().equals("")) { //filter by only type
                if(complaint.getType().equals(supervisorComplaintUI.getComplaintType())){ 
                    filteredList.add(complaint);
                }  
            } if (!supervisorComplaintUI.getComplaintType().equals("") && !supervisorComplaintUI.getFilterOpen().equals("")) { //filter by both
                if(complaint.getType().equals(supervisorComplaintUI.getComplaintType()) && (complaint.formatOpen().equals(supervisorComplaintUI.getFilterOpen()))){ 
                    filteredList.add(complaint);
                } 
            } if (supervisorComplaintUI.getComplaintType().equals("") && supervisorComplaintUI.getFilterOpen().equals("")) { //no filters applied
                    filteredList.add(complaint);
            } 
        } 
        String formated = "";
        if (filteredList.size() > 0){
            for (Complaint c: filteredList){
                formated = formated + c.toString() + "\n" + "----------------------------------------------------------------------" + "\n";
            }
            supervisorComplaintUI.setTextField(formated);
        } else {
            supervisorComplaintUI.setTextField("No Complaints that match that status are assigned to you");
        
            System.out.println("No Complaints that match that status are assigned to you");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == supervisorComplaintUI.getBack()){
            supervisorComplaintUI.dispose(); 
            SupervisorNavCntl supervisorNavCntl = new SupervisorNavCntl(this.user); //return to home page 
        }
        if (e.getSource() == supervisorComplaintUI.getAssignEmployeeBtn()){ //update complaint
            Boolean sucess = false;  
            Complaint tempComplaint = null; 
            if (!this.assignedComplaints.isEmpty() && supervisorComplaintUI.getComplaintID() != null){
                for (Complaint complaint : this.assignedComplaints){
                    if(complaint.getId().equals(supervisorComplaintUI.getComplaintID())){
                        //System.out.println("IDs match"); 
                        tempComplaint = complaint; 

                        Boolean found = false; 
                        for (Employee employee : employeeList.getemployeeList()){
                            if (employee.getRole().equalsIgnoreCase("Supervisor") && supervisorComplaintUI.getEmployeeID().equals((employee.getEmployeeID()))){
                                System.out.println("Found Employee"); 
                                //supervisorComplaintUI.setEmployeeInfo(employee.toString());
                                tempEmployee = employee; 
                                found = true; 
                                break; 
                            } 
                            
                            else if (supervisorComplaintUI.getEmployeeID().equalsIgnoreCase(employee.getEmployeeID()) && employee.getRole().equals("Employee")){
                                JOptionPane.showMessageDialog(this.supervisorComplaintUI, "Employee Must be a Supervisor to be assinged to handle a complaint", "Handle Complaints", JOptionPane.ERROR_MESSAGE);
                                found = true; 
                                supervisorComplaintUI.setEmployeeID("");
                                supervisorComplaintUI.setEmployeeInfo("");
                                sucess = false; 
                                return;  
                            } 
                        }



                        // if(!found){
                        //     JOptionPane.showMessageDialog(this.supervisorComplaintUI, "Cannot Find Employee with those credentials", "Handle Complaints", JOptionPane.ERROR_MESSAGE);
                        //     supervisorComplaintUI.setEmployeeID("");
                        //     supervisorComplaintUI.setEmployeeInfo("");
                        //     return; 

                        // }

                        if(supervisorComplaintUI.getDate() != null){
                            complaint.setOpenDate(supervisorComplaintUI.getDate()); 
                        } else if(!supervisorComplaintUI.getInvolved().equals("")){
                            complaint.setInvolved(supervisorComplaintUI.getInvolved());
                        } else if(tempEmployee != null){
                            complaint.setAssignedEmployee(tempEmployee);
                        }  
                        else if(!supervisorComplaintUI.getDescriptoin().equals("")){
                            complaint.setDescription(supervisorComplaintUI.getDescriptoin()); 
                        }
                        if(supervisorComplaintUI.getClosed().equals("Closed") && complaint.formatOpen().equals("Open")){ //closes a previously open complaint and adds a close date 
                            
                            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
                            java.util.Date date = new java.util.Date(System.currentTimeMillis());
                            formatter.format(date); 
                            complaint.setClosedDate(date);
                            complaint.setOpen(false); 
                        
                        } else if (supervisorComplaintUI.getClosed().equals("Open") && complaint.formatOpen().equals("Closed")){ //opens a previously closed complaints and removes closed date
                            SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
                            java.util.Date date = new java.util.Date(System.currentTimeMillis());
                            formatter.format(date); 
                            complaint.setOpenDate(date);
                            complaint.setClosedDate(null);
                            complaint.setOpen(true); 
                        }
                        sucess = true; 

                    }// end of if(complaint.getId().equals(supervisorComplaintUI.getComplaintID())){ 

                    }// end of for (Complaint complaint : this.assignedComplaints){
                }// end of if (!this.assignedComplaints.isEmpty() && supervisorComplaintUI.getComplaintID() != null){
                if (sucess){
                    complaintList.writecomplaintListFile();
                        JOptionPane.showMessageDialog(this.supervisorComplaintUI, "Updated Complaint "+  tempComplaint, "Handle Complaints", JOptionPane.INFORMATION_MESSAGE);
                        updateAssignedComplaints();
                        System.out.println("Updated Complaint"); 
                        supervisorComplaintUI.dispose(); 
                        supervisorComplaintCntl = new SupervisorComplaintCntl(this.user); 
                        return; 
                }
              
                System.out.println("Compalint IDs do not match");
                JOptionPane.showMessageDialog(this.supervisorComplaintUI, "Error, Fill out all required Fields", "Handle Complaints", JOptionPane.ERROR_MESSAGE);
    
        }///////////end of update complaint

        if (e.getSource() == supervisorComplaintUI.getTypePicker()){
            formatComplaintList();    
        }
        if (e.getSource() == supervisorComplaintUI.getFilterOpenBox()){
            formatComplaintList();
        }
    }
}