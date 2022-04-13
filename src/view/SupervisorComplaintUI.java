package view;
import java.awt.*;
import javax.swing.*;
import controller.*;

public class SupervisorComplaintUI extends JFrame {
    private JButton retrieveComplaintsBtn;
    private JTextArea textArea; 
    private JButton backBtn; 
    private JTextField assignEmployeeField;
    private JButton assignEmployeeBtn; 
    private JLabel employeeName;
    private JButton retrieveEmployee; 
    private JTextField employeeNameField;
    private JTextArea employeeInfo; 
    private JLabel employeeIDLabel; 
    private JTextField employeeIDField; 
    private JButton search; 

  
    public SupervisorComplaintUI(SupervisorComplaintCntl supervisorComplaintCntl) {
        //construct components
        retrieveComplaintsBtn = new JButton ("Retrieve");
        backBtn = new JButton("Back"); 

        //TODO this is prob gonna get changed to something else later
        textArea = new JTextArea(); 

        assignEmployeeField = new JTextField();
        assignEmployeeBtn = new JButton("Assign Employee");  

        retrieveEmployee = new JButton("Get Employee"); 
        employeeName = new JLabel ("Enter an employees last name to search for their account");
        employeeNameField = new JTextField(); 

        employeeIDLabel = new JLabel("Enter an employees ID to search for their account");
        employeeIDField = new JTextField();
        search = new JButton("Search"); 
        employeeInfo = new JTextArea(); 

        setPreferredSize (new Dimension (816, 589));
        setLayout (null);
 
        //add (retrieveComplaintsBtn);
        add (backBtn); 
        add (textArea);
        add (assignEmployeeField);
        add (assignEmployeeBtn); 
        add (employeeName);
        add (retrieveEmployee);
        add (employeeNameField);
        add (employeeIDLabel);
        add (employeeIDField); 
        add (search); 
        add (employeeInfo); 

        backBtn.setBounds(5, 5, 100, 50); ;
        //retrieveComplaintsBtn.setBounds (5, 115, 100, 50);
        textArea.setBounds(110, 5, 800, 200);
        textArea.setEditable(false);
        textArea.setLineWrap(true);
        assignEmployeeBtn.setBounds(530, 220, 200, 30); 

        employeeName.setBounds (110, 300, 400, 30); 
        employeeNameField.setBounds (110, 340, 200, 25);

        employeeIDLabel.setBounds(110, 380, 400, 30);
        employeeIDField.setBounds(110, 420, 200, 30); 

        search.setBounds(110, 480, 400, 30); 

        employeeInfo.setBounds(530, 300, 300, 200); 
        employeeInfo.setEditable(false);
    }

    public JButton getRetrieveComplaintsBtn(){
        return retrieveComplaintsBtn; 
    }
    public JTextArea getTextField(){
        return textArea;
    }
    public void setTextField(String str){
        this.textArea.setText(str); 
    }
    public JButton getBack(){
        return backBtn; 
    }
    public JButton getAssignEmployeeBtn(){
        return assignEmployeeBtn; 
    }
    public JTextField getAssignEmployeeField(){
        return assignEmployeeField; 
    }
    public JButton getSearchBtn(){
        return search; 
    }
    public String getEmployeeName(){
        return employeeNameField.getText().trim(); 
    }
    public void setEmployeeName(String str){
        employeeNameField.setText(str);
    }
    public void setEmployeeInfo(String str){
        employeeInfo.setText(str);
    }
    public Integer getEmployeeID(){
        return Integer.parseInt(employeeIDField.getText().trim());
    }
    public void setEmployeeID(String str){
        employeeIDField.setText(str);
    }
}