package com.company.InterestCalculation;

import java.util.HashMap;

public class CompoundInterest {
Double principle;
int noOfIntervals;
int interestRate;
int timeInYears;

    SimpleInterest(Double p,int t,int r,int compoundTimeInMonths)
    {
        principle=p;
        timeInYears=t;
        interestRate=r;
        noOfIntervals=compoundTimeInMonths/12;
    }
    //-------------setter methods------------
    void setInterestRate(int r)
    {
        this.interestRate=r;
    }
    void setPrinciple(Double p)
    {
        this.principle=p;
    }
    void setTimeInYears(int t)
    {
        this.timeInYears=t;
    }
    void setCompundTimeInMonths(int months)
    {
        this.noOfIntervals=months/12;
    }

    //----------------getter methods
    Double getPrinciple()
    {
        return this.principle;
    }
    int getInterestRate()
    {
        return this.interestRate;
    }
    int getTimeInYears()
    {
        return this.timeInYears;
    }
    int getCompoundTimeIntervals()
    {
        return this.noOfIntervals;
    }

    //--------------calculating compound interest

    Double calculateCompoundInterst()
    {
        Double ci=this.interestRate/this.noOfIntervals;
        ci=Math.pow(ci,this.noOfIntervals*this.timeInYears);
        ci=ci*this.principle;
        return ci;
    }


}
