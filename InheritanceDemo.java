import java.util.*;

class AddDemo1
{
	int a,b,s;
	Scanner c=new Scanner(System.in);

	void getInput(){

		System.out.println("Enter two numbers");
		a=c.nextInt();
		b=c.nextInt();
	}

}

class Result extends AddDemo1
{
	void display(){
		s=a+b;
		System.out.println("The sum is: "+s);
	}
}

class InheritanceDemo{
	public static void main(String[] args) {

		Result r=new Result();
		r.getInput();
		r.display();
		
	}
	
}