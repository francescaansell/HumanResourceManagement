package view;
import java.awt.*;
import java.awt.event.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Properties;

import javax.swing.*;
import controller.*;
import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.UtilDateModel;
import org.jdatepicker.impl.JDatePickerImpl;

public class MyComplaintsUI extends JFrame {
    private JButton submitBtn;
    private JTextArea descriptionField;
    private JLabel descripition;
    private JTextArea involvedField;
    private JLabel involved;
    private JLabel date;
    private JButton backBtn; 
    public UtilDateModel model; 
    public JDatePanelImpl datePanel; 
    public JDatePickerImpl datePicker; 
 


    public MyComplaintsUI(ComplaintCntl complaintCntl) {
        //construct components
        submitBtn = new JButton ("Submit");
        descriptionField = new JTextArea (5, 5);
        descripition = new JLabel ("Description");
        involvedField = new JTextArea (5, 5);
        involved = new JLabel ("Persons Involed");
        date = new JLabel ("Date the incident occured");
        backBtn = new JButton("Back"); 

        model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");

        datePanel = new JDatePanelImpl(model, p);
        datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());


        //adjust size and set layout
        setPreferredSize (new Dimension (816, 589));
        setLayout (null);

        //add components
        add (submitBtn);
        add (descriptionField);
        add (descripition);
        add (involvedField);
        add (involved);
        add (date);
        add (backBtn); 
        add (datePicker);

        //set component bounds (only needed by Absolute Positioning)
        
        descriptionField.setBounds (45, 275, 230, 145);
        descripition.setBounds (45, 250, 100, 25);
        involvedField.setBounds (45, 140, 225, 70);
        involved.setBounds (45, 115, 100, 25);
        datePicker.setBounds(360, 140, 200, 30);
        submitBtn.setBounds (360, 400, 140, 20);
        date.setBounds (360, 115, 165, 25);
        backBtn.setBounds(5, 5, 100, 100);
        
    }
    public java.util.Date getDate(){
        java.util.Date selectedDate = (java.util.Date) datePicker.getModel().getValue();
        return selectedDate; 
        
    }

    public void setDate(String newDate){

        System.out.println("DATE" + newDate); 

        SimpleDateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z YYYY");
        try {
            java.util.Date date = formatter.parse(newDate);
            System.out.println("DATE IN DATE FORM " + date); 
        } catch (ParseException e) {
            e.printStackTrace();
        } 
    }

    public JButton getSubmit(){
        return submitBtn; 
    }
    public JTextArea getInvoledField(){
        return involvedField;
    }

    public JButton getBack(){
        return backBtn; 
    }

    public void setInvoledField(String str){
        this.involvedField.setText(str);
    }
    public void setDescriptionField(String str){
        this.descriptionField.setText(str);
    }
    public JTextArea getDescriptionField(){
        return descriptionField;
    }
}
