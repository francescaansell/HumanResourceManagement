package view;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import controller.*;

public class MyComplaintsUI extends JFrame {
    private JButton submit;
    private JTextArea descriptionField;
    private JLabel descripition;
    private JTextArea involvedField;
    private JLabel involved;
    private JTextField dateField;
    private JLabel date;
    public JButton back; 

    public MyComplaintsUI(ComplaintCntl complaintCntl) {
        //construct components
        submit = new JButton ("Submit");
        descriptionField = new JTextArea (5, 5);
        descripition = new JLabel ("Description");
        involvedField = new JTextArea (5, 5);
        involved = new JLabel ("Persons Involed");
        dateField = new JTextField (5);
        date = new JLabel ("Date the incident occured");
        back = new JButton("Back"); 

        //adjust size and set layout
        setPreferredSize (new Dimension (816, 589));
        setLayout (null);

        //add components
        add (submit);
        add (descriptionField);
        add (descripition);
        add (involvedField);
        add (involved);
        add (dateField);
        add (date);
        add (back); 

        //set component bounds (only needed by Absolute Positioning)
        submit.setBounds (350, 550, 140, 20);
        descriptionField.setBounds (45, 275, 230, 145);
        descripition.setBounds (45, 250, 100, 25);
        involvedField.setBounds (45, 140, 225, 70);
        involved.setBounds (45, 115, 100, 25);
        dateField.setBounds (360, 140, 165, 20);
        date.setBounds (360, 115, 165, 25);
        back.setBounds(5, 5, 100, 100);
    }


    public JButton getBack(){
        return back; 
    }
}
