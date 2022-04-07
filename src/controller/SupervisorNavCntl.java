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

    public SupervisorNavCntl(){
        supervisorHomeUI = new SupervisorHomeUI(this);
        supervisorHomeUI.setTitle("Supervisor Home Page");
        supervisorHomeUI.setVisible(true);
        supervisorHomeUI.setBounds(10, 10, 1000, 600);
        supervisorHomeUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        supervisorHomeUI.setResizable(true);
        supervisorHomeUI.onboardEmployee.addActionListener(this); 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == supervisorHomeUI.onboardEmployee){
            OnboardCntl onboardCntl = new OnboardCntl(); 
        }
        
    }
}
    
