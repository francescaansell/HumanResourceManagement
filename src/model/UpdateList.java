package model;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author njspo
 */
public class UpdateList {

    private ArrayList<Employee> updateList = new ArrayList<>();
    private String updatesFileName = "updates.txt";
    //private HashMap<Update,Person> announcePoster = new HashMap<>();

    public UpdateList() {
        this.readUpdateListFile();
        if (updateList.isEmpty() || updateList == null) {
            createList();
            writeUpdateListFile();
            readUpdateListFile();
        }
        printUpdateList();
    }

    public void createList() {
        // Address add1 = new Address(222, "Atherton Hall", "University Park", "PA", "16802");
        // Address add2 = new Address(316, "Tener Hall", "University Park", "PA", "16802");
        // Person p1 = new Person(add1, "jbh5825@psu.edu", "Jen Hodsdon");
        // Person p2 = new Person(add2, "lfj6143@psu.edu", "Lindsay Jones");
        // EventDate date1 = new EventDate(14, "Monday", "1:00pm", 9, 2020);
        // EventDate date2 = new EventDate(1, "Thursday", "11:00am", 10, 2020);
        // Address add3 = new Address(134, "Simmons Hall", "University Park", "PA", "16802");
        // Address add4 = new Address(316, "Mifflin Hall", "University Park", "PA", "16802");
        // Person p3 = new Person(add3, "sas3578@psu.edu", "James Smith");
        // Person p4 = new Person(add4, "mpd6532@psu.edu", "Sam Caputo");
        // EventDate date3 = new EventDate(29, "Tuesday", "12:00pm", 9, 2020);
        // EventDate date4 = new EventDate(5, "Monday", "10:00am", 10, 2020);
        // Update up1 = new Update("Springfield will be live answering questions on Monday", p1, date1);
        // Update up2 = new Update("Caliente will be dancing live this Thursday", p2, date2);
        // Update up3 = new Update("Days for Girls has a 'Get to Know Us' event", p3, date3);
        // Update up4 = new Update("PSU Acapella will be singing live", p4, date4);
        // updateList.add(up1);
        // updateList.add(up2);
        // updateList.add(up3);
        // updateList.add(up4);
    }
    
    

    public void readUpdateListFile() {
        FileInputStream fis = null;
        ObjectInputStream in = null;
        try {
            fis = new FileInputStream(updatesFileName);
            in = new ObjectInputStream(fis);
            updateList = (ArrayList) in.readObject();
            in.close();
            if (!updateList.isEmpty()) {
                System.out.println("There were updates in the file");
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File was not found, new one was created");
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }

    public void writeUpdateListFile() {
        FileOutputStream fos = null;
        ObjectOutputStream out = null;
        try {
            fos = new FileOutputStream(updatesFileName);
            out = new ObjectOutputStream(fos);
            out.writeObject(updateList);
            out.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void printUpdateList() {
        for (Employee employee : updateList) {
        
            System.out.println(employee.toString());
        }
    }

    public ArrayList<Employee> getUpdateList() {
        return updateList;
    }
}
