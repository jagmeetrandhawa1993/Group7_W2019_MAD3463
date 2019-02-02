package com.jagmeet;

public class Main {

    public static void main(String[] args)
    {
        Employee e=new Employee("meet",40);
        System.out.println(e);
       CommissionBasedPartTime c=new CommissionBasedPartTime("jagmeet",25,10,5,20);
       // CommissionBasedPartTime C=new CommissionBasedPartTime(E.getName(),E.getAge(),10,5,20);
        System.out.println(c);
        Employee e1=new Employee("preet",30);
        System.out.println(e1);
        FixedBasedPartTime f=new FixedBasedPartTime("sam",35,15,40,2000);
        System.out.println(f);
    }
}
