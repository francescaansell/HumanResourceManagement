//FIX
package model;



/**
 *
 * @author Group 1 HRM
 */
public class VacationEligibility {

    protected String firstName, lastName, userName, department, timeWorked; 
    protected int employeeID; 
    protected int numLeaveDays;   //Paid Time Off based off of fulltime/parttime(PTO)
    protected int numPurchasedDays; ////Paid Time Off that has been purchased by employee
    protected int numTotPTO;

    //Empty Constructor
    public VacationEligibility(){

    }

    public void calculateTotPTO(){
        //To calculate the total PTO that an employee has in their bank
    }

    public void retrieveNumLeaveDays(){
        //To retrieve the number of leave days that the employee has based on their full-time/part-time classification
    }

    public int getNumTotPTO(){
        return numTotPTO;
    }

    public void purchasePTO(int hours){
        numPurchasedDays += hours;
        //Increment the employees number of purchased PTO that is used to calcualte total PTO
    }

    @Override
    public String toString() {
        return super.toString();
    }  
}


