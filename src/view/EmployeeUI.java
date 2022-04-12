package view;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import controller.*;
import model.Employee;

public class EmployeeUI extends JFrame {
    private JLabel firstName ;
    private JLabel lastName;
    private JTextField firstNameField;
    private JLabel employeeId;
    private JLabel supervisor;
    private JLabel fullTime;
    private JLabel payScale;
    private JLabel address;
    private JLabel role;
    private JLabel username;
    private JLabel password;
    private JTextField lastNameField;
    private JTextField employeeIdField;
    private JTextField supervisorField;
    private JCheckBox fullTimeField;
    private JTextField payScaleField;
    private JTextField addressField;
    private JTextField roleField;
    private JTextField userNameField;
    private JTextField passwordField;
    private JButton backBtn; 
    private JButton updateBtn; 

    public EmployeeUI(EmployeeCntl employeeCntl) {
        //construct components
        firstName  = new JLabel ("First Name: ");
        lastName = new JLabel ("Last Name: ");
        firstNameField = new JTextField (5);
        employeeId = new JLabel ("Employee Id: ");
        supervisor = new JLabel ("Supervisor: ");
        fullTime = new JLabel ("Full Time");
        payScale = new JLabel ("Pay Scale: ");
        address = new JLabel ("Address: ");
        role = new JLabel ("Role: ");
        username = new JLabel ("Username: ");
        password = new JLabel ("Password: ");
        lastNameField = new JTextField (5);
        employeeIdField = new JTextField (5);
        supervisorField = new JTextField (5);
        fullTimeField = new JCheckBox();
        payScaleField = new JTextField (5);
        addressField = new JTextField (5);
        roleField = new JTextField (5);
        userNameField = new JTextField (5);
        passwordField = new JTextField (5);
        backBtn = new JButton("Back"); 
        updateBtn = new JButton("Update"); 

        //adjust size and set layout
        setPreferredSize (new Dimension (816, 589));
        setLayout (null);

        //add components
        add (firstName );
        add (lastName);
        add (firstNameField);
        add (employeeId);
        add (supervisor);
        add (fullTime);
        add (payScale);
        add (address);
        add (role);
        add (username);
        add (password);
        add (lastNameField);
        add (employeeIdField);
        add (supervisorField);
        add (fullTimeField);
        add (payScaleField);
        add (addressField);
        add (roleField);
        add (userNameField);
        add (passwordField);
        add (backBtn);
        add (updateBtn);

        //set component bounds (only needed by Absolute Positioning)
        firstName .setBounds (25, 170, 100, 25);
        firstNameField.setBounds (105, 170, 170, 25);

        lastName.setBounds (25, 215, 100, 25);
        lastNameField.setBounds (105, 215, 170, 25);

        employeeId.setBounds (25, 260, 100, 25);
        employeeIdField.setBounds (105, 260, 170, 25);

        supervisor.setBounds (25, 305, 100, 25);
        supervisorField.setBounds (105, 305, 170, 25);

        fullTime.setBounds (25, 350, 100, 25);
        //fullTimeField.setBounds (105, 350, 170, 25);

        payScale.setBounds (25, 395, 100, 25);
        payScaleField.setBounds (105, 395, 170, 25);

        address.setBounds (25, 435, 100, 25);
        addressField.setBounds (105, 435, 170, 25);

        role.setBounds (25, 475, 100, 25);
        roleField.setBounds (105, 475, 170, 25);

        username.setBounds (360, 170, 100, 25);
        userNameField.setBounds (445, 170, 195, 25);

        password.setBounds (360, 205, 100, 25);
        passwordField.setBounds (445, 205, 195, 25);
                
        backBtn.setBounds(5, 5, 100, 50); ;
        updateBtn.setBounds(360, 475, 170, 25); 
    }

    public void setFirstNameField(String str){
        firstNameField.setText(str);
    }
    public void setLastNameField(String str){
        lastNameField.setText(str);
    }
    public void setEmployeeIdField(int i){
        employeeIdField.setText("" + i);
    }
    public void setRoleField(String str){
        roleField.setText(str);
    }
    public void setUsernameField(String str){
        userNameField.setText(str);
    }
    public void setSupervisorField(Employee employee){
        supervisorField.setText(employee.toString());   
    }
    public void setPasswordField(String str){
        passwordField.setText(str); 
    }
    public void setFullTime(Boolean b){
        fullTime.setVisible(b);
    }
    public void setAddressField(String str){
        addressField.setText(str);
    }
    public JButton getBackBtn(){
        return backBtn; 
    }
    public JButton getUpdateBtn(){
        return updateBtn; 
    }
    public String getAddress(){
        return addressField.getText(); 
    }
}
