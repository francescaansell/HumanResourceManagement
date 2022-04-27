package view;
import java.awt.*;
import java.io.FilterReader;
import java.util.Properties;

import javax.swing.*;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

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
    private JComboBox<String> filterType; 
    private JLabel filterLabel; 
    private JScrollPane scroll; 
    private JLabel closedLabel; 
    private JComboBox<String> filterOpen; 


    private JButton submitBtn;
    private JTextArea descriptionField;
    private JLabel descripition;
    private JTextArea involvedField;
    private JLabel involved;
    private JLabel date;
    public UtilDateModel model; 
    public JDatePanelImpl datePanel; 
    public JDatePickerImpl datePicker; 
    public JComboBox<String> updateComplaintType; 
    public JLabel updateComplaintTypeLabel; 
    public JLabel heading; 
    private JComboBox<String> closed; 
   
     
    public SupervisorComplaintUI(SupervisorComplaintCntl supervisorComplaintCntl) {
        retrieveComplaintsBtn = new JButton ("Retrieve");
        backBtn = new JButton("Back"); 

        textArea = new JTextArea(); 

        assignEmployeeField = new JTextField();
        assignEmployeeBtn = new JButton("Update Complaint");  

        employeeIDLabel = new JLabel("Assigned Supervisor ID");
        employeeIDField = new JTextField();

        complaintIDField = new JTextField();
        complaintLabel = new JLabel("Complaint ID:");
        search = new JButton("Search"); 
        employeeInfo = new JTextArea(); 
        String[] types = {"", "Management", "Payroll/Salary", "Sexual Misconduct", "Discrimination"}; 
        filterType = new JComboBox<>(types); 
        String[] ifopen = {"", "Open", "Closed"}; 
        filterOpen = new JComboBox<>(ifopen); 
        filterLabel = new JLabel("Adjust drop downs to filter the list"); 


        heading = new JLabel("FILL OUT FIELDS YOU WISH TO UPDATE (You can leave fields you dont want to change blank but you must include a complaint ID)");

        String[] closedOptions = {"", "Open", "Closed"};  
        closed = new JComboBox<>(closedOptions); 

        setPreferredSize (new Dimension (816, 589));
        setLayout (null);

        add (backBtn); 
 
        add (assignEmployeeField);
        add (assignEmployeeBtn); 
        add (employeeIDLabel);
        add (employeeIDField); 
        //add (search); 
        add (employeeInfo); 
        add (complaintIDField);
        add (complaintLabel);
        add (filterType); 
        add (filterLabel); 
        add (heading);
        add (closed); 
        add (filterOpen); 

        heading.setBounds(100, 285, 800, 30);

        backBtn.setBounds(5, 5, 100, 50); 

        
        filterLabel.setBounds(140, 5, 400, 30); 
        filterType.setBounds(410, 5, 165, 30);
        filterOpen.setBounds(600, 5, 165, 30);
        
        
        textArea.setEditable(false);
        textArea.setLineWrap(true);


        scroll = new JScrollPane(textArea);
        scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroll.setBounds(5, 80, 900, 200);
    
        add (scroll);

        employeeIDLabel.setBounds(5, 320, 400, 30); 
        employeeIDField.setBounds(5, 350, 200, 30);
        search.setBounds(5, 385, 200, 30); 

        // employeeInfo.setBounds(5, 440, 300, 30); 
        // employeeInfo.setEditable(false);
        // employeeInfo.setLineWrap(true);

        complaintLabel.setBounds(310, 320, 450, 30);
        complaintIDField.setBounds(310, 350, 100, 30);


        assignEmployeeBtn.setBounds(610, 485, 200, 50);





     
        submitBtn = new JButton ("Submit");
        descriptionField = new JTextArea (5, 5);
        descripition = new JLabel ("Description");
        involvedField = new JTextArea (5, 5);
        involved = new JLabel ("Persons Involved");
        date = new JLabel ("Date the incident occured");
        

        updateComplaintType = new JComboBox<>(types); 
        updateComplaintTypeLabel = new JLabel("Update Complaint Type");

        model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");

        datePanel = new JDatePanelImpl(model, p);
        datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());

        setPreferredSize (new Dimension (816, 589));
        setLayout (null);

        add (submitBtn);
        add (descriptionField);
        add (descripition);
        add (involvedField);
        add (involved);
        add (date);
        add (backBtn); 
        add (datePicker);
        add (filterType); 
        add (filterLabel);
        
        involved.setBounds (5, 400, 100, 25);
        involvedField.setBounds (5, 430, 500, 70);
        
        date.setBounds(5, 530, 165, 25);
        datePicker.setBounds(5, 560, 200, 30);

        descripition.setBounds (5, 620, 100, 25);
        descriptionField.setBounds (5, 640, 500, 145);

        updateComplaintTypeLabel.setBounds(5, 715, 100, 25);
        updateComplaintType.setBounds(5, 745, 165, 25);

        closed.setBounds(5, 810, 100, 25); 
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
        try {
            return Integer.parseInt(complaintIDField.getText().trim());
        } catch (Exception ex){
            return null; 
        }
        
        
    }

    public void setEmployeeID(String str){
        employeeIDField.setText(str);
    }

    public Object getComplaintType(){
        return filterType.getSelectedItem();
    }

    public void setComplaintType(Object obj){
        this.filterType.setSelectedItem(obj);
    }

    public JComboBox<String> getTypePicker(){
        return this.filterType; 
    }

    public String getInvolved(){
        return this.involvedField.getText().trim(); 
    }
    public void setInvolved(String str){
        this.involvedField.setText(str);
    }

    public String getDescriptoin(){
        return this.descriptionField.getText().trim();
    }
    public void setDescription(String str){
        this.descriptionField.setText(str);
    }

    public java.util.Date getDate(){
        java.util.Date selectedDate = (java.util.Date) datePicker.getModel().getValue();
        return selectedDate;      
    }

    public void resetDate(){
        model = new UtilDateModel();
        Properties p = new Properties();
        p.put("text.today", "Today");
        p.put("text.month", "Month");
        p.put("text.year", "Year");

        this.datePanel = new JDatePanelImpl(model, p);
        this.datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
    }

    public Object getClosed(){
        return closed.getSelectedItem(); 
    }
    public void setClosed(Object obj){
        this.closed.setSelectedItem(obj);
    }
    public Object getFilterOpen(){
        return filterOpen.getSelectedItem();
    }
    public JComboBox getFilterOpenBox(){
        return filterOpen; 
    }

}