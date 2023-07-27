
package com.mycompany.prac4;

public class Lecturer extends Person
{
    private String programme;
    
    public Lecturer(int ID,String name,String pro)
    {
        super(ID,name);
        this.programme=pro;
    }
    public String getProgramme()
    {
        return programme;
    }
}
