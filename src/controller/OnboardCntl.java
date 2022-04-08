package controller;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import view.OnboardEmployeeUI;
import view.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame; 
import model.Employee;
import model.EmployeeList; 

public class OnboardCntl implements ActionListener{

    public OnboardEmployeeUI onboardEmployeeUI; 
    public ArrayList<Employee> listOfEmployees; 
    public Employee employee; 
    public EmployeeList employeeList; 

    public OnboardCntl(){
        onboardEmployeeUI = new OnboardEmployeeUI(this);
        onboardEmployeeUI.setTitle("Onboard New Employee");
        onboardEmployeeUI.setVisible(true);
        onboardEmployeeUI.setBounds(10, 10, 1000, 600);
        onboardEmployeeUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        onboardEmployeeUI.setResizable(true);
        onboardEmployeeUI.getRetrievePendingButton().addActionListener(this);
        onboardEmployeeUI.getApproveBtn().addActionListener(this); 
        onboardEmployeeUI.getBackBtn().addActionListener(this);

        employeeList = new EmployeeList(); 

    }

    @Override 
    public void actionPerformed(ActionEvent e){
        //If users clicks Get Employee to search for an employee
        if (e.getSource() == onboardEmployeeUI.getRetrievePendingButton()){
            for (Employee employee : employeeList.getemployeeList()){
                
                if (employee.getRole().equalsIgnoreCase("Pending") && onboardEmployeeUI.getEmployeeNameField().getText().equalsIgnoreCase(employee.getLastName())){
                    onboardEmployeeUI.setFirstNameField(employee.getFirstName());
                    onboardEmployeeUI.setLastNameField(employee.getLastName());
                    System.out.println("Found"); 
                }
            }
            if (onboardEmployeeUI.getFirstNameField().getText().equals("")){
                JOptionPane.showMessageDialog(this.onboardEmployeeUI, "No Matches", "Onboard Employee", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (e.getSource() == onboardEmployeeUI.getApproveBtn()){
            for (Employee employee : employeeList.getemployeeList()){
                if (employee.getRole().equalsIgnoreCase("Pending") && onboardEmployeeUI.getEmployeeNameField().getText().equalsIgnoreCase(employee.getLastName())){
                    employee.setRole(onboardEmployeeUI.getRoleField().getText());
                    employeeList.writeEmployeeListFile();
                    System.out.println("Reassinged role"); 
                } 
                if (onboardEmployeeUI.getRoleField().getText().equalsIgnoreCase(employee.getRole())){
                    JOptionPane.showMessageDialog(this.onboardEmployeeUI, "Updates Employee Information", "Onboard Employee", JOptionPane.DEFAULT_OPTION);
                }
            }
        }
        if(e.getSource() == onboardEmployeeUI.getBackBtn()){
            onboardEmployeeUI.setVisible(false); 
            SupervisorNavCntl supervisorNavCntl = new SupervisorNavCntl(); //return to home page 
        }
    }
}




