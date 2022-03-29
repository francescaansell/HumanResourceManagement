//done
package Stubs;

import model.*;
import view.*;
import controller.*; 

public class TimeSheetCntlStub extends TimeSheetCntl{

    public TimeSheetCntlStub(TimeSheet timeSubmission, MyHoursUI view) {
        super(timeSubmission, view);
    }
    @Override 
    public void updateView(){
        view.printHoursDetails(timeSubmission.getTotalHours(), timeSubmission.getStartTimeFrame(), timeSubmission.getEndTimeFrame(), timeSubmission.getEmployee());
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
