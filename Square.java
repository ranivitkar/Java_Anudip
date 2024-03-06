import java.util.Scanner;

class Square
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int a,sq;

	System.out.println("Enter Number: ");
	a=sc.nextInt();
	sq=a*a;

	System.out.println("The Square of "+a+" is "+sq);

}
}