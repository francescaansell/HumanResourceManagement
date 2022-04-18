package controller;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import view.OnboardEmployeeUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.Employee;
import model.EmployeeList; 

public class OnboardCntl implements ActionListener{

    public OnboardEmployeeUI onboardEmployeeUI; 
    public Employee user; 
    public EmployeeList employeeList; 

    public OnboardCntl(Employee user){
        onboardEmployeeUI = new OnboardEmployeeUI(this);
        onboardEmployeeUI.setTitle("Onboard New Employee");
        onboardEmployeeUI.setVisible(true);
        onboardEmployeeUI.setBounds(10, 10, 1000, 600);
        onboardEmployeeUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        onboardEmployeeUI.setResizable(true);
        
        this.user = user; 
        employeeList = new EmployeeList(); 

        onboardEmployeeUI.getRetrievePendingButton().addActionListener(this);
        onboardEmployeeUI.getApproveBtn().addActionListener(this); 
        onboardEmployeeUI.getBackBtn().addActionListener(this);

    }

    @Override 
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == onboardEmployeeUI.getRetrievePendingButton()){ //If users clicks Get Employee to search for an employee
            for (Employee employee : employeeList.getemployeeList()){
                if (onboardEmployeeUI.getChooseEmployeeID().equals(employee.getEmployeeID())){
                    onboardEmployeeUI.setFirstNameField(employee.getFirstName());
                    onboardEmployeeUI.setLastNameField(employee.getLastName());
                    onboardEmployeeUI.setIDField(employee.getEmployeeID());
                    onboardEmployeeUI.setDepartmentField(employee.getDepartmentName());
                    onboardEmployeeUI.setRole(employee.getRole());
                    onboardEmployeeUI.setPayScale(employee.getPayScale());
                    onboardEmployeeUI.setSupervisorID(employee.getSupervisorID());
                    onboardEmployeeUI.setDepartmentField(employee.getDepartmentName());
                    System.out.println("Found"); 
                }
            }
            if (onboardEmployeeUI.getFirstName().equals("")){
                JOptionPane.showMessageDialog(this.onboardEmployeeUI, "No Matches", "Onboard Employee", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (e.getSource() == onboardEmployeeUI.getApproveBtn()){
            for (Employee employee : employeeList.getemployeeList()){
                if (onboardEmployeeUI.getChooseEmployeeID().equals(employee.getEmployeeID())){
                    String role = (String) onboardEmployeeUI.getRole(); 
                    employee.setRole(role);

                    String department = (String) onboardEmployeeUI.getDepartment(); 
                    employee.setDepartment(department);

                    String payscale = (String) onboardEmployeeUI.getPayScale();
                    employee.setPayScale(payscale);

                    employee.setSupervisorID(onboardEmployeeUI.getSupervsiorID());

                    employeeList.writeEmployeeListFile();
                    System.out.println("Updated Employee Information"); 
                    JOptionPane.showMessageDialog(this.onboardEmployeeUI, "Updated Employee Information: " + employee.toString(), "Onboard Employee", JOptionPane.DEFAULT_OPTION);

                    onboardEmployeeUI.dispose(); 
                    OnboardCntl onboardCntl = new OnboardCntl(user);
                    
                } 
            }
        }
        if(e.getSource() == onboardEmployeeUI.getBackBtn()){
            onboardEmployeeUI.setVisible(false); 
            SupervisorNavCntl supervisorNavCntl = new SupervisorNavCntl(user); //return to home page 
        }
    }
}




