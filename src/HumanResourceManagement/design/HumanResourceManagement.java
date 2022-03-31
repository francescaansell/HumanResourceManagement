package HumanResourceManagement.design;

import javax.swing.JFrame;
import view.LoginUI;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;

import controller.*;
import model.Department;
import model.Employee;
import model.TimeSheet;

/**
 *
 * @author Group1HRM
 */
public class HumanResourceManagement {
    public static void main(String[] args){
        //Create file that will contain Employees' usernames and passwords
        // try{
        //     File employeeLogins = new File("Users.txt");
        //     if(employeeLogins.createNewFile()){
        //         System.out.println(employeeLogins.getName() + "file created.");
        //     }
        //     else{
        //         System.out.println("The file already exists");
        //     }
        // }
        // catch(IOException createError){
        //     System.out.println("There was an error that occured during creation");
        //     createError.printStackTrace();
        // }

        // //Write the admin users to the file that was just created
        // try {
        //     FileWriter fWriter = new FileWriter("Users.txt");
        //     Employee employee1 = new Employee("Frankie", "Ansell", "frankieansell", "12345", new Department(), 1092148, 0, new ArrayList<TimeSheet>(), true);
        //     Employee employee2 = new Employee("Jen", "B", "jenb", "12345", new Department(), 387952, 0, new ArrayList<TimeSheet>(), true);
        //     Employee employee3 = new Employee("Vince", "S", "vinces", "12345", new Department(), 465654, 0, new ArrayList<TimeSheet>(), true);
        //     fWriter.write(employee1.toString()); 
        //     fWriter.write(employee2.toString()); 
        //     fWriter.write(employee2.toString()); 
        //     fWriter.close();
        // } catch (IOException writeError) {
        //     System.out.println("An error occured while writing to the file");
        //     writeError.printStackTrace();
        // }

        LoginCntl loginCntl = new LoginCntl();

    }
        
}

