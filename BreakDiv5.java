import java.util.*;

class BreakDiv5
{
	public static void main(String[] args) {
		int num;
		Scanner sc=new Scanner(System.in);

		while(true){
			System.out.println("Enter a number");
			num=sc.nextInt();
			if(num%5==0){
				System.out.println("You are exited!");
				break;
			}
		}
	}
}