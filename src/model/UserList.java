package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class UserList {
    public ArrayList<Employee> userList = new ArrayList<>();
    public String usersFileName = "Users.txt";
    
    public UserList(){
        this.readUserListFile();
        if(userList.isEmpty() || userList == null){
            createList();
            writeUserListFile();
            readUserListFile();
        }
        printUserList();
    }
    
    public void createList(){
        Role role = new Role("Admin", 10);
        Employee employee1 = new Employee("Frankie", "Ansell", "frankieansell", "12345", new Department(), role, 1092148, 0, true, new ArrayList<TimeSheet>());
        //Employee employee2 = new Employee("Jen", "B", "jenb", "12345", new Department(), 387952, 0, new ArrayList<TimeSheet>(), true);
        //Employee employee3 = new Employee("Vince", "S", "vinces", "12345", new Department(), 465654, 0, new ArrayList<TimeSheet>(), true);
        userList.add(employee1); 
        //userList.add(employee2); 
        //userList.add(employee3); 
    }
    
    public void readUserListFile(){
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try{
            fis = new FileInputStream(usersFileName);
            in = new ObjectInputStream(fis);
            userList = (ArrayList)in.readObject();
            in.close();
            if(!userList.isEmpty()){
                System.out.println("There were updates in the file");
            }
        }
        catch (FileNotFoundException ex){
            System.out.println("File was not found, new one was created");
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
        catch(ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
    
    public void writeUserListFile(){
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try{
            fos = new FileOutputStream(usersFileName);
            out = new ObjectOutputStream(fos);
            out.writeObject(userList);
            out.close();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
    
    public void printUserList(){
        for (Employee employee : userList) {
            System.out.println(employee.toString());
        }
    }
    
    public ArrayList<Employee> getUserList(){
        return userList;
    }
}
