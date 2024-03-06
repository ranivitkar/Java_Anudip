import java.util.*;

class Swapwithout3num
{
	public static void main(String args[])
	{
    Scanner c=new Scanner(System.in);
    int a,b;

    System.out.println("enter two numbers");
    a=c.nextInt();
    b=c.nextInt();

    System.out.println("The numbers before swapping \n a="+a+" b="+b);

    a=a+b;  //a=a*b
    b=a-b;  //b=a/b
    a=a-b;  //a=a/b

    System.out.println("The numbers before swapping \n a="+a+" b="+b);

   }

  }

