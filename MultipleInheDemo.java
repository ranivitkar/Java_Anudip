import java.util.*;

class One
{
	int a,b,c;
	Scanner sc=new Scanner(System.in);

	void getValue(){
		System.out.println("Enter three numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
	}
}

class Second extends One
{
	double avg;
	void calAvg(){
	avg=(a+b+c)/3;
	}
}
class Third extends Second
{
	void disAvg(){
	System.out.println("The Avareage is: "+avg);
	}
}

class MultipleInheDemo
{
	public static void main(String[] args) {
		Third t=new Third();

		t.getValue();
		t.calAvg();
		t.disAvg();
	}
	
}