/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * This class will contain a list of all our current employees 
 * @author Group1HRM
 */
public class EmployeeList {
    private ArrayList<Employee> listOfEmployees = new ArrayList<>();
    private String emplFileName = "employees.ser";


    /**
     * This is the default constructor (eventually we will be pulling from a file here) 
     */
    public EmployeeList() {
        this.readEmplListFile();
        if(listOfEmployees.isEmpty() || listOfEmployees == null){
            createList();
            writeEmplListFile();
            readEmplListFile();
        }
        printEmplList();
    }

    public void createList(){
        Employee employee1 = new Employee("Hannah", "Kitchell", "hk123", "password1", "Customer Relations", 12345, 10);
        Employee employee2 = new Employee("Frankie", "Ansell", "fa234", "password2", "Human Resources", 12346, 15);
        Employee employee3 = new Employee("Jen", "Hodsdon", "jh345", "password3", "Delivery Management", 12347, 21);
        Employee employee4 = new Employee("Vince", "Semrau", "vs456", "password4", "Accounting", 12348, 7);
    }
    
    public void readEmplListFile(){
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try{
            fis = new FileInputStream(emplFileName);
            in = new ObjectInputStream(fis);
            listOfEmployees = (ArrayList)in.readObject();
            in.close();
            if(!listOfEmployees.isEmpty()){
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
    
    public void writeEmplListFile(){
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try{
            fos = new FileOutputStream(emplFileName);
            out = new ObjectOutputStream(fos);
            out.writeObject(listOfEmployees);
            out.close();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
    
    public void printEmplList(){
        for (Employee employee : listOfEmployees) {
            System.out.println(employee.toString());
        }
    }
    
    public ArrayList<Employee> getEmplList(){
        return listOfEmployees;
    }
    
    /**
     * This constructor will be used is there is already a list of employees 
     * @param listofEmployees 
     */
    /*
    public EmployeeList(ArrayList<Employee> listofEmployees) {
        this.listofEmployees = listofEmployees;
    }
*/
}
