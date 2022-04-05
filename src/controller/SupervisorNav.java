package controller;

import view.*;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import model.Employee;
public class SupervisorNav extends NavigationCntl{

    public Employee employee; 
    public SupervisorHomeUI superHomeUI; 
    public SupervisorNav(){
        homeUI = new HomeUI(this);
        homeUI.setTitle("Supervisor Home Page");
        homeUI.setVisible(true);
        homeUI.setBounds(10, 10, 1000, 600);
        homeUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeUI.setResizable(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
    
