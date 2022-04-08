package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import controller.*;

public class SupervisorComplaintUI extends JFrame {
    private JButton retrieveComplaintsBtn;
    private JTextField textField; 
    private JButton backBtn; 
  
    public SupervisorComplaintUI(SupervisorComplaintCntl supervisorComplaintCntl) {
        //construct components
        retrieveComplaintsBtn = new JButton ("Retrieve Complaints");
        backBtn = new JButton("Back"); 
        textField = new JTextField(); 

        //adjust size and set layout
        setPreferredSize (new Dimension (816, 589));
        setLayout (null);

        //add components
        add (retrieveComplaintsBtn);
        add (backBtn); 
        add (textField);
   
        //set component bounds (only needed by Absolute Positioning)
        
        backBtn.setBounds(5, 5, 100, 100);
        retrieveComplaintsBtn.setBounds (300, 300, 140, 20);
        textField.setBounds(300, 5, 200, 200);
        
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

 
}