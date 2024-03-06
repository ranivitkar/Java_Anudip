import java.util.*;

class Myarea
{
	int area(int s)
	{
		int sqarea=s*s;
		return sqarea;
	}
	double sum(int a,double b)
	{
		double c=a+b;
		return c;
	}
}

class ReturnDemo
{
	public static void main(String[] args) {
		Myarea m=new Myarea();
		System.out.println("Area of square: "+m.area(10));

		System.out.println("sum: "+m.sum(10,70.90));
	}
}