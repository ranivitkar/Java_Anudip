import java.util.Scanner;

class Calculator
{
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int a,b;
		System.out.println("Enter your choice");
		System.out.println("1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Division\n 5.Modulus");
        int c=s.nextInt();

		switch(c){
			case 1:
			System.out.println("Enter Two numbers");
			a=s.nextInt();
			b=s.nextInt();
			System.out.println(a+"+"+b+"="+(a+b));
			break;

			case 2:
			System.out.println("Enter Two numbers");
			a=s.nextInt();
			b=s.nextInt();
			System.out.println(a+"-"+b+"="+(a-b));
			break;

			case 3:
			System.out.println("Enter Two numbers");
			a=s.nextInt();
			b=s.nextInt();
			System.out.println(a+"*"+b+"="+(a*b));
			break;

			case 4:
			System.out.println("Enter Two numbers");
			a=s.nextInt();
			b=s.nextInt();
			System.out.println(a+"/"+b+"="+(a/b));
			break;

			case 5:
			System.out.println("Enter Two numbers");
			a=s.nextInt();
			b=s.nextInt();
			System.out.println(a+"%"+b+"="+(a%b));
			break;

			default:
			System.out.println("Invalid Input");
			break;

		}
	}
}