import java.util.*;

class Swapnum
{
	public static void main(String args[])
	{
    Scanner c=new Scanner(System.in);
    int a,b,t;

    System.out.println("enter two numbers");
    a=c.nextInt();
    b=c.nextInt();

    System.out.println("The numbers before swapping \n a="+a+" b="+b);

    t=a;
    a=b;
    b=t;

    System.out.println("The numbers before swapping \n a="+a+" b="+b);

    

}
}