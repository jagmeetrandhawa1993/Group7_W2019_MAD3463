package com.jagmeet;

public class Intern
{
  private String schoolName;
  private float earnings;

    public float getEarnings() {
        return earnings;
    }

    public void setEarnings(float earnings) {
        this.earnings = earnings;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String toString()
    {
        return("Employee is intern"+"\n"+
                "School Name:"+getSchoolName()+"\n"+"Earnings:"+getEarnings());
    }


}
