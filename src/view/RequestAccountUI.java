package view;
import javax.swing.*;
import controller.*;
import java.awt.*;

public class RequestAccountUI extends JFrame{
    //Frame
    Container container = getContentPane();
    private JButton submit;
    private JLabel fnamelabel;
    private JLabel lnamelabel;
    private JTextField fname;
    private JTextField lname;
    private JLabel employeeIDLabel;
    private JTextField employeeID;
    private JLabel passwordlabel;
    private JTextField password;
    private RequestAccountCntl requestAccountCntl; 
    private JLabel employeeIDLabel2; 

    public RequestAccountUI(RequestAccountCntl requestAccountCntl){
        this.requestAccountCntl = requestAccountCntl; 

        submit = new JButton ("Submit");
        fnamelabel = new JLabel ("First Name");
        lnamelabel = new JLabel ("Last Name");
        fname = new JTextField (5);
        lname = new JTextField (5);
        employeeIDLabel = new JLabel ("Choose 3 characters to begin your ID");
        employeeIDLabel2 = new JLabel("Numerical values will be generated for you");

        employeeID = new JTextField (5);
        passwordlabel = new JLabel ("Password");
        password = new JTextField (5);

        setPreferredSize (new Dimension (816, 589));
        setLayout (null);

        add (submit);
        add (fnamelabel);
        add (lnamelabel);
        add (fname);
        add (lname);
        add (employeeIDLabel);
        add (employeeID);
        add (passwordlabel);
        add (password);
        add (employeeIDLabel2);

        submit.setBounds (105, 360, 140, 20);
        fnamelabel.setBounds (105, 30, 100, 25);
        lnamelabel.setBounds (105, 85, 100, 25);
        fname.setBounds (105, 60, 135, 25);
        lname.setBounds (105, 115, 135, 25);
        employeeIDLabel.setBounds (68, 155, 400, 25);
        employeeIDLabel2.setBounds(60, 175, 400, 25);
        employeeID.setBounds (105, 205, 135, 25);

        passwordlabel.setBounds (105, 240, 100, 25);
        password.setBounds (105, 265, 135, 25);
        
    }

    public String getEmployeeID(){
        return employeeID.getText().trim(); 
    }

    public char[] getPassword(){
        return password.getText().trim().toCharArray(); 
    }

    public String getFirstName(){
        return fname.getText().trim(); 
    }

    public String getLastName(){
        return lname.getText().trim(); 
    }

    public JButton getSubmitBtn(){
        return submit; 
    }

    public void setEmployeeIDField(String str){
        employeeID.setText(str);
    }

    public void setFirstName(String str){
        fname.setText(str);
    }
    public void setLastName(String str){
        lname.setText(str);
    }
    public void setEmployeeID(String str){
        employeeID.setText(str);
    }
    public void setPw(String str){
        password.setText(str);
    }
}
