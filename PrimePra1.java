import java.util.Scanner;

class PrimePra1
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int f=0;

		if(n==2){
			System.out.println(n+" is a prime number");
		}
		else{
			for(int i=2;i<n;i++){
				if(n%i==0){
					f=1;
					break;
				}
				else{
					f=0;
				}
			}

			if(f==0){
				System.out.println(n+" is a prime number");
			}
			else{
				System.out.println(n+" is not a prime number");
			}

			
		}
	}
}

