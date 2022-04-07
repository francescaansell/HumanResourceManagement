package controller;

import javax.swing.JFrame;
import javax.swing.JList;

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
        onboardEmployeeUI.getPendingEmployees.addActionListener(this);

        employeeList = new EmployeeList(); 
        listOfEmployees = employeeList.getemployeeList(); 

    }

    @Override 
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == onboardEmployeeUI.getJButton()){
            for (Employee employee : employeeList.getemployeeList()){
                if (employee.getRole().equalsIgnoreCase("Pending") && onboardEmployeeUI.getTextField().getText().equalsIgnoreCase(employee.getLastName())){
                    onboardEmployeeUI.setFirstNameField(employee.getFirstName());
                    onboardEmployeeUI.setLastNameField(employee.getLastName());
                    onboardEmployeeUI.setTextField(employee.toString());
                } 
            }//end for
        }
    }
}




