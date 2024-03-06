import java.util.*;

class Teacher
{
	int tid;
	String tname;
	double sal;
	Scanner s=new Scanner(System.in);

	void getTechDetails(){

		System.out.println("Enter Teacher ID");
		tid=s.nextInt();
		s.nextLine();

		System.out.println("Enter Teacher name");
		tname=s.nextLine();

		System.out.println("Enter Salary");
		sal=s.nextInt();



	}
}

class HRA extends Teacher
{
	double h;

	void calHRA(){
	h=0.12*sal;
	}
}

class ScienceTeacherSal extends HRA{
	double scisal;

	void sciSal(){
		scisal=sal+5000;
	}

	void totalSal()
	{
		System.out.println("Your totalk salary is "+(scisal+h));
	}
}

class Teacher_Salary_Multiple_Inhe{

	public static void main(String[] args) {
		
		ScienceTeacherSal t1=new ScienceTeacherSal();

		t1.getTechDetails();
		t1.calHRA();
		t1.sciSal();
		t1.totalSal();
	}
	
}