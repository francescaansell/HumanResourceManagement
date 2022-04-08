package view;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;

import controller.*; 

public class SupervisorHomeUI extends JFrame{
    private JButton vacationApproval;
    private JButton hoursApproval;
    private JButton complaints;
    private JButton onboardEmployee;
    private JButton logOut; 

    public SupervisorHomeUI(SupervisorNavCntl supervisorNavCntl){

        //construct components
        vacationApproval = new JButton ("Vacation Approval");
        hoursApproval = new JButton ("Hours Approval");
        complaints = new JButton ("Handle Complaints");
        onboardEmployee = new JButton ("Onbaord Employee");
        logOut = new JButton ("Log Out"); 

        //adjust size and set layout
        setPreferredSize (new Dimension (816, 589));
        setLayout (null);

        //add components
        add (vacationApproval);
        add (hoursApproval);
        add (complaints);
        add (onboardEmployee);
        add (logOut); 

        //set component bounds (only needed by Absolute Positioning)

        logOut.setBounds(5, 5, 100, 100);

        vacationApproval.setBounds (160, 320, 235, 140);
        hoursApproval.setBounds (155, 120, 235, 140);
        complaints.setBounds (475, 120, 235, 140);
        onboardEmployee.setBounds (475, 320, 235, 140);
    }

    public JButton getVacationApprButton(){
        return vacationApproval; 
    }
    public JButton getLogOutBtn(){
        return logOut; 
    }
    public JButton getOnboardEmployeeBtn(){
        return onboardEmployee; 
    }
    public JButton getComplaintsBtn(){
        return complaints; 
    }
  


}
