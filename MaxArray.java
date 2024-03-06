import java.util.*;

class MaxArray
{
	public static void main(String[] args) {
		int a[]=new int[5];
		

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Five Numbers");

		for(int i=0;i<5;i++){
			a[i]=sc.nextInt();
		}

		int mx=a[0];
		for(int i=1;i<5;i++){
			if(mx<a[i]){
				mx=a[i];
			}
		}

		System.out.println("Maximum Value: "+mx);

	}
}