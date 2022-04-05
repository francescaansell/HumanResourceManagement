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
    
    public UserList userList; 
    public Employee employee;
    public EmployeeUI employeeUI;  
    public ArrayList<Employee> listOfUsers; 
    
    public EmployeeCntl() {
        employeeUI = new EmployeeUI(this); 
        employeeUI.setTitle("New Employee Form");
        employeeUI.setVisible(true);
        employeeUI.setBounds(10, 10, 370, 600);
        employeeUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        employeeUI.setResizable(true);
        employeeUI.submit.addActionListener(this); 

        userList = new UserList();
        //listOfUsers = userList.getUserList(); 
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

            //listOfUsers.add(employee);
            userList.getUserList().add(employee); 
            userList.writeUserListFile(); 
           
            //New User Does show up in this list 
            userList.printUserList();

            employeeUI.setVisible(false);

            NavigationCntl navCntl = new NavigationCntl(); 
 
        }
    }
 }

