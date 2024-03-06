import java.util.Scanner;

class CircleArea
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	double r,p=3.14,area;

   System.out.println("Enter Radius of Circle");
	r=sc.nextInt();

	area=p*r*r;
	System.out.println("Area of Circle: "+area);

}
}