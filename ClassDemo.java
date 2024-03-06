import java.util.*;

class Employee
{
	int empId;
	String empName;
	double empSal;
	Scanner sc=new Scanner(System.in);

	void getInfo(){
		System.out.println("Enter empId and Name");
		empId=sc.nextInt();
		sc.nextLine();
		empName=sc.nextLine();
		System.out.println("Enter your Salary");
		empSal=sc.nextInt();

	}
	void showInfo(){
		System.out.println("Verify your information");
		System.out.println("Your empId: "+empId);
		System.out.println("Your name: "+empName);
		System.out.println("Your salary: "+empSal);
	}
}

class ClassDemo
{
	public static void main(String[] args) {
		Employee e=new Employee();

		e.getInfo();
		e.showInfo();
		
	}
}