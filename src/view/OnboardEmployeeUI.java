package view;
import java.awt.Dimension;
import controller.*;

import javax.swing.*;
public class OnboardEmployeeUI extends JFrame{

    private JButton retrievePendingBtn; 
    private JLabel firstName;
    private JTextField firstNameField;
    private JLabel lastName;
    private JTextField lastNameField;
    private JLabel id;
    private JTextField idField;
    private JButton updateBtn; 
    private JComboBox<String> roleField; 
    private JButton backBtn; 
    private JLabel role; 
    private JLabel department; 
    private JComboBox<String> departmentField; 
    private JLabel payscale; 
    private JComboBox<String> payscaleField; 
    private JLabel chooseEmployeeID; 
    private JTextField chooseEmployeeIDField; 
    private JLabel supervisor; 
    private JTextField supervisorField; 
    private JLabel fulltimeLabel; 
    private JCheckBox fulltimeBox; 

    public OnboardEmployeeUI(SupervisorUpdateInfoCntl onboardCntl){
        
        retrievePendingBtn = new JButton("Get Employee"); 
        chooseEmployeeID = new JLabel("Enter Employee ID"); 
        chooseEmployeeIDField = new JTextField(); 

        firstName = new JLabel ("First Name:");
        firstNameField = new JTextField (5);
        lastName = new JLabel ("Last Name:");
        lastNameField = new JTextField (5);
        id = new JLabel ("Employee ID:");
        idField = new JTextField (5);
        updateBtn = new JButton ("Update"); 
        role = new JLabel ("Role:"); 
        String[] roleOptions = {"", "Employee", "Pending", "Supervisor"};
        roleField = new JComboBox<String>(roleOptions); 
        backBtn = new JButton("Back"); 
        department = new JLabel("Department:");
        String[] departmentOptions = {"", "Shipping", "Sales", "Marketing", "Finance", "None of the listed"};
        departmentField = new JComboBox<String>(departmentOptions); 
        payscale = new JLabel("PayScale:"); 
        String[] payOptions = {"", "a - 10,000", "b - 40,000", "c - 60,000", "d - 100,000", "None of the listed"};
        payscaleField = new JComboBox<String>(payOptions); 
        supervisor = new JLabel("Supervisor ID: ");
        supervisorField = new JTextField(6); 
        fulltimeLabel = new JLabel("Full Time: "); 
        fulltimeBox = new JCheckBox(); 

        setPreferredSize (new Dimension (816, 589));
        setLayout (null);

        add (retrievePendingBtn);
        add (firstName);
        add (firstNameField);
        add (lastName);
        add (lastNameField);
        add (id);
        add (idField);
        add (updateBtn); 
        add (roleField); 
        add (backBtn); 
        add (role);
        add (department); 
        add (departmentField);
        add (payscale); 
        add (payscaleField);
        add (chooseEmployeeID); 
        add (chooseEmployeeIDField); 
        add (supervisor);
        add (supervisorField); 
        add (fulltimeBox);
        add (fulltimeLabel); 

       
        backBtn.setBounds(25, 5, 100, 50); ;

        chooseEmployeeID.setBounds(25, 200, 400, 30); 
        chooseEmployeeIDField.setBounds(25, 240, 200, 25);

        retrievePendingBtn.setBounds (25, 300, 390, 30); 
        
        //Right Side of Screen
        firstName.setBounds (625, 40, 100, 25);
        firstNameField.setBounds (710, 40, 165, 20);

        lastName.setBounds (625, 80, 100, 25);
        lastNameField.setBounds (710, 80, 165, 20);

        id.setBounds (625, 120, 100, 25);
        idField.setBounds (710, 120, 165, 20);

        role.setBounds(625, 160, 100, 25);
        roleField.setBounds (710, 160, 165, 20);

        department.setBounds(625, 200, 100, 25);
        departmentField.setBounds(710, 200, 165, 20);

        payscale.setBounds(625, 240, 100, 25);
        payscaleField.setBounds(710, 240, 165, 20);

        supervisor.setBounds(625, 280, 100, 25);
        supervisorField.setBounds(710, 280, 165, 20); 

        fulltimeLabel.setBounds(625, 320, 100, 25); 
        fulltimeBox.setBounds(710, 322, 20, 20);
        
        updateBtn.setBounds(625, 360, 100, 25);
    }

    public void setFirstNameField(String str){
        this.firstNameField.setText(str);
    }
    public String getFirstName(){
        return firstNameField.getText().trim(); 
    }
    public void setLastNameField(String str){
        this.lastNameField.setText(str);
    }
    public String getLastName(){
        return lastNameField.getText().trim(); 
    }
    public Object getRole(){
        return roleField.getSelectedItem(); 
    }
    public void setRole(String str){
        this.roleField.setSelectedItem(str);;
    }
    public JButton getRetrievePendingButton(){
        return retrievePendingBtn; 
    }
    public JButton getUpdateBtn(){
        return updateBtn; 
    }
    public JButton getBackBtn(){
        return backBtn;
    } 
    public JTextField getIDField(){
        return idField; 
    }
    public void setIDField(String str){
        this.idField.setText(str); 
    }
    public Object getPayScale(){
        return payscaleField.getSelectedItem();   
    }
    public void setPayScale(String str){
        payscaleField.setSelectedItem(str);
    }
    public Object getDepartment(){
        return departmentField.getSelectedItem(); 
    }
    public void setDepartmentField(String department){
        departmentField.setSelectedItem(department);
    }
    public String getChooseEmployeeID(){
        return chooseEmployeeIDField.getText().trim();
    }
    public void setChooseEmployeeID(Integer i){
        this.chooseEmployeeIDField.setText("" + i); 
    }
    public String getSupervsiorID(){
        return supervisorField.getText().trim(); 
    }
    public void setSupervisorID(String str){
        supervisorField.setText(str);
    }
    public Boolean getFullTime(){
        return this.fulltimeBox.isSelected(); 
    }
    public void setFullTimeBox(Boolean b){
        this.fulltimeBox.setSelected(b);
    }
}

