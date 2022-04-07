package view;
import java.awt.Dimension;

import controller.*;
import model.*; 
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;

import javax.swing.*;
import javax.swing.event.*;
import java.io.IOException;


public class OnboardEmployeeUI extends JFrame{
   
    

    private JLabel chooseEmployee;

    public PendingEmployeeList pendingEmployeeList;


    public JList jList; 

    public OnboardEmployeeUI(OnboardCntl onboardCntl){
               
        //construct preComponents
        //int i = employeeList.getemployeeList().size(); 
        String[] strEmpl = {"Jane", "John", "Fred"};

        /*
        while (i >=0 ){
            strEmpl[i] = employeeList.getemployeeList().get(i).getUserName();
            i = i -1; 
        }
        */


        //construct components
        //jList  = new JList (employeeList.getStringList().toArray());
        System.out.println("Pending Employees ----------------------------------------");
        pendingEmployeeList.printEmployeeList();
        jList = new JList(strEmpl);
        chooseEmployee = new JLabel ("Choose an Employee to Complete their account");

        //adjust size and set layout
        setPreferredSize (new Dimension (816, 589));
        setLayout (null);

        //add components
        add (jList);
        add (chooseEmployee);

        //set component bounds (only needed by Absolute Positioning)
        jList.setBounds (25, 55, 170, 180);
        chooseEmployee.setBounds (25, 15, 345, 30);
          
    }

    public JList getJList(){
        return jList;
    }
}
