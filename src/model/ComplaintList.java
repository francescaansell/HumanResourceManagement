package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ComplaintList {
    public ArrayList<Complaint> complaintList = new ArrayList<>();
    public String complaintsFileName = "Complaints.ser";
    
    public ComplaintList(){
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try{
            fis = new FileInputStream(this.complaintsFileName);
            in = new ObjectInputStream(fis);
            this.complaintList = (ArrayList)in.readObject();
            in.close();
            //if ( ! ((ArrayList)in.readObject()){
            if(!this.complaintList.isEmpty()){
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
        if(complaintList.isEmpty() || complaintList == null){
            System.out.println("Creating a new list"); 
            writeComplaintListFile();
         
            try{
                fis = new FileInputStream(complaintsFileName);
                in = new ObjectInputStream(fis);
                complaintList = (ArrayList)in.readObject();
                in.close();
                //if ( ! ((ArrayList)in.readObject()){
                if(!complaintList.isEmpty()){
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
        printComplaintList();
    }
    
    public void writeComplaintListFile(){
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
    
    public void printComplaintList(){
        //arraylist size here is 0
        for (Complaint complaint : complaintList) {
            System.out.println(complaint.toString());
        }
      
    }
    
    public ArrayList<Complaint> getComplaintList(){
        return complaintList;
    }
}