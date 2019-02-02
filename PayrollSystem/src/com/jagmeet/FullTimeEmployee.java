package com.jagmeet;

public class FullTimeEmployee extends Employee
{
    private double salary;
    private double bonus;

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    double calcEarnings()
    {
        return(getSalary()+getBonus());
    }
    public FullTimeEmployee(String name,int age,double salary,double bonus)
    {
        super(name,age);
        this.salary=salary;
        this.bonus=bonus;


    }

    public String toString()
    {
        return( "Employee is Full Time Employee"+"\n"+
                "Salary"+getSalary()+"\n"+
                "Bonus"+getBonus()+"\n"+
                "Earnings"+calcEarnings());
    }

}
