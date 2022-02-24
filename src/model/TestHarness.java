/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import controller.LoginCntl;
import model.EmployeeList;
import view.LoginUI;
import model.Employee;

/**
 *
 * @author njspo
 */
public class TestHarness {
    public TestHarness() {
        testLoginCntl();
    }
    
    public void testLoginCntl(){
        //ArrayList<Joinable> organizations = new ArrayList<>();
        ArrayList<Employee> emp = new ArrayList<>();
        LoginCntl loginController = new LoginCntl(new EmployeeList(emp));
//        Address add1 = new Address(206, "Hub Floor 2", "University Park", "PA", "16802");
//        Address add2 = new Address(314, "Hub Floor 3", "University Park", "PA", "16802");
//        Address add3 = new Address(111, "Hub Floor 1", "University Park", "PA", "16802");
//        Address add4 = new Address(242, "Hub Floor 2", "University Park", "PA", "16802");
//        Joinable org1 = new Service("THON org", "THON special interest org", "thon@psu.edu", "Raise money FTK", "@THON", "service", add1);
//        Joinable org2 = new Fitness("Club Sport", "expert", "Hockey", "clubhockey@psu.edu", "Play hockey against other club teams", "@PSUclubhockey", "fitness", add2);
//        Joinable org3 = new Service("Sustainability org", "Days for girls", "daysforgirls@psu.edu", "Sew reusable kits", "@DFGPennState", "service", add3);
//        Joinable org4 = new Fitness("Dance Team", "beginner", "Ballroom dance", "ballroom@psu.edu", "Learn how to ballroom dance", "@PSUballroom", "fitness", add4);
//        organizations.add(org1);
//        organizations.add(org2);
//        organizations.add(org3);
//        organizations.add(org4);
//        for (Joinable organization : organizations) {
//            organization.joinOrg();
//            organization.print(); 
        }
    }   
    
//    public void testClassHierarchy(){
//        ArrayList<Organization> organizations = new ArrayList<>();
//        Address add1 = new Address(206, "Hub Floor 2", "University Park", "PA", "16802");
//        Address add2 = new Address(314, "Hub Floor 3", "University Park", "PA", "16802");
//        Address add3 = new Address(111, "Hub Floor 1", "University Park", "PA", "16802");
//        Address add4 = new Address(242, "Hub Floor 2", "University Park", "PA", "16802");
//        Organization org1 = new Service("THON org", "THON special interest org", "thon@psu.edu", "Raise money FTK", "@THON", "service", add1);
//        Organization org2 = new Fitness("Club Sport", "expert", "Hockey", "clubhockey@psu.edu", "Play hockey against other club teams", "@PSUclubhockey", "fitness", add2);
//        Organization org3 = new Service("Sustainability org", "Days for girls", "daysforgirls@psu.edu", "Sew reusable kits", "@DFGPennState", "service", add3);
//        Organization org4 = new Fitness("Dance Team", "beginner", "Ballroom dance", "ballroom@psu.edu", "Learn how to ballroom dance", "@PSUballroom", "fitness", add4);
//        organizations.add(org1);
//        organizations.add(org2);
//        organizations.add(org3);
//        organizations.add(org4);
//        for (Organization organization : organizations) {
//            System.out.println(organization.getOrgDetails()); 
//        }
//    }
//    
//    public void testAddress(){
//        //test address class
//        Address add1 = new Address(23, "Belmont Drive", "Robbinsville", "NJ", "08691");
//        if (add1 != null){
//            System.out.println("Test address created successfully");
//            System.out.println(add1.toString());
//            add1.setCity("");
//            System.out.println(add1.toString());
//            add1.setState("PA");
//            System.out.println(add1.toString());
//            add1.setStreetName("Main Street");
//            System.out.println(add1.toString());
//            add1.setStreetNum(0);
//            System.out.println(add1.toString());
//            add1.setStreetNum(222);
//            System.out.println(add1.toString());
//            add1.setZip("16802");
//            System.out.println(add1.toString());
//            add1.setCity("State College");
//            System.out.println(add1.toString());
//        }
//        else {
//            System.out.println("Instrument is null");
//        }
//    }
//    
//    public void testDate(){
//        //test date class
//        EventDate date1 = new EventDate(14, "Monday",  "1:00pm",9, 2020);
//        System.out.println(date1.toString());
//        date1.setDayOfWeek("Thursday");
//        System.out.println(date1.toString());
//        date1.setDateNum(15);
//        System.out.println(date1.toString());
//        date1.setDateNum(0);
//        System.out.println(date1.toString());
//        date1.setMonth(10);
//        System.out.println(date1.toString());
//        date1.setTime("11:30 am");
//        System.out.println(date1.toString());
//    }
    
//}
