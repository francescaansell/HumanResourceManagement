package view;

import controller.*;
import javax.swing.*; 
import java.awt.*; 
/**
 * This class will function as the user interface for entering hours 
 * @author Group1HRM
 */
public class MyHoursUI extends JFrame{
    Container container = getContentPane(); 

    private TimeSheetCntl timeSheetCntl; 
    

    public MyHoursUI(TimeSheetCntl timeSheetCntl){
        this.timeSheetCntl = timeSheetCntl; 
        
        setPreferredSize(new Dimension(816, 589)); 
        setLayout (null); 
    }
   
}

