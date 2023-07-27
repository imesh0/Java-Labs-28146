
package com.mycompany.prac3;


public class Test
{

 
   public static void main(String[] args)
    
{
        
	Employee E1=new Employee(10000.00f);
        
	E1.setEmpname("Bogdan");
        
	System.out.println("Employee name:"+E1.getEmpName());
        
	E1.setBSalary(50000);
        
	System.out.println("Basic Salary:"+E1.getBSalary());
        
	E1.BonusAmount();
        
    
}

}
