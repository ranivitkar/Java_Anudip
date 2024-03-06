import java.util.Scanner;

class OpeDemo
{
public static void main(String args[])
{
	Scanner c=new Scanner(System.in);
	int a,b;
	
	System.out.println("Enter Two Numbers:");

	a=c.nextInt();
	b=c.nextInt();

	

	int add=a+b;
	System.out.println("Addition: "+add);

	int sub=a-b;
	System.out.println("Subtraction: "+sub);

	int mul=a*b;
	System.out.println("Multiplication: "+mul);

	int div=a/b;
	System.out.println("Division: "+div);

	int rem=a%b;
	System.out.println("Remainder: "+rem);
	

	
}
}
	
	