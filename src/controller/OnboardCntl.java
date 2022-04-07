package controller;

import javax.swing.JFrame;

import view.OnboardEmployeeUI;
import view.*; 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 
import javax.swing.JFrame; 
import model.Employee; 

public class OnboardCntl implements ActionListener{

    public OnboardEmployeeUI onboardEmployeeUI; 



    public OnboardCntl(){
        onboardEmployeeUI = new OnboardEmployeeUI(this);
        onboardEmployeeUI.setTitle("Onboard New Employee");
        onboardEmployeeUI.setVisible(true);
        onboardEmployeeUI.setBounds(10, 10, 1000, 600);
        onboardEmployeeUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        onboardEmployeeUI.setResizable(true);
        //onboardEmployeeUI.jList.addMouseListener(this);

    }

    @Override 
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == onboardEmployeeUI.getJList()){
            System.out.println("JList clicked");
        }
    }
    
}
