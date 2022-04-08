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
    public EmployeeList employeeList;
    public JList jList; 
    public JButton getPendingEmployees; 
    public JTextField employeeNameField; 
    private JLabel firstName;
    public JTextField firstNameField;
    private JLabel lastName;
    public JTextField lastNameField;
    private JLabel id;
    private JTextField idField;
    public JButton approve; 
    public JTextField roleField; 
    public JButton back; 
    public JLabel role; 

    public OnboardEmployeeUI(OnboardCntl onboardCntl){
               
        //construct preComponents
   
        //String[] pendingEmployees = {"Ex", "Ex", "Ex"}; 
        //jList = new JList(pendingEmployees);
        getPendingEmployees = new JButton("Get Employee"); 
        chooseEmployee = new JLabel ("Enter an employees last name to search for their pending account");
        employeeNameField = new JTextField(); 
        firstName = new JLabel ("First Name");
        firstNameField = new JTextField (5);
        lastName = new JLabel ("Last Name");
        lastNameField = new JTextField (5);
        id = new JLabel ("ID");
        idField = new JTextField (5);
        approve = new JButton ("Approve"); 
        role = new JLabel ("Role"); 
        roleField = new JTextField(); 
        back = new JButton("Back"); 



        //adjust size and set layout
        setPreferredSize (new Dimension (816, 589));
        setLayout (null);

        //add components
        //add (jList);
        add (chooseEmployee);
        add (getPendingEmployees);
        add (employeeNameField); 
        add (firstName);
        add (firstNameField);
        add (lastName);
        add (lastNameField);
        add (id);
        add (idField);
        add (approve); 
        add (roleField); 
        add (back); 
        add (role);




        //set component bounds (only needed by Absolute Positioning)

        back.setBounds(5, 5, 100, 100);

        chooseEmployee.setBounds (5, 120, 400, 10); //Label
        employeeNameField.setBounds (5, 140, 125, 25);

        getPendingEmployees.setBounds (25, 300, 390, 30); //Buttons
        approve.setBounds (25, 340, 390, 30); //Buttons
        
        firstName.setBounds (625, 20, 100, 25);
        firstNameField.setBounds (625, 50, 100, 25);

        lastName.setBounds (625, 85, 100, 25);
        lastNameField.setBounds (625, 120, 100, 25);

        id.setBounds (625, 165, 100, 25);
        idField.setBounds (625, 200, 100, 25);

        role.setBounds(625, 260, 100, 25);
        roleField.setBounds (625, 290, 165, 20);

        
    }

    /*
    public JList getJList(){
        return jList;
    }
    public void setJList(JList jList){
        this.jList =jList; 
    }
    */

    public void setFirstNameField(String str){
        this.firstNameField.setText(str);
    }
    public void setLastNameField(String str){
        this.lastNameField.setText(str);
    }
    public void setTextField(String str){
        this.employeeNameField.setText(str); 
    }

 
}

