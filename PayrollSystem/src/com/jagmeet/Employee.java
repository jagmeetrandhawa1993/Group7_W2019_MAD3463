package com.jagmeet;

public class Employee
{
    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String name,int age) {
        this.name = name;
        this.age = age;

    }

    int calcBirthYear()
    {
        return(2019-age);
    }

    public int calEarnings()
    {
        return(1000);
    }


    public String toString()
    {
        return("Name="+name+"\n "+"Age="+age+" \n");
    }


}
