package controller;
import model.*; 
import view.*; 
import java.util.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame; 

/**
 *
 * @author Group 1 HRM
 */
public class TimeSheetCntl implements ActionListener{ 
    public TimeSheet timeSubmission; 
    public MyHoursUI myHoursUI; 

    public TimeSheetCntl(TimeSheet timeSubmission, MyHoursUI view) {
        this.timeSubmission = timeSubmission;
        myHoursUI = new MyHoursUI(this); 
        myHoursUI.setTitle("MyHours");
        myHoursUI.setVisible(true);
        myHoursUI.setBounds(10, 10, 1000, 700);
        myHoursUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myHoursUI.setResizable(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){

    }   
}