package view;
import java.awt.Dimension;
import controller.*;
import javax.swing.*;
public class OnboardEmployeeUI extends JFrame{

    private JLabel chooseEmployee;
  
    private JButton retrievePendingBtn; 
    private JTextField employeeNameField; 
    private JLabel firstName;
    private JTextField firstNameField;
    private JLabel lastName;
    private JTextField lastNameField;
    private JLabel id;
    private JTextField idField;
    private JButton approveBtn; 
    private JTextField roleField; 
    private JButton backBtn; 
    private JLabel role; 

    public OnboardEmployeeUI(OnboardCntl onboardCntl){
        
        retrievePendingBtn = new JButton("Get Employee"); 
        chooseEmployee = new JLabel ("Enter an employees last name to search for their pending account");
        employeeNameField = new JTextField(); 
        firstName = new JLabel ("First Name");
        firstNameField = new JTextField (5);
        lastName = new JLabel ("Last Name");
        lastNameField = new JTextField (5);
        id = new JLabel ("ID");
        idField = new JTextField (5);
        approveBtn = new JButton ("Approve"); 
        role = new JLabel ("Role"); 
        roleField = new JTextField(); 
        backBtn = new JButton("Back"); 


        //adjust size and set layout
        setPreferredSize (new Dimension (816, 589));
        setLayout (null);

        //add components
        add (chooseEmployee);
        add (retrievePendingBtn);
        add (employeeNameField); 
        add (firstName);
        add (firstNameField);
        add (lastName);
        add (lastNameField);
        add (id);
        add (idField);
        add (approveBtn); 
        add (roleField); 
        add (backBtn); 
        add (role);

        //set component bounds (only needed by Absolute Positioning)
        backBtn.setBounds(5, 5, 100, 100);

        chooseEmployee.setBounds (5, 120, 400, 10); //Label
        employeeNameField.setBounds (5, 140, 125, 25);

        retrievePendingBtn.setBounds (25, 300, 390, 30); //Buttons
        approveBtn.setBounds (25, 340, 390, 30); //Buttons
        
        firstName.setBounds (625, 20, 100, 25);
        firstNameField.setBounds (625, 50, 100, 25);

        lastName.setBounds (625, 85, 100, 25);
        lastNameField.setBounds (625, 120, 100, 25);

        id.setBounds (625, 165, 100, 25);
        idField.setBounds (625, 200, 100, 25);

        role.setBounds(625, 260, 100, 25);
        roleField.setBounds (625, 290, 165, 20);

        
    }

    public void setFirstNameField(String str){
        this.firstNameField.setText(str);
    }
    public JTextField getFirstNameField(){
        return firstNameField; 
    }
    public void setLastNameField(String str){
        this.lastNameField.setText(str);
    }
    public JTextField getLastNameField(){
        return lastNameField; 
    }

    public void setEmployeeNameField(String str){
        this.employeeNameField.setText(str); 
    }
    public JTextField getEmployeeNameField(){
        return employeeNameField; 
    }
    public JTextField getRoleField(){
        return roleField; 
    }

    public JButton getRetrievePendingButton(){
        return retrievePendingBtn; 
    }
    public JButton getApproveBtn(){
        return approveBtn; 
    }
    public JButton getBackBtn(){
        return backBtn;
    } 
}

