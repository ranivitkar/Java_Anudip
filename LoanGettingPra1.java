import java.util.Scanner;

class LoanGettingPra1
{
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter Your Salary");
		int sal=s.nextInt();
		
		

		if(sal>50000){
			System.out.println("Enter your citizen");
			String cit=s.next();
			System.out.println(cit);
			if(cit.equals("india"))
				{			
					System.out.println("You are eligible for getting Loan");
				}
			else{
			     System.out.println("You are not eligible for getting Loan");
		}
		}
		else{
			System.out.println("You are not eligible for getting Loan");
		}
	}
}