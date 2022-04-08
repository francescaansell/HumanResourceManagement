//done 
package controller; 
import view.*;
import model.*; 
import java.util.*;

import javax.swing.JFrame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener; 

/**
 *
 * @author Group 1 HRM
 */
public class ComplaintCntl implements ActionListener {

    public Complaint complaint; 
    public MyComplaintsUI myComplaintsUI; 

    public ComplaintCntl() {
        myComplaintsUI = new MyComplaintsUI(this);
        myComplaintsUI.setTitle("My Complaints"); 
        myComplaintsUI.setVisible (true);
        myComplaintsUI.setBounds(10, 10, 1000, 600);
        myComplaintsUI.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        myComplaintsUI.setResizable(true);
        myComplaintsUI.getBack().addActionListener(this); 
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == myComplaintsUI.getBack()){
            myComplaintsUI.setVisible(false); 
            NavigationCntl navigationCntl = new NavigationCntl(); //return to home page 
        }
        
    }
}
