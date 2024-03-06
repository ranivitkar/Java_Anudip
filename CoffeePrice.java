
import java.util.Scanner;

class CoffeePrice
{
	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your choice");
		System.out.println("1. Iced Coffee\n 2.Cortado\n 3. Affogato\n 4. Irish Coffee\n 5. Doppio\n 6. Cold brew");
		int c=s.nextInt();

		switch(c){
			case 1:
			System.out.println("Iced Coffee Price: 10$");
			break;

			case 2:
			System.out.println("Cortado Price: 15$");			break;

			case 3:
			System.out.println("Affogato Price: 12$");
			break;

			case 4:
			System.out.println("Irish Coffee Price: 20$");
			break;

			case 5:
			System.out.println("Doppio Price: 10$");
			break;

			case 6:
			System.out.println("Cold brew");
			break;

			default:
			System.out.println("Your choice is not there");
		}
	}
}