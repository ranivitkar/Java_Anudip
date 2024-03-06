/*
Write a Java program to create a class called Shape with a method called getArea().
 Create a subclass called Rectangle that overrides the getArea() method 
 to calculate the area of a rectangle.



*/

import java.util.*;

class Shape
{
	int getArea(int l,int b){

		return (l*b);
	}
}

class Rectangle extends Shape
{
	double getArea(double l,double b){
		return (l*b);
	}
}


class Lab1AreaRect
{
	public static void main(String[] args) {
		
		Rectangle r=new Rectangle();

		System.out.println("Area of rectangle with integer value: "+r.getArea(7,3));
		System.out.println("Area of rectangle with decimal value: "+r.getArea(7.5,3.5));
	}
	
}