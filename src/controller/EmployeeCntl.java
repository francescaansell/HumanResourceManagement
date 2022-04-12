package controller;
import view.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import model.*;

public class EmployeeCntl implements ActionListener{

    public Employee employee; 
    public EmployeeUI employeeUI; 

    
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
        employeeUI.setRoleField(employee.getRole());
        employeeUI.setFullTime(employee.getFullTime());
        employeeUI.getBackBtn().addActionListener(this); 
        employeeUI.getUpdateBtn().addActionListener(this);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == employeeUI.getUpdateBtn()){
            
        }
    }
    
}
