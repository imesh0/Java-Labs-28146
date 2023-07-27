

package com.mycompany.prac4;



public class Main 

{

    
public static void main(String[] args)
    
{
       
	Student S1=new Student(1111,"Imesh Rathnayake","Java");
        
	System.out.println("Student Id:"+S1.getID());
        
	System.out.println("Student name:"+S1.getName());
        
	System.out.println("Student course:"+S1.getCourse());
  
      
        
	System.out.println();

        
        
	Lecturer L1=new Lecturer(2222,"Mr.Shefraz","Java");
        
	System.out.println("Lecturer Id:"+L1.getID());
        
	System.out.println("Letcturer name:"+L1.getName());
        
	System.out.println("Lecturer Programme:"+L1.getProgramme());
       
    
}

}
