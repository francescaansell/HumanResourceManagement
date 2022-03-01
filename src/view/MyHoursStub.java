package view;

import java.util.*; 
public class MyHoursStub extends MyHoursUI{
    @Override
    public void printHoursDetail(int totalHours, Date startTimeFrame, Date endTimeFrame, Employee employee){
        System.out.println("total hours: " + totalHours); 
    }

    
}
