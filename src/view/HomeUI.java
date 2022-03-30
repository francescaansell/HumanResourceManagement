package view;

import model.*;

import java.awt.Dimension;
import java.util.*;

import javax.swing.JButton;
import javax.swing.JFrame;

import controller.NavigationCntl; 

public class HomeUI extends JFrame{
    private JButton MyVacation;
    private JButton MyHours;
    private JButton MyComplaints;
    private JButton Employee;

    public HomeUI(NavigationCntl navCntl){
    //construct components
    MyVacation = new JButton ("MyVacation");
    MyHours = new JButton ("MyHours");
    MyComplaints = new JButton ("MyComplaints");
    Employee = new JButton ("Employee");

    //adjust size and set layout
    setPreferredSize (new Dimension (816, 589));
    setLayout (null);

    //add components
    add (MyVacation);
    add (MyHours);
    add (MyComplaints);
    add (Employee);

    //set component bounds (only needed by Absolute Positioning)
    MyVacation.setBounds (160, 320, 235, 140);
    MyHours.setBounds (155, 120, 235, 140);
    MyComplaints.setBounds (475, 120, 235, 140);
    Employee.setBounds (475, 320, 235, 140);
}
}


