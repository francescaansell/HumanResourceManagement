package controller;
import model.*;
import java.util.*; 
import view.EmployeeUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
/**
 *
 * @author Group1HRM
 */
public class EmployeeCntl implements ActionListener{
    
    public EmployeeList employeeList; 
    public Employee employee;
    public EmployeeUI employeeUI;  
    //public ArrayList<Employee> listOfEmployees; 
    
    public EmployeeCntl() {
        employeeUI = new EmployeeUI(this); 
        employeeUI.setTitle("New Employee Form");
        employeeUI.setVisible(true);
        employeeUI.setBounds(10, 10, 370, 600);
        employeeUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        employeeUI.setResizable(true);
        employeeUI.submit.addActionListener(this); 

        employeeList = new EmployeeList();
        //listOfEmployees = employeeList.getemployeeList(); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == employeeUI.getSubmitBtn()){
            Employee employee = new Employee(); 
            
            employee.setUserName(employeeUI.getUsername());
            employee.setPw(employeeUI.getPassword());
            employee.setFirstName(employeeUI.getFirstName());
            employee.setLastName(employeeUI.getLastName());
            employee.setFullTime(employeeUI.getFullTime());

            //listOfEmployees.add(employee);
            employeeList.getemployeeList().add(employee); 
            employeeList.writeEmployeeListFile(); 
           
            //New Employee Does show up in this list 
            employeeList.printEmployeeList();

            employeeUI.setVisible(false);

            NavigationCntl navCntl = new NavigationCntl(); 

        }
    }
 }

