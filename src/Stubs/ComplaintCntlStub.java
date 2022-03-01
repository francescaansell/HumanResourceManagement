package Stubs;

import view.*; 
import model.*; 
import controller.*; 
public class ComplaintCntlStub extends ComplaintCntl{

    public ComplaintCntlStub(Complaint complaint, Employee employee, MyComplaintsUI view) {
        super(complaint, employee, view);   
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

