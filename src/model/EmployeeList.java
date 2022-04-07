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
        //printEmployeeList();
    }
    
    public void createList(){
        Role role = new Role("Admin", 10);
        Employee employee1 = new Employee("Frankie", "Ansell", "frankieansell", "12345", new Department(), new Role("Admin", 10), 1092148, 0, true, new ArrayList<TimeSheet>());
        Employee employee2 = new Employee("Jen", "Hod", "jenhod", "12345", new Department(), role, 387952, 0, new ArrayList<TimeSheet>(), true, 0);
        Employee employee3 = new Employee("Vince", "S", "vinces", "12345", new Department(), role, 465654, 0, new ArrayList<TimeSheet>(), true, 0);
        Employee employee4 = new Employee("Hannah", "K", "hannahk", "12345", new Department(), role, 94857, 0, new ArrayList<TimeSheet>(), true, 0);
        employeeList.add(employee1); 
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4); 
        //employeeList.add(employee2); 
        //employeeList.add(employee3); 
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
}
