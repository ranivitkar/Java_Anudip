import java.util.*;

class SumArray
{
	public static void main(String[] args) {
		int a[]=new int[5];
		int s=0;
		float avg;

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Five Numbers");

		for(int i=0;i<5;i++){
			a[i]=sc.nextInt();
		}

		
		for(int i=0;i<5;i++){
			s=s+a[i];
			
		}
		avg=s/5;
		System.out.println("Adition of array element"+s);
		System.out.println("Average of Array elements:" +avg);

	}
}