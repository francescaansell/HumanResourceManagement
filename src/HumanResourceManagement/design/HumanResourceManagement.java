package HumanResourceManagement.design;

import javax.swing.JFrame;
import view.LoginUI;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;

import controller.*;

/**
 *
 * @author Group1HRM
 */
public class HumanResourceManagement {
    public static void main(String[] args){
        //Create file that will contain Employees' usernames and passwords
        try{
            File employeeLogins = new File("LoginData.txt");
            if(employeeLogins.createNewFile()){
                System.out.println(employeeLogins.getName() + "file created.");
            }
            else{
                System.out.println("The file already exists");
            }
        }
        catch(IOException createError){
            System.out.println("There was an error that occured during creation");
            createError.printStackTrace();
        }

        //Write the admin users to the file that was just created
        try {
            FileWriter fWriter = new FileWriter("LoginData.txt");
            fWriter.write("abc");
            fWriter.write("12345");
            fWriter.close();
        } catch (IOException writeError) {
            System.out.println("An error occured while writing to the file");
            writeError.printStackTrace();
        }

        LoginCntl loginCntl = new LoginCntl();

    }
        
}

