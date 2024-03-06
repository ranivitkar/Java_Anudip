import java.util.*;

class SearchNum
{
	public static void main(String[] args) {
		int a[]=new int[5];
		int s;
		
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Five Numbers");

		for(int i=0;i<5;i++){
			a[i]=sc.nextInt();
		}

		System.out.println("Enter number to be search");
		s=sc.nextInt();
		
		for(int i=0;i<5;i++){
			if(a[i]==s){
				System.out.print(a[i]+" is found at position "+i);
			
		}
			
		}
		
		
		

	}
}