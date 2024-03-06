import java.util.*;

class RectSquare
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int l,b;

	System.out.println("Enter length of rectangle: ");
	l=sc.nextInt();

	System.out.println("Enter Breadth of Rectangle: ");
	b=sc.nextInt();

	if(l==b){
		System.out.println("This is a Square");
	}
	else{
		System.out.println("This is Rectangle");
	}
}
}