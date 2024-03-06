import java.util.*;

class ArmNum
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n,rem=0,arm=0; 
		System.out.println("Enter anumber");
		n=s.nextInt();
		int a=n;

		while(n!=0){
			rem=n%10;
			arm=arm+(rem*rem*rem);
			n=n/10;
		}
		if(arm==a){
			System.out.println(a+" This is Armstrong Number");
		}
		else{
			System.out.println(a+" This is not Armstrong Number");
		}
	}
}