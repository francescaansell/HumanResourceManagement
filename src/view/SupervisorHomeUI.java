package view;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;

import controller.*; 

public class SupervisorHomeUI extends JFrame{
    private JButton vacationApproval;
    private JButton hoursApproval;
    private JButton complaints;
    public JButton onboardEmployee;

    public SupervisorHomeUI(SupervisorNavCntl supervisorNavCntl){

        //construct components
        vacationApproval = new JButton ("Vacation Approval");
        hoursApproval = new JButton ("Hours Approval");
        complaints = new JButton ("Handle Complaints");
        onboardEmployee = new JButton ("Onbaord Employee");

        //adjust size and set layout
        setPreferredSize (new Dimension (816, 589));
        setLayout (null);

        //add components
        add (vacationApproval);
        add (hoursApproval);
        add (complaints);
        add (onboardEmployee);

        //set component bounds (only needed by Absolute Positioning)
        vacationApproval.setBounds (160, 320, 235, 140);
        hoursApproval.setBounds (155, 120, 235, 140);
        complaints.setBounds (475, 120, 235, 140);
        onboardEmployee.setBounds (475, 320, 235, 140);
    }

    public JButton getVacationApprButton(){
        return vacationApproval; 
    }


}
