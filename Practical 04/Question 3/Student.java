
package com.mycompany.prac4;

public class Student extends Person
{
    private String course;
    
    public Student(int ID,String name,String course)
    {
        super(ID,name);
        this.course=course;
    }
    public String getCourse()
    {
        return course;
    }
}
