import java.util.Scanner;

class StringInputDemo
{
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		String name;
		System.out.println("Enter your name");
		name=s.nextLine();

		System.out.println("Hello "+name);
		System.out.println("Your name 1st Character is "+name.charAt(0));
	}
}