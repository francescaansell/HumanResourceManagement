package controller;
import view.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import model.Employee;
/**
 *
 * @author Group1HRM
 */
public class NavigationCntl implements ActionListener{
    
    public Employee employee;
    public HomeUI homeUI; 

    public NavigationCntl() {
        homeUI = new HomeUI(this); 
        homeUI.setTitle("Home Page");
        homeUI.setVisible(true);
        homeUI.setBounds(10, 10, 1000, 600);
        homeUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeUI.setResizable(true);
        homeUI.logOutBtn.addActionListener(this);
        homeUI.hoursBtn.addActionListener(this); 
        homeUI.complaintsBtn.addActionListener(this); 
        homeUI.employeeBtn.addActionListener(this); 

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == homeUI.logOutBtn){
            homeUI.setVisible(false);
            LoginCntl loginCntl = new LoginCntl(); //return to login screen
        }
        if (e.getSource() == homeUI.complaintsBtn){
            homeUI.setVisible(false);
            ComplaintCntl complaintCntl = new ComplaintCntl(); 
        }
        
    }
 }