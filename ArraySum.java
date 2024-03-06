import java.util.*;

class ArraySum
{
	public static void main(String[] args) {
		int a[]=new int[5];
		int b[]=new int[5];
		int c[]=new int[5];

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Five Numbers for 1st Array");

		for(int i=0;i<5;i++){
			a[i]=sc.nextInt();
		}

		System.out.println("Enter Five Numbers for 2nd Array");

		for(int i=0;i<5;i++){
			b[i]=sc.nextInt();
		}

		
		System.out.println("sum of array");
		for(int i=0;i<5;i++){
			c[i]=a[i]+b[i];
			System.out.println(c[i]);
		}
	}
}