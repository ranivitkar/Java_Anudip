import java.util.*;

class Num3
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int a,b,c;

		System.out.println("Enter three numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();

		if(a>b && a>c){
			System.out.println(a+" is greater");
		}
		else if(b>a && b>c){
			System.out.println(b+" is greater");
		}
		else{
			System.out.println(c+" is greater");
		}
	}
}