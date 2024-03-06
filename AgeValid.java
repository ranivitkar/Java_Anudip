import java.util.Scanner;

class AgeValid
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int age;

		System.out.println("Enter Your Age: ");
		age=sc.nextInt();

		if(age>=18){
			System.out.println("You are eligible for voting as your age is "+age);
		}
		else{
			System.out.println("You are not eligible for voting as your age is "+age);
		}
	}
}