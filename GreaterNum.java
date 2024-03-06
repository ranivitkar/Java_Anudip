import java.util.*;

class GreaterNum
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int n1,n2;

	System.out.println("Enter first number: ");
	n1=sc.nextInt();

	System.out.println("Enter Second number: ");
	n2=sc.nextInt();

	if(n1>n2){
		System.out.println(n1+" is greater");
	}
	else{
		System.out.println(n2+" is greater");
	}



}
}