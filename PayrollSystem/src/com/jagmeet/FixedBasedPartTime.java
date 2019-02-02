package com.jagmeet;

public class FixedBasedPartTime extends PartTimeEmployee
{
  private float fixedAmount;

    public float getFixedAmount() {
        return fixedAmount;
    }

    public void setFixedAmount(float fixedAmount) {
        this.fixedAmount = fixedAmount;
    }

    public FixedBasedPartTime(String name,int age,float rate, float hoursWorked,float fixedAmount)
    {
        super(name,age,rate,hoursWorked);
        this.fixedAmount=fixedAmount;

    }

    double calcEarnings()
    {
        return(getRate()*getHoursWorked()+getFixedAmount());
    }
    public String toString()
    {
        return( "Employee is PartTime/Fixed"+"\n" +
                "Rate:"+getRate()+"\n"+
                "Hours Worked:"+getHoursWorked()+"\n" +
                "Fixed Amt:"+getFixedAmount()+"\n" +
                "Earnings:"+calcEarnings() +
                 ("("+getHoursWorked()*getRate()+"+"+getFixedAmount()+")"));
    }
}
