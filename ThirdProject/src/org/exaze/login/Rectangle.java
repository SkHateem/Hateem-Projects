package org.exaze.login;

public class Rectangle
{
	private int length;
	private int breadth;
	
	
	public Rectangle(int length, int breadth)
	{
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public void findArea()
	{
		System.out.println("Area of rectangle :"+(length * breadth));
	}
	
	

}
