package view;
import java.awt.*;
import javax.swing.*;
import controller.*;

public class SupervisorComplaintUI extends JFrame {
    private JButton retrieveComplaintsBtn;
    private JTextField textField; 
    private JButton backBtn; 
    private JTextField assignEmployeeField;
    private JButton assignEmployeeBtn; 
  
    public SupervisorComplaintUI(SupervisorComplaintCntl supervisorComplaintCntl) {
        //construct components
        retrieveComplaintsBtn = new JButton ("Retrieve \n Complaints");
        backBtn = new JButton("Back"); 

        //TODO this is prob gonna get changed to something else later
        textField = new JTextField(); 

        assignEmployeeField = new JTextField();
        assignEmployeeBtn = new JButton("Assign Employee");  

        //adjust size and set layout
        setPreferredSize (new Dimension (816, 589));
        setLayout (null);

        //add components
        add (retrieveComplaintsBtn);
        add (backBtn); 
        add (textField);
        add (assignEmployeeField);
        add (assignEmployeeBtn); 
   
        //set component bounds (only needed by Absolute Positioning)
        backBtn.setBounds(5, 5, 100, 50); ;
        retrieveComplaintsBtn.setBounds (5, 115, 100, 50);
        textField.setBounds(110, 5, 800, 200);
        assignEmployeeField.setBounds(110, 220, 100, 20); 
        assignEmployeeBtn.setBounds(230, 220, 100, 20); 

        
    }

    public JButton getRetrieveComplaintsBtn(){
        return retrieveComplaintsBtn; 
    }
    public JTextField getTextField(){
        return textField;
    }
    public void setTextField(String str){
        this.textField.setText(str); 
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
}