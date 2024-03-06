import java.util.*;

class Grade
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int m;

		System.out.println("Enter your marks out of 100:");
		m=sc.nextInt();

		if(m>80){
			System.out.println("Your Grade is A");
		}
		else if(60<m && m<=80){
			System.out.println("Your Grade is B");
		}
		else if(50<m && m<=60){
			System.out.println("Your Grade is C");
		}
		else if(45<m && m<=50){
			System.out.println("Your Grade is D");
		}
		else if(25<=m && m<=45){
			System.out.println("Your Grade is E");
		}
		else{
			System.out.println("Your Grade is F");
		}
	}
	
}