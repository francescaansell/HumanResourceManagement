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
    private JButton retrieveEmployee; 
    private JTextArea employeeInfo; 
    private JLabel employeeIDLabel; 
    private JTextField employeeIDField; 
    private JButton search; 
    private JTextField complaintIDField; 
    private JLabel complaintLabel; 
    private JComboBox complaintType; 
    private JLabel complaintTypeLabel; 

  
    public SupervisorComplaintUI(SupervisorComplaintCntl supervisorComplaintCntl) {
        retrieveComplaintsBtn = new JButton ("Retrieve");
        backBtn = new JButton("Back"); 

        //TODO this is prob gonna get changed to something else later
        textArea = new JTextArea(); 

        assignEmployeeField = new JTextField();
        assignEmployeeBtn = new JButton("Assign Employee");  

        retrieveEmployee = new JButton("Get Employee"); 
 
        employeeIDLabel = new JLabel("Enter an employees ID to search for their account");
        employeeIDField = new JTextField();

        complaintIDField = new JTextField();
        complaintLabel = new JLabel("Enter the complaint ID number you want to assign this employee too.");
        search = new JButton("Search"); 
        employeeInfo = new JTextArea(); 
        String[] types = {"", "Management", "Payroll/Salary", "Sexual Misconduct", "Discrimination"}; 
        complaintType = new JComboBox<>(types); 
        complaintTypeLabel = new JLabel("Select a type of complaint to filter the list"); 


        //TODO add complaint ID field

        setPreferredSize (new Dimension (816, 589));
        setLayout (null);

        add (backBtn); 
        add (textArea);
        add (assignEmployeeField);
        add (assignEmployeeBtn); 
        add (retrieveEmployee);
        add (employeeIDLabel);
        add (employeeIDField); 
        add (search); 
        add (employeeInfo); 
        add (complaintIDField);
        add (complaintLabel);
        add (complaintType); 
        add (complaintTypeLabel); 

        backBtn.setBounds(5, 5, 100, 50); 

        complaintType.setBounds(410, 5, 165, 30);
        complaintTypeLabel.setBounds(140, 5, 400, 30); 
        
        textArea.setBounds(110, 80, 800, 200);
        textArea.setEditable(false);
        textArea.setLineWrap(true);

        employeeIDLabel.setBounds(110, 320, 400, 30); 
        employeeIDField.setBounds(110, 350, 200, 30);
        search.setBounds(110, 385, 200, 30); 

        employeeInfo.setBounds(110, 440, 300, 100); 
        employeeInfo.setEditable(false);
        employeeInfo.setLineWrap(true);

        complaintLabel.setBounds(490, 320, 450, 30);
        complaintIDField.setBounds(490, 350, 100, 30);
        assignEmployeeBtn.setBounds(490, 385, 200, 30);
        
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

    public void setEmployeeInfo(String str){
        employeeInfo.setText(str);
    }

    public String getEmployeeID(){
        return employeeIDField.getText().trim();
    }

    public Integer getComplaintID(){
        return Integer.parseInt(complaintIDField.getText().trim());
        
    }

    public void setEmployeeID(String str){
        employeeIDField.setText(str);
    }

    public Object getComplaintType(){
        return complaintType.getSelectedItem();
    }

    public void setComplaintType(Object obj){
        this.complaintType.setSelectedItem(obj);
    }

    public JComboBox getTypePicker(){
        return this.complaintType; 
    }
}