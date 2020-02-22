package com.company.InterestCalculation;

public class SimpleInterest {
 Double principle;
 int interestRate;
 int timeInYears;
 SimpleInterest(Double p,int t,int r)
 {
     principle=p;
     timeInYears=t;
     interestRate=r;
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

 //------------calculating simple interest
 Double calculateSimpleInterest(){
     Double amount=this.principle*this.timeInYears*this.interestRate;
     amount/=100;
     return amount;
 }

}
