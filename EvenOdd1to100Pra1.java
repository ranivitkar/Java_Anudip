import java.util.Scanner;

class EvenOdd1to100Pra1
{
	public static void main(String[] args) {

		for(int i=1;i<=100;i++)
		{
			if(i%2==0){
				System.out.println("Even: "+i);

			}
			else{
				System.out.println("Odd: "+i);
			}
		}
	}
}