package view;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import controller.NavigationCntl; 
public class HomeUI extends JFrame{
    public JButton hoursBtn;
    public JButton complaintsBtn;
    public JButton employeeBtn;
    public JButton logOutBtn; 

    public HomeUI(NavigationCntl navCntl){
        hoursBtn = new JButton ("MyHours");
        complaintsBtn = new JButton ("MyComplaints");
        employeeBtn = new JButton ("Update and View Information");
        logOutBtn = new JButton("Log Out"); 

        setPreferredSize (new Dimension (816, 589));
        setLayout (null);

        add (hoursBtn);
        add (complaintsBtn);
        add (employeeBtn);
        add (logOutBtn); 

        hoursBtn.setBounds (155, 120, 235, 140);
        complaintsBtn.setBounds (475, 120, 235, 140);
        employeeBtn.setBounds (475, 320, 235, 140);
        logOutBtn.setBounds(5, 5, 100, 50);
    }

    public JButton getLogOutBtn(){
        return logOutBtn; 
    }
}


