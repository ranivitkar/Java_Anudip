import java.util.*;

class Fibonacci
{
	public static void main(String args[]){

		Scanner s=new Scanner(System.in);
		int n,a=0,b=1,t;

		System.out.println("Enter a number");
		n=s.nextInt();
        if(n==0){
        	System.out.print(a);
        }
        else if(n==1){
        	System.out.print(a+" "+b);
        }
        else{

		System.out.print("0 1 ");
		
		for(int i=2;i<=n;i++){
			t=a+b;
			System.out.print(t+" ");
			a=b;
			b=t;
		}

		}
	}
}