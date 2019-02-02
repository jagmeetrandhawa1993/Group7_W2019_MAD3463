package com.jagmeet;

public class CommissionBasedPartTime extends PartTimeEmployee
{
  private double commissionPerc;

    public CommissionBasedPartTime(String name,int age, float rate, float hoursWorked, double commissionPerc)
    {
        super(name,age,hoursWorked,hoursWorked);
        this.commissionPerc=commissionPerc;
    }

    double calcEarnings()
    {

        return((getRate()*getHoursWorked())+(commissionPerc/100)*(getRate()*getHoursWorked()));
    }


  public double getCommissionPerc() {

        return commissionPerc;
    }

    public void setCommissionPerc(double commissionPerc) {
        this.commissionPerc = commissionPerc;
    }
    public String toString()
    {
return( "Employee is PartTime/Commissioned"+"\n"+
        "Rate:"+getRate()+"\n"+
        "Hours Worked:"+getHoursWorked()+"\n"+
        "Commission:"+getCommissionPerc()+"\n"+
        "Earnings:"+calcEarnings()+
        ("("+getHoursWorked()*getRate()+" + "+getCommissionPerc()+"% of "+getHoursWorked()*getRate()+")"));
    }
}
