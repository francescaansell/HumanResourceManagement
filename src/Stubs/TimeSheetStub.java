//done
package Stubs; 
import java.util.*; 
import model.*; 
public class TimeSheetStub extends TimeSheet{

    public TimeSheetStub(int totalHours, Date startTimeFrame, Date endTimeFrame, Employee employee, Boolean approved) {
        super(totalHours, startTimeFrame, endTimeFrame, employee, approved); 
    }
    
    @Override
    public int calculateTotalHours(){
        return 1; 
    }

    @Override
    public int getTotalHours() {
        return totalHours;
    }

    @Override
    public void setTotalHours(int totalHours) {
        this.totalHours = totalHours;
    }

    @Override
    public Date getStartTimeFrame() {
        return startTimeFrame;
    }

    @Override
    public void setStartTimeFrame(Date startTimeFrame) {
        this.startTimeFrame = startTimeFrame;
    }
    
    @Override
    public Date getEndTimeFrame() {
        return endTimeFrame;
    }

    @Override
    public void setEndTimeFrame(Date endTimeFrame) {
        this.endTimeFrame = endTimeFrame;
    }

    @Override
    public Employee getEmployee() {
        return employee;
    }

    @Override
    public void setEmployee(Employee employee) {
        this.employee = employee;
    }   
}

/*
package facultyview;
public class CourseStub extends Course {
    public CourseStub(String id) {
        super(id);
    }
    @Override
    public String getId() {
        return CourseId;
        }
    @Override
    public void setId(String id) {
        CourseId = id;
        }
    @Override
    public String getName() {
        return CourseName;
        }
    @Override
    public void setName(String name) {
        this.CourseName = name;
        }
    @Override
    public String getCategory() {
        return CourseCategory;
        }
    @Override
    public void setCategory(String category) {
        this.CourseCategory = category;
        }  
    }
*/
