import java.util.*;

class Leapyear
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		int y;

		System.out.println("Enter Year");
		y=sc.nextInt();

		if((y%400==0) || (y%4==0 && y%100!=0)){

			System.out.println(y+ " This is Leap Year");
		}
		else{
			System.out.println(y+ " This is not Leap Year");
		}
	}
}