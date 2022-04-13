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
    public Employee employee; 
    public EmployeeList employeeList; 

    public OnboardCntl(Employee employee){
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
                
                if (onboardEmployeeUI.getEmployeeName().equalsIgnoreCase(employee.getLastName()) && onboardEmployeeUI.getChooseEmployeeID().equals(employee.getEmployeeID())){
                    onboardEmployeeUI.setFirstNameField(employee.getFirstName());
                    onboardEmployeeUI.setLastNameField(employee.getLastName());
                    onboardEmployeeUI.setIDField(employee.getEmployeeID());
                    onboardEmployeeUI.setDepartmentField(employee.getDepartmentName());
                    onboardEmployeeUI.setRole(employee.getRole());
                    onboardEmployeeUI.setPayScale(employee.getPayScale());
                    System.out.println("Found"); 
                }
            }
            if (onboardEmployeeUI.getFirstNameField().getText().equals("")){
                JOptionPane.showMessageDialog(this.onboardEmployeeUI, "No Matches", "Onboard Employee", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (e.getSource() == onboardEmployeeUI.getApproveBtn()){
            for (Employee employee : employeeList.getemployeeList()){
                //TODO add id check
                if (onboardEmployeeUI.getEmployeeName().equalsIgnoreCase(employee.getLastName()) && onboardEmployeeUI.getChooseEmployeeID().equals(employee.getEmployeeID())){
                    employee.setRole(onboardEmployeeUI.getRoleField().getText());
                    employee.setDepartment(onboardEmployeeUI.getDepartment());
                    employee.setPayScale(onboardEmployeeUI.getPayScale());
                    employeeList.writeEmployeeListFile();
                    System.out.println("Updated Employee Information"); 
                    JOptionPane.showMessageDialog(this.onboardEmployeeUI, "Updated Employee Information: " + employee.toString(), "Onboard Employee", JOptionPane.DEFAULT_OPTION);
                } 
            }
        }
        if(e.getSource() == onboardEmployeeUI.getBackBtn()){
            onboardEmployeeUI.setVisible(false); 
            SupervisorNavCntl supervisorNavCntl = new SupervisorNavCntl(employee); //return to home page 
        }
    }
}




