import java.util.*;

class ComBonus
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int year;
	double b;
	float sal;

	System.out.println("Enter year of service: ");
	year=sc.nextInt();

	if(year>5)
	{
		System.out.println("Enter your salary: ");
		sal=sc.nextFloat();
        b=0.05*sal;
        System.out.println("Your Bonus amount is "+b);

	}
	else{
		System.out.println("Sorry you didn't appear for bonus");
	}
}
}