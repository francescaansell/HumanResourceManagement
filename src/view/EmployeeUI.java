package view;
import java.awt.*;
import javax.swing.*;
import controller.*;


public class EmployeeUI extends JFrame {
    private JLabel firstName ;
    private JLabel lastName;
    private JTextField firstNameField;
    private JLabel employeeId;
    private JLabel supervisor;
    
    private JLabel payScale;
    private JLabel address;
    private JLabel role;
    private JLabel employeeID;
    private JLabel password;
    private JTextField lastNameField;
    private JTextField employeeIdField;
    private JTextField supervisorField;
    private JTextField payScaleField;
    private JTextField addressField;
    private JTextField roleField;
    private JTextField userNameField;
    private JTextField passwordField;
    private JButton backBtn; 
    private JButton updateBtn; 


    private JLabel fullTimeLabel;
    private JTextField fullTime; 

    public EmployeeUI(EmployeeInfoCntl employeeCntl) {
        //construct components
        firstName  = new JLabel ("First Name: ");
        lastName = new JLabel ("Last Name: ");
        firstNameField = new JTextField (5);
        employeeId = new JLabel ("Employee Id: ");
        supervisor = new JLabel ("Supervisor: ");
        fullTimeLabel = new JLabel ("Full Time");
        payScale = new JLabel ("Pay Scale: ");
        address = new JLabel ("Address: ");
        role = new JLabel ("Role: ");
        employeeID = new JLabel ("Username: ");
        password = new JLabel ("Password: ");
        lastNameField = new JTextField (5);
        employeeIdField = new JTextField (5);
        supervisorField = new JTextField (5);
        payScaleField = new JTextField (5);
        addressField = new JTextField (5);
        roleField = new JTextField (5);
        userNameField = new JTextField (5);
        passwordField = new JTextField (5);
        backBtn = new JButton("Back"); 
        updateBtn = new JButton("Update"); 
        address = new JLabel("Address:"); 
        addressField = new JTextField();
        fullTime = new JTextField();

        //adjust size and set layout
        setPreferredSize (new Dimension (816, 589));
        setLayout (null);

        //add components
        add (firstName );
        add (lastName);
        add (firstNameField);
        add (employeeId);
        add (supervisor);
        add (fullTimeLabel);
        add (payScale);
        add (address);
        add (role);
        add (employeeID);
        add (password);
        add (lastNameField);
        add (employeeIdField);
        add (supervisorField);
        add (fullTime);
        add (payScaleField);
        add (addressField);
        add (roleField);
        add (userNameField);
        add (passwordField);
        add (backBtn);
        add (updateBtn);
        add (addressField); 
        add (fullTime);
       

        //set component bounds (only needed by Absolute Positioning)
        firstName .setBounds (25, 170, 100, 25);
        firstNameField.setBounds (105, 170, 170, 25);
        firstNameField.setEditable(false);

        lastName.setBounds (25, 215, 100, 25);
        lastNameField.setBounds (105, 215, 170, 25);
        lastNameField.setEditable(false);

        employeeId.setBounds (25, 260, 100, 25);
        employeeIdField.setBounds (105, 260, 170, 25);
        employeeIdField.setEditable(false);

        supervisor.setBounds (25, 305, 100, 25);
        supervisorField.setBounds (105, 305, 170, 25);
        supervisorField.setEditable(false);

        fullTimeLabel.setBounds (25, 350, 100, 25);
        fullTime.setBounds (105, 350, 170, 25);
        fullTime.setEditable(false);
        
        payScale.setBounds(25, 395, 100, 25);
        payScaleField.setBounds (105, 395, 170, 25);
        payScaleField.setEditable(false);

        role.setBounds (25, 475, 100, 25);
        roleField.setBounds (105, 475, 170, 25);
        roleField.setEditable(false);

        employeeID.setBounds (360, 170, 100, 25);
        userNameField.setBounds (445, 170, 195, 25);
        userNameField.setEditable(false);

        password.setBounds (360, 205, 100, 25);
        passwordField.setBounds (445, 205, 195, 25);

        address.setBounds (360, 240, 100, 25);
        addressField.setBounds (445, 240, 300, 25);
                
        backBtn.setBounds(5, 5, 100, 50); ;
        updateBtn.setBounds(360, 475, 170, 25); 
    }

    public void setFirstNameField(String str){
        firstNameField.setText(str);
    }
    public void setLastNameField(String str){
        lastNameField.setText(str);
    }
    public void setEmployeeIdField(String str){
        employeeIdField.setText(str);
    }
    public void setRoleField(String str){
        roleField.setText(str);
    }
    public void setUsernameField(String str){
        userNameField.setText(str);
    }
    public void setSupervisorField(String str){
        supervisorField.setText(str);   
    }
    public void setPasswordField(char[] c){
        passwordField.setText(String.valueOf(c)); 
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
        return addressField.getText().trim(); 
    }
    public void setPayScale(String str){
        payScaleField.setText(str);
    }
    public void setDepartment(String str){

    }
    public String getPassword(){
        return passwordField.getText();
    }

    public String getEmployeeID(){
        return userNameField.getText().trim(); 
    }

    public void setFullTime(Boolean b){
        if(b){
            this.fullTime.setText("Yes");
        } else {
            this.fullTime.setText("No - Part Time only"); 
        }
    }
    public Boolean getFullTime(){
        if(this.fullTime.getText().equals("Yes")){
            return true; 
        } else {
            return false; 
        }
    }
 
}
