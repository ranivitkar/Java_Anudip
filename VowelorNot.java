import java.util.Scanner;

class VowelorNot
{
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		System.out.println("Enter Character");
		char c=s.next().charAt(0);

		switch(c){
			case 'a':
			System.out.println(c+" it is Vowel");
			break;

			case 'e':
			System.out.println(c+" it is Vowel");
			break;

			case 'i':
			System.out.println(c+" it is Vowel");
			break;

			case 'o':
			System.out.println(c+" it is Vowel");
			break;

			case 'u':
			System.out.println(c+" it is Vowel");
			break;

			default:
			System.out.println(c+ " it is not Vowel");
		}

	}
}
		