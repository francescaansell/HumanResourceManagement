package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class PendingEmployeeList {
    public ArrayList<Employee> employeeList = new ArrayList<>();
    public String employeesFileName = "PendingEmployees.ser";
    
    public PendingEmployeeList(){
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try{
            fis = new FileInputStream(this.employeesFileName);
            in = new ObjectInputStream(fis);
            this.employeeList = (ArrayList)in.readObject();
            in.close();
            //if ( ! ((ArrayList)in.readObject()){
            if(!this.employeeList.isEmpty()){
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
        if(employeeList.isEmpty() || employeeList == null){
            createList();
            writeEmployeeListFile();
         
            try{
                fis = new FileInputStream(employeesFileName);
                in = new ObjectInputStream(fis);
                employeeList = (ArrayList)in.readObject();
                in.close();
                //if ( ! ((ArrayList)in.readObject()){
                if(!employeeList.isEmpty()){
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
        printEmployeeList();
    }
    
    public void createList(){
        Employee employee = new Employee();
        employeeList.add(employee); 
       
    }
    
    public void writeEmployeeListFile(){
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try{
            fos = new FileOutputStream(employeesFileName);
            out = new ObjectOutputStream(fos);
            out.writeObject(employeeList);
            out.close();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
    
    public void printEmployeeList(){
        System.out.println("Pending Employee List PrintEmployeList()-----------------");
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }
    
    public ArrayList<Employee> getemployeeList(){
        return employeeList;
    }

    public Integer getSize(){
        return employeeList.size(); 
    }

    public ArrayList<String> getStringList(){
        ArrayList<String> employeeNames = new ArrayList<>(); 
        for (Employee employee : employeeList){
            employeeNames.add(employee.getLastName());

        }
        return employeeNames; 
    }

  
}