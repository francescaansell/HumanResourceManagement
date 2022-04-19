package view;
import java.awt.*;
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
    public JComboBox<String> complaintType; 
    public JLabel complaintTypeLabel; 
   
 
    public MyComplaintsUI(ComplaintCntl complaintCntl) {
        submitBtn = new JButton ("Submit");
        descriptionField = new JTextArea (5, 5);
        descripition = new JLabel ("Description");
        involvedField = new JTextArea (5, 5);
        involved = new JLabel ("Persons Involed");
        date = new JLabel ("Date the incident occured");
        backBtn = new JButton("Back"); 
        String[] types = {"", "Management", "Payroll/Salary", "Sexual Misconduct", "Discrimination"}; 
        complaintType = new JComboBox<>(types); 
        complaintTypeLabel = new JLabel("Complaint Type");

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
        add (complaintType); 
        add (complaintTypeLabel);

          // create the middle panel components

  

        backBtn.setBounds(5, 5, 100, 50); 
        
        involved.setBounds (5, 70, 100, 25);
        involvedField.setBounds (5, 100, 500, 70);
        
        date.setBounds(5, 170, 165, 25);
        datePicker.setBounds(5, 190, 200, 30);

        descripition.setBounds (5, 240, 100, 25);
        descriptionField.setBounds (5, 260, 500, 145);

        complaintTypeLabel.setBounds(5, 410, 100, 25);
        complaintType.setBounds(5, 430, 165, 25);

        submitBtn.setBounds (5, 500, 140, 20);
    }

    public java.util.Date getDate(){
        java.util.Date selectedDate = (java.util.Date) datePicker.getModel().getValue();
        return selectedDate;       
    }

    public void setDate(String newDate){

        System.out.println("DATE" + newDate); 

        SimpleDateFormat formatter = new SimpleDateFormat("E MMM dd HH:mm:ss Z YYYY");
        try {
            //TODO issue here 
            java.util.Date date = formatter.parse(newDate);
            System.out.println("DATE IN DATE FORM " + date); 
        } catch (ParseException e) {
            e.printStackTrace();
        } 
    }

    public JButton getSubmit(){
        return submitBtn; 
    }

    public String getInvolved(){
        return involvedField.getText().trim();
    }

    public JButton getBack(){
        return backBtn; 
    }

    public void setInvolved(String str){
        this.involvedField.setText(str);
    }

    public void setDescription(String str){
        this.descriptionField.setText(str);
    }
    
    public String getDescription(){
        return descriptionField.getText().trim();
    }

    public Object getComplaintType(){
        return this.complaintType.getSelectedItem(); 
    }

    public void setType(Object obj){
        this.complaintType.setSelectedItem(obj);
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
}
