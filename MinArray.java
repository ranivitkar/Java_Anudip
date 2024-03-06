import java.util.*;

class MinArray
{
	public static void main(String[] args) {
		int a[]=new int[5];
		

		Scanner sc=new Scanner(System.in);

		System.out.println("Enter Five Numbers");

		for(int i=0;i<5;i++){
			a[i]=sc.nextInt();
		}

		int min=a[0];
		for(int i=1;i<5;i++){
			if(min>a[i]){
				min=a[i];
			}
		}

		System.out.println("Minimum Value: "+min);

	}
}