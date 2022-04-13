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
    private JLabel usernamelabel;
    private JTextField username;
    private JLabel passwordlabel;
    private JTextField password;
    private RequestAccountCntl requestAccountCntl; 

    public RequestAccountUI(RequestAccountCntl requestAccountCntl){
        this.requestAccountCntl = requestAccountCntl; 

        submit = new JButton ("Submit");
        fnamelabel = new JLabel ("First Name");
        lnamelabel = new JLabel ("Last Name");
        fname = new JTextField (5);
        lname = new JTextField (5);
        usernamelabel = new JLabel ("Username");
        username = new JTextField (5);
        passwordlabel = new JLabel ("Password");
        password = new JTextField (5);
    

        setPreferredSize (new Dimension (816, 589));
        setLayout (null);

        //add components
        add (submit);
        add (fnamelabel);
        add (lnamelabel);
        add (fname);
        add (lname);
        add (usernamelabel);
        add (username);
        add (passwordlabel);
        add (password);


        //set component bounds (only needed by Absolute Positioning)
        submit.setBounds (105, 360, 140, 20);
        fnamelabel.setBounds (105, 30, 100, 25);
        lnamelabel.setBounds (105, 85, 100, 25);
        fname.setBounds (105, 60, 135, 25);
        lname.setBounds (105, 115, 135, 25);
        usernamelabel.setBounds (105, 155, 100, 25);
        username.setBounds (105, 185, 135, 25);
        passwordlabel.setBounds (105, 220, 100, 25);
        password.setBounds (105, 245, 135, 25);
        
    }

    //Getters for requestAccountCntl to acsess things
    public String getUsername(){
        return username.getText().trim(); 
    }
    public String getPassword(){
        return password.getText().trim(); 
    }
    public String getFirstName(){
        return fname.getText().trim(); 
    }
    public String getLastName(){
        return lname.getText().trim(); 
    }
    public Boolean getFullTime(){
        //return JCheckBox.isSelected(); 
        return false; 
    }
    public JButton getSubmitBtn(){
        return submit; 
    }
  
}
