import java.util.Scanner;

class SimpleInterest
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	double p,r=4.5,n,SI;

	System.out.println("Enter Principal: ");
	p=sc.nextInt();

	System.out.println("Enter period in year: ");
	n=sc.nextInt();

	SI=(p*r*n)/100;

	System.out.println("Simple Interest: "+SI);

}
}