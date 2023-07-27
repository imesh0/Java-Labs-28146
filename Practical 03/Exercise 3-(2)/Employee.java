package com.mycompany.prac3;

public class Employee 
{
    private String Name;
    private int Age;
    private float Salary;
    
    public Employee(String Name,int Age,float Salary)
    {
       this.Name=Name;    
       this.Age=Age;
       this.Salary=Salary;
    }
    public String getName()
    {
        return Name;
    }
     
    public int getAge()
    {
        return Age;
    }
     
    public float getSalary()
    {
        return Salary;
    }
}
