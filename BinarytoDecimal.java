import java.util.*;
import java.util.Scanner;

class BinarytoDecimal
{
	public static void main(String args[])
		{

       Scanner sc=new Scanner(System.in);
		int t=0,i=1,dec=0;
		System.out.println("Enter Binary Number: ");
		int b=sc.nextInt();
		while(b!=0)
		{
				t=b%10;

				if(t==1){
					
					dec+=i;
				}

				i=i*2;
				b=b/10;
		}
		System.out.println(dec);
		
	}
}