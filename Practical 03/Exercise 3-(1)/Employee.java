
package com.mycompany.prac3;


public class Employee 
{
    private String EmpName;
    private float BSalary;
    private float Bonus;
    private float BonusAmount;
    
    public void setEmpname(String Empname)
    {
        this.EmpName=Empname;        
    }
    public String getEmpName()
    {
        return(EmpName);
    }
    public void setBSalary(float Bsalary)
    {
        this.BSalary=Bsalary;        
    }
    public float getBSalary()
    {
       return(BSalary);
    }
    public Employee(float  Bonus)
    {
        this.Bonus=Bonus;
    }
    public void BonusAmount()
    {
       BonusAmount=BSalary+Bonus; 
        System.out.println("Bonus Amount:"+BonusAmount);
    }
}
