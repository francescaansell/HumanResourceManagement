package controller;
import view.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import model.Employee;

public class SupervisorNavCntl implements ActionListener{

    public Employee employee; 
    public SupervisorHomeUI supervisorHomeUI; 
    public OnboardCntl onbaordCntl; 

    public SupervisorNavCntl(Employee employee){
        supervisorHomeUI = new SupervisorHomeUI(this);
        supervisorHomeUI.setTitle("Supervisor Home Page");
        supervisorHomeUI.setVisible(true);
        supervisorHomeUI.setBounds(10, 10, 1000, 600);
        supervisorHomeUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        supervisorHomeUI.setResizable(true);
        supervisorHomeUI.getOnboardEmployeeBtn().addActionListener(this); 
        supervisorHomeUI.getLogOutBtn().addActionListener(this);
        supervisorHomeUI.getComplaintsBtn().addActionListener(this);
        supervisorHomeUI.getVacationApprButton().addActionListener(this);

        this.employee = employee; 
       
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == supervisorHomeUI.getOnboardEmployeeBtn()){
            supervisorHomeUI.setVisible(false);
            OnboardCntl onboardCntl = new OnboardCntl(); 
        }
        if (e.getSource() == supervisorHomeUI.getLogOutBtn()){
            supervisorHomeUI.setVisible(false);
            LoginCntl loginCntl = new LoginCntl(); 
        }
        if (e.getSource() == supervisorHomeUI.getComplaintsBtn()){
            supervisorHomeUI.setVisible(false);
            SupervisorComplaintCntl supervisorComplaintCntl = new SupervisorComplaintCntl(this.employee); 

        }
        
    }
}
    
