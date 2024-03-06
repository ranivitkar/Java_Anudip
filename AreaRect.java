/*
Write a Java program to create a class called Shape with a method called getArea().
 Create a subclass called Rectangle that overrides the getArea() method 
 to calculate the area of a rectangle.
Q.2)Write a Java program to create a class known as "BankAccount" with methods called deposit() 
and withdraw(). Create a subclass called SavingsAccount that overrides the withdraw() method 
to prevent withdrawals if the account balance falls below one hundred.
Q.3)Write a Java program to create a class called Shape with methods called getPerimeter() and getArea(). 
Create a subclass called Circle that overrides the getPerimeter() and getArea() methods to calculate the 
area and perimeter of a circle.
Sangeeta Praveenkumar
12:32 PM
Q.4)Write a Java program to create a vehicle class hierarchy. The base class should be Vehicle, with 
subclasses Truck, Car and Motorcycle. Each subclass should have properties such as make, model, year, 
and fuel type. Implement methods for calculating fuel efficiency, distance traveled, and maximum speed.
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