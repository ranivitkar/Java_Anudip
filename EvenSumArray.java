import java.util.*;

class EvenSumArray
{
	public static void main(String[] args) {
		int a[]=new int[5];
		int es=0;
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Five Numbers");

		for(int i=0;i<5;i++){
			a[i]=sc.nextInt();
		}

		
		for(int i=0;i<5;i++){
			if(a[i]%2==0){
			es=es+a[i];
		}
			
		}
		
		System.out.println("sum of Even numbers : " +es);
		

	}
}