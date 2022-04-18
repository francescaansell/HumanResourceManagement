package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Random;

public class ComplaintList {
    public ArrayList<Complaint> complaintList = new ArrayList<>();
    public String complaintsFileName = "Complaints.ser";
    
    public ComplaintList(){
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try{
            fis = new FileInputStream(complaintsFileName);
            in = new ObjectInputStream(fis);
            this.complaintList = (ArrayList)in.readObject();
            in.close();
            if(!this.complaintList.isEmpty()){
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
        if(complaintList.isEmpty() || complaintList == null){
            createList();
            writecomplaintListFile();
         
            try{
                fis = new FileInputStream(complaintsFileName);
                in = new ObjectInputStream(fis);
                complaintList = (ArrayList)in.readObject();
                in.close();
                //if ( ! ((ArrayList)in.readObject()){
                if(!complaintList.isEmpty()){
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
        printcomplaintList();
    }
    
    public Integer createComplaintID(){
        ComplaintList complaintList = new ComplaintList(); 
        Random rand = new Random();
        Integer id = rand.nextInt(1000); 
        ArrayList<Integer> employeeIDs = complaintList.getComplaintIDs(); 
        int i = 0; 
        while (i < employeeIDs.size()){
            if (id == employeeIDs.get(i)){
                id = rand.nextInt(1000); 
                i = 0; 
            } else {
                i += 1; 
            }
        }
        return id; 
        
        
    }

    public void createList(){
        Role admin = new Role("Admin", 10);
        Role supervisor= new Role("Supervisor", 20); 
        Employee employee = new Employee("Jen", "Hod", "jah320", "buddy123!", new Department(), admin, 1, new ArrayList<TimeSheet>(), true, "admin", "150 Main Street, State College PA, 16801", "d - 100,000");
        Employee employee2 = new Employee("Francesca", "Ansell", "fla568", "ilovedogs7!", new Department(), supervisor, 2, new ArrayList<TimeSheet>(), true, employee.getEmployeeID(), "150 Main Street, State College PA, 16801", "d - 100,000");

        Date date = new Date(System.currentTimeMillis());
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'at' HH:mm:ss z");
        formatter.format(date); 

        Complaint complaint = new Complaint(0, "Management", employee, date, date, employee2, true, false, "", "");
        complaintList.add(complaint); 
        Complaint complaint2 = new Complaint(0, "Discrimination", employee2, date, date, employee, true, false, "", "");
        complaintList.add(complaint2); 

        Role r = new Role("Employee", 40); 
        Employee employee5 = new Employee("Guy", "Kane", "gpk509", "netflix2!", new Department(), r, 5, new ArrayList<TimeSheet>(), true, employee.getEmployeeID(), "150 Main Street, State College PA, 16802", "d - 100,000");
         

        //     String[] types = {"", "Management", "Payroll/Salary", "Sexual Misconduct", "Discrimination"}; 
        Complaint complaint3 = new Complaint(0, "Payroll/Salary", employee, date, date, employee5, true, false, "", "");
        complaintList.add(complaint3);
        Complaint complaint4 = new Complaint(0, "Sexual Misconduct", employee, date, date, employee5, true, false, "", "");
        complaintList.add(complaint4);


    
    }
    
    public void writecomplaintListFile(){
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try{
            fos = new FileOutputStream(complaintsFileName);
            out = new ObjectOutputStream(fos);
            out.writeObject(complaintList);
            out.close();
        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
    
    public void printcomplaintList(){
        //arraylist size here is 0
        for (Complaint complaint : complaintList) {
            System.out.println(complaint.toString());
        }
      
    }
    
    public ArrayList<Complaint> getcomplaintList(){
        return complaintList;
    }

    public ArrayList<Integer> getComplaintIDs(){
        ArrayList<Integer> complaintIDs = new ArrayList<>(); 
        for (Complaint complaint: complaintList){
            complaintIDs.add(complaint.getId());
        }
        return complaintIDs; 
    }

    

}