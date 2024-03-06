import java.util.*;

class OverloadDemo
{
	int sum(int a,int b)
	{
		return (a+b);
	}

	int sum(int a,int b,int c)
	{
		return (a+b+c);
	}
	double sum(double a,double b)
	{
		return (a+b);
	}

	public static void main(String[] args) {
		OverloadDemo o=new OverloadDemo();

		System.out.println(o.sum(40,30));
		System.out.println(o.sum(100,200,300));
		System.out.println(o.sum(40.10,30.50));

	}
}