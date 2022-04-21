package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
public class EmployeeList {
    public ArrayList<Employee> employeeList = new ArrayList<>();
    public String employeesFileName = "Employees.ser";
    
    public EmployeeList(){
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try{
            fis = new FileInputStream(this.employeesFileName);
            in = new ObjectInputStream(fis);
            this.employeeList = (ArrayList<Employee>)in.readObject();
            in.close();
            if(!this.employeeList.isEmpty()){
                System.out.println("File Found");
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
                employeeList = (ArrayList<Employee>)in.readObject();
                in.close();
                if(!employeeList.isEmpty()){
                    System.out.println("File Found");
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
        Role admin = new Role("Admin", 10);
        Employee employee = new Employee("Jen", "Hod", "jah320", "Buddy123!".toCharArray(), "Shipping", admin, 1, true, "admin", "150 Main Street, State College PA, 16801", "d - 100,000");
        employeeList.add(employee); 

        Role supervisor= new Role("Supervisor", 20); 
        Employee employee2 = new Employee("Francesca", "Ansell", "fla568", "Ilovedogs7!".toCharArray(), "Shipping", supervisor, 2, true, employee.getEmployeeID(), "150 Main Street, State College PA, 16801", "d - 100,000"); 
        employeeList.add(employee2); 
        Employee employee3 = new Employee("Hannah", "Kitchell", "hak920", "Psustudent!".toCharArray(), "Shipping", supervisor, 3,  true, employee.getEmployeeID(), "150 Main Street, State College PA, 16801", "d - 100,000"); 
        employeeList.add(employee3); 
        Employee employee4 = new Employee("Vincent", "Semru", "ves824", "Coffeelover0!".toCharArray(), "Shipping", supervisor, 4, true, employee.getEmployeeID(), "150 Main Street, State College PA, 16801", "d - 100,000"); 
        employeeList.add(employee4); 

        Role r = new Role("Employee", 40); 
        Employee employee5 = new Employee("Guy", "Kane", "gpk509", "Netflix2!".toCharArray(), "Shipping", r, 5,true, employee.getEmployeeID(), "150 Main Street, State College PA, 16802", "d - 100,000");
        employeeList.add(employee5);
        Employee employee6 = new Employee("test", "test", "abc123", "12345".toCharArray(), "Shipping", r, 5, true, employee.getEmployeeID(), "150 Main Street, State College PA, 16802", "d - 100,000");
        employeeList.add(employee6);
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
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }
    }
    
    public ArrayList<Employee> getemployeeList(){
        return employeeList;
    }

    public ArrayList<String> getEmployeeIDs(){
        ArrayList<String> employeeIDs = new ArrayList<>(); 
        for (Employee employee: employeeList){
            employeeIDs.add(employee.getEmployeeID()); 
        }
        return employeeIDs; 
    }
}
