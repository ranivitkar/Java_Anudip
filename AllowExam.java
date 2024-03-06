import java.util.*;

class AllowExam
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int cl,att;
		double p;

		System.out.println("Enter number of classes held");
		cl=sc.nextInt();

		System.out.println("Enter number of classes attended");
		att=sc.nextInt();
        
        
		p=(att*100)/cl;

		if(p>=75){
			System.out.println("You are eligible for exam as your attendance is "+p+" %");

		}
		else{
			System.out.println("You are not eligible for exam as your attendance is "+p+" %");
		}


	}
}