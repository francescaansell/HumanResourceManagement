//done
package controller;
import model.*; 
import view.*; 
import java.util.*; 

/**
 *
 * @author Group 1 HRM
 */
public class TimeSheetCntl { 
    public TimeSubmission timeSubmission; 
    public MyHoursUI view; 

    public TimeSheetCntl(TimeSubmission timeSubmission, MyHoursUI view) {
        this.timeSubmission = timeSubmission;
        this.view = view;
    }

    public void setEmployee(Employee employee){
        timeSubmission.setEmployee(employee);
    }
    public void setStartTimeFrame(Date startTimeFrame){
        timeSubmission.setStartTimeFrame(startTimeFrame);
    }
    public void setEndTimeFrame(Date endTimeFrame){
        timeSubmission.setEndTimeFrame(endTimeFrame);
    }
    public void setTotalHours(int totalHours){
        timeSubmission.setTotalHours(totalHours);
    }


    public Employee getTimeSubmissionEmployee(){
        return timeSubmission.getEmployee(); 
    }
    public Date getStartTimeFrame(){
        return timeSubmission.getStartTimeFrame();
    }
    public Date getEndTimeFrame(){
        return timeSubmission.getEndTimeFrame();
    }
    public Integer getTotalHours(){
        return timeSubmission.getTotalHours(); 
    }


    public void updateView(){
        //public void printHoursDetails(int totalHours, Date startTimeFrame, Date endTimeFrame, Employee employee)
        view.printHoursDetails(timeSubmission.getTotalHours(), timeSubmission.getStartTimeFrame(), timeSubmission.getEndTimeFrame(), timeSubmission.getEmployee()); 
    }
    
}


/* 
package facultyview;
public class CourseController {
    protected Course model;
    protected Faculty Fac;
    protected CourseView view;
    public CourseController(Faculty fac, Course model, CourseView view){
        this.model = model;
        this.Fac = fac;
        this.view = view;
        }
    public void setCourseName(String name){
        model.setName(name);      
        }
    public String getCourseName(){
        return model.getName();       
        }
    public void setCourseId(String id){
        model.setId(id);      
        }
    public String getCourseId(){
        return model.getId();    
        }
    public void setCourseCategory(String category){
        model.setCategory(category);      
        }
    public String getCourseCategory(){
        return model.getCategory();       
        }
    public void updateView(){                
        view.printCourseDetails(Fac.getName(), model.getName(), model.getId(), model.getCategory());
        }  
    }

*/
