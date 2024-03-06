import java.util.*;

class RevNum
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,rem=0,rev=0; 
		System.out.println("Enter anumber");
		n=s.nextInt();
		int a=n;

		while(n!=0){
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		System.out.println(rev);
		if(rev==a){
		System.out.println(a+" is palindrome number");
		}
		else{
			System.out.println(a+" is not palindrome number");
		}
	}
}