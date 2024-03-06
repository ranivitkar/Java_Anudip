import java.util.Scanner;

class Avg3num
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	double a,b,c;
	double avg;
  
	System.out.println("Enter Three Numbers: ");
    a=sc.nextInt();
	 b=sc.nextInt();
	 c=sc.nextInt();

 	avg=(a+b+c)/3;

	System.out.println("Average of Three Numbers: "+avg);

}
}