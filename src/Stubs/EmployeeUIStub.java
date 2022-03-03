package Stubs;

import view.EmployeeUI;

public class EmployeeUIStub extends EmployeeUI {

    @Override
    public void printEmployeeDetails(String firstName, String lastName, String userName, String department, int employeeID, Boolean fullTime){
        System.out.println("First name: " + firstName);
        System.out.println("Last name: " + lastName);
        System.out.println("User name: " + userName);
        System.out.println("Department: " + department);
        System.out.println("EmployeeID: " + employeeID);
        System.out.println("Full-time status: " + fullTime);


    
}

}