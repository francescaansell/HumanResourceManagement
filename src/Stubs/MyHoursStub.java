package Stubs;

import java.util.*; 
import model.*; 
import view.*; 

public class MyHoursStub extends MyHoursUI{
    @Override
    public void printHoursDetails(int totalHours, Date startTimeFrame, Date endTimeFrame, Employee employee){
        System.out.println("total hours: " + totalHours); 
    }   
}



/*
package facultyview;

public class CourseViewStub extends CourseView {
    @Override
    public void printCourseDetails(String FacultyName, String CourseName, String CourseId, String CourseCategory){
          System.out.println("Faculty Course Details: ");
          System.out.println("Faculty Name: " + FacultyName);
          System.out.println("Course Name: " + CourseName);
          System.out.println("Course Category: " + CourseCategory);
          System.out.println("Course ID: " + CourseId);
       }
    
}

*/