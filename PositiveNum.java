import java.util.*;

class PositiveNum
{
	public static void main(String[] args) {
		int a[]=new int[5];
		int es=0;
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Five Numbers");

		for(int i=0;i<5;i++){
			a[i]=sc.nextInt();
		}

		System.out.println("Positive numbers: ");
		
		for(int i=0;i<5;i++){
			if(a[i]>0){
				System.out.print(a[i]+" ");
			
		}
			
		}
		
		
		

	}
}