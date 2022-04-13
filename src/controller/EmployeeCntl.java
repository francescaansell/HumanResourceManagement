package controller;
import view.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import model.*;

public class EmployeeCntl implements ActionListener{

    private Employee employee; 
    private EmployeeUI employeeUI; 
    private NavigationCntl navigationCntl; 

    
    public EmployeeCntl(Employee employee){
        employeeUI = new EmployeeUI(this);
        employeeUI.setTitle("Supervisor Home Page");
        employeeUI.setVisible(true);
        employeeUI.setBounds(10, 10, 1000, 600);
        employeeUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        employeeUI.setResizable(true);

        this.employee = employee; 
        employeeUI.setFirstNameField(employee.getFirstName());
        employeeUI.setLastNameField(employee.getLastName());
        employeeUI.setEmployeeIdField(employee.getEmployeeID());
        employeeUI.setUsernameField(employee.getUserName());
        employeeUI.setPasswordField(employee.getPw());
        employeeUI.setAddressField(employee.getAddress());
        employeeUI.setRoleField(employee.getRole());
        employeeUI.setFullTime(employee.getFullTime());
        employeeUI.getBackBtn().addActionListener(this); 
        employeeUI.getUpdateBtn().addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == employeeUI.getUpdateBtn()){
            System.out.println(employee.getAddress());
            employee.setAddress(employeeUI.getAddress());
            System.out.println(employee.getAddress());
            
        }
        if(e.getSource() == employeeUI.getBackBtn()){
            employeeUI.setVisible(false);
            navigationCntl = new NavigationCntl(employee);
        }

    }
    
}
