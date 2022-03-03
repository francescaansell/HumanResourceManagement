package Stubs;

import controller.*;
import model.*; 
import view.*; 

public class EmployeeCntlStub extends EmployeeCntl{
    public EmployeeCntlStub(Employee employee, EmployeeUI view) {
        super(employee, view);

    }

    @Override 
    public void updateView(){
        view.printEmployeeDetails(employee.getFirstName(), employee.getLastName(), employee.getUserName(), employee.getDepartment(), employee.getEmployeeID(), employee.getFullTime());
    }
    
}




/*
package facultyview;
public class CourseControllerStub extends CourseController {
    public CourseControllerStub(Faculty fac, Course model, CourseView view) {
        super(fac, model, view);
    }
    @Override
    public void updateView(){                
        view.printCourseDetails(Fac.getName(), model.getName(), model.getId(), model.getCategory());
        } 
    }




*/