import java.util.*;
import java.util.Scanner;

class numSwap
{

		public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);
		int a,b;
       System.out.println("Enter 1st number");
		a=sc.nextInt();
		System.out.println("Enter 2nd number");
		b=sc.nextInt();

		System.out.println("Before Swapping a="+a+" b="+b);
       
		a=a+b;
		b=a-b;
       a=a-b;

		System.out.println("After Swapping a="+a+" b="+b);

	}

}
		

  