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
    public JTextField textField; 
    private JLabel firstName;
    private JTextField firstNameField;
    private JLabel lastName;
    private JTextField lastNameField;
    private JLabel id;
    private JTextField idField;

    public OnboardEmployeeUI(OnboardCntl onboardCntl){
               
        //construct preComponents
   
        //String[] pendingEmployees = {"Ex", "Ex", "Ex"}; 
        //jList = new JList(pendingEmployees);
        getPendingEmployees = new JButton("Get Employee"); 
        chooseEmployee = new JLabel ("Enter an employees last name to search for their pending account");
        textField = new JTextField(); 
        firstName = new JLabel ("First Name");
        firstNameField = new JTextField (5);
        lastName = new JLabel ("Last Name");
        lastNameField = new JTextField (5);
        id = new JLabel ("ID");
        idField = new JTextField (5);

        //adjust size and set layout
        setPreferredSize (new Dimension (816, 589));
        setLayout (null);

        //add components
        //add (jList);
        add (chooseEmployee);
        add (getPendingEmployees);
        add (textField); 
        add (firstName);
        add (firstNameField);
        add (lastName);
        add (lastNameField);
        add (id);
        add (idField);



        //set component bounds (only needed by Absolute Positioning)
        textField.setBounds (25, 55, 125, 125);
        chooseEmployee.setBounds (25, 15, 380, 30);
        getPendingEmployees.setBounds (25, 300, 390, 30);
        firstName.setBounds (625, 20, 100, 25);
        firstNameField.setBounds (625, 50, 100, 25);
        lastName.setBounds (625, 85, 100, 25);
        lastNameField.setBounds (625, 120, 100, 25);
        id.setBounds (625, 165, 100, 25);
        idField.setBounds (625, 200, 100, 25);
    }

    /*
    public JList getJList(){
        return jList;
    }
    public void setJList(JList jList){
        this.jList =jList; 
    }
    */
    public JButton getJButton(){
        return getPendingEmployees; 
    }
    public JTextField getTextField(){
        return textField; 
    }
    public JTextField getFirstNameField(){
        return firstNameField; 
    }
    public JTextField getLastNameField(){
        return lastNameField; 
    }
    public void setFirstNameField(String str){
        this.firstNameField.setText(str);
    }
    public void setLastNameField(String str){
        this.lastNameField.setText(str);
    }
    public void setTextField(String str){
        this.textField.setText(str); 
    }
 
}

