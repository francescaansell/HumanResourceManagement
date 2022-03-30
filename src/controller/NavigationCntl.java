package controller;

import model.*;
import view.*;
import java.util.*; 

import view.EmployeeUI;
import view.LoginUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
        homeUI.setTitle("Login Form");
        homeUI.setVisible(true);
        homeUI.setBounds(10, 10, 1000, 600);
        homeUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        homeUI.setResizable(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
 }