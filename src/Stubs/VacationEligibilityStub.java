package Stubs;

import model.*; 
public class VacationEligibilityStub extends VacationEligibility{

    @Override
    public void calculateTotPTO(){
        numTotPTO = numLeaveDays + numPurchasedDays;
    }

    @Override
    public void retrieveNumLeaveDays(){
        if(timeWorked.equals("partTime"))
            numLeaveDays = 5;
        else if(timeWorked.equals("fullTime"))
            numLeaveDays = 14;
        else{
            throw new NullPointerException("Part-time/Full-time classification not set");
        }
    }

    @Override
    public void purchasePTO(int hours){
        numPurchasedDays += hours;
    }
    
}
