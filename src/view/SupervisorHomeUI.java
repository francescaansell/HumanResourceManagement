package view;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;

import controller.*; 

public class SupervisorHomeUI extends JFrame{
    private JButton hoursApproval;
    private JButton complaintsBtn;
    private JButton onboardEmployee;
    private JButton logOut; 
    private JButton employeePortal; 

    public SupervisorHomeUI(SupervisorNavCntl supervisorNavCntl){
        hoursApproval = new JButton ("Hours Approval");
        complaintsBtn = new JButton ("Handle Complaints");
        onboardEmployee = new JButton ("Update and Onboard Employees");
        logOut = new JButton ("Log Out"); 
        employeePortal = new JButton("Go to Employee Portal"); 

        setPreferredSize (new Dimension (816, 589));
        setLayout (null);

        add (hoursApproval);
        add (complaintsBtn);
        add (onboardEmployee);
        add (logOut); 
        add (employeePortal); 
   
        logOut.setBounds(5, 5, 100, 50);

        onboardEmployee.setBounds(195, 200, 235, 140);
        complaintsBtn.setBounds (555, 200, 235, 140);
        
        employeePortal.setBounds(800, 5, 180, 50); 
    }

    public JButton getLogOutBtn(){
        return logOut; 
    }

    public JButton getOnboardEmployeeBtn(){
        return onboardEmployee; 
    }

    public JButton getComplaintsBtn(){
        return complaintsBtn; 
    }

    public JButton getEmployeePortal(){
        return employeePortal; 
    }
}
