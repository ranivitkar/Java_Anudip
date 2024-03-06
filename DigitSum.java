import java.util.*;

class SumDigit
{
	int n,s;
	Scanner sc=new Scanner(System.in);

	void getNum(){
		System.out.println("Enter a number");
		n=sc.nextInt();


	}
	void calDigitSum(){
		int t;
		while(n!=0){
			t=n%10;
			s=s+t;
			n=n/10;

		}
		System.out.println("The sum of Digit is "+s);
	}
}
class DigitSum
{
	public static void main(String[] args) {

		SumDigit d=new SumDigit();

		d.getNum();
		d.calDigitSum();
		
	}
}