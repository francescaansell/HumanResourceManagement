package controller;
import view.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import model.Employee;

public class SupervisorNavCntl implements ActionListener{

    public Employee user; 
    public SupervisorHomeUI supervisorHomeUI; 
    public SupervisorUpdateInfoCntl onbaordCntl; 

    public SupervisorNavCntl(Employee u){
        supervisorHomeUI = new SupervisorHomeUI(this);
        supervisorHomeUI.setTitle("Supervisor Home Page");
        supervisorHomeUI.setVisible(true);
        supervisorHomeUI.setBounds(10, 10, 1000, 700);
        supervisorHomeUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        supervisorHomeUI.setResizable(true);
        
        this.user = u; 

        supervisorHomeUI.getOnboardEmployeeBtn().addActionListener(this); 
        supervisorHomeUI.getLogOutBtn().addActionListener(this);
        supervisorHomeUI.getComplaintsBtn().addActionListener(this);
        supervisorHomeUI.getEmployeePortal().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == supervisorHomeUI.getOnboardEmployeeBtn()){
            supervisorHomeUI.setVisible(false);
            SupervisorUpdateInfoCntl onboardCntl = new SupervisorUpdateInfoCntl(this.user); 
        }
        if (e.getSource() == supervisorHomeUI.getLogOutBtn()){
            supervisorHomeUI.setVisible(false);
            LoginCntl loginCntl = new LoginCntl(); 
        }
        if (e.getSource() == supervisorHomeUI.getComplaintsBtn()){
            supervisorHomeUI.setVisible(false);
            SupervisorComplaintCntl supervisorComplaintCntl = new SupervisorComplaintCntl(this.user); 
        }
        if (e.getSource() == supervisorHomeUI.getEmployeePortal()){
            supervisorHomeUI.setVisible(false);
            NavigationCntl navigationCntl = new NavigationCntl(this.user); 
        } 
    }
}
    
