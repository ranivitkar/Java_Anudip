import java.util.*;

class Divby5n11
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n;

		System.out.println("Enter a number");
		n=sc.nextInt();

		if(n%5==0 && n%11==0){
			System.out.println(n+" This number is divisible by 5 and 11");
		}
		else{
			System.out.println(n+" This number is not divisible by 5 and 11");
		}

	}

}