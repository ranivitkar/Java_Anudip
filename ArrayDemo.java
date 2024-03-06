import java.util.*;

class ArrayDemo
{
	public static void main(String[] args) {
		int a[]=new int[5];
		Scanner c=new Scanner(System.in);

		System.out.println("Enter Five Numbers");

		for(int i=0;i<5;i++){
			a[i]=c.nextInt();
		}

		System.out.println("You have entered: ");

		for(int i=0;i<5;i++){
			System.out.println(a[i]);
		}
	}
}