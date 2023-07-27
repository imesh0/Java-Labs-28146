package com.mycompany.prac5;

public class Circle extends Main
{
    private double radius;
    
    public Circle(int r)
    {
        this.radius=r;
    }
    
    public void calculateArea()
    {
        area=radius*radius*pi;
    }
    
    
}
