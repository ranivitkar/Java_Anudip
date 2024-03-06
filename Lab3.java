/*
Q.3)Write a Java program to create a class called Shape with methods called getPerimeter() and getArea(). 
Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the 
area and perimeter of a circle.
*/

import java.util.*;

class Shape
{
	int getPerimeter(int l,int b){
         
         return 2*(l+b);
	}

	int getArea(int l,int b){
		return (l*b);
	}
}

class Circle extends Shape
{
	double getPerimeter(double r){

		return (2*3.14*r);

	}

	double getArea(double r){

		return (3.14*r*r);
	}
}

class Lab3
{
	public static void main(String[] args) {
		Circle c=new Circle();

		System.out.println("Perimeter of Rectangle: ",c.getPerimeter(5,6));
		System.out.println("Area of Rectangle: ",c.getArea(5,6));

		System.out.println("Perimeter of Circle: ",c.getPerimeter(4.5));
		System.out.println("Area of Circle: ",c.getArea(4.5));
	}
}