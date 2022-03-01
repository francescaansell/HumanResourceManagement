package Stubs;

import java.util.*; 
import model.*; 
import view.*; 

public class MyVacationStub extends MyVacationUI{
    @Override
    public void printVacationDetails(boolean approved, int numDaysRequested, Employee assignmedEmployee, VacationEligibility vacationEligibility){
        System.out.println("MyVacationStub");
        
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