/*
we use switch for menu driven programming.
means user will input a choice based on that particular case will be handled.

syntax:

switch(ch)
{
	case 1:
	block of stmt;
	break;
	case 2:
	block of stmt;
	break;
	default:
	block of stmt;
	break;
}
*/
import java.util.Scanner;

class SwitchEx
{
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number between 1 to 7");
		int d=s.nextInt();

		switch(d){
			case 1:
			System.out.println("It's Monday");
			break;

			case 2:
			System.out.println("It's Tuseday");
			break;

			case 3:
			System.out.println("It's Wendseday");
			break;

			case 4:
			System.out.println("It's Thursday");
			break;

			case 5:
			System.out.println("It's Friday");
			break;

			case 6:
			System.out.println("It's Saturday");
			break;

			case 7:
			System.out.println("It's Sunday");
			break;

			default:
			System.out.println("Invalid Input");
		}
	}
}