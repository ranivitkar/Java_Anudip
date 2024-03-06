import java.util.*;

class Basesalary
{
	double sal,bon=0;
	Scanner s=new Scanner(System.in);

	void getSalary(){

		System.out.println("Enter your Salary: ");
		sal=s.nextInt();
	}
}

class Childsalary extends Basesalary
{
	void disBonus(){

		if(sal<50000){
				bon=sal+(0.1*sal);
				System.out.println("Your salary with bonus is: "+bon);
		}
		else{
			System.out.println("Your salary is greater than 50000 you can't get bonus");
		}
		
	}
}

class BonusSalary
{
	public static void main(String[] args) {
	 Childsalary c=new Childsalary();

	 c.getSalary();
	 c.disBonus();	
	}
}