import java.util.*;

class Verification
{
	int phy,bio,math;
	Scanner s=new Scanner(System.in);

	void getMarks(){

		System.out.println("Enter Physics marks: ");
		phy=s.nextInt();

		System.out.println("Enter Bio marks: ");
		bio=s.nextInt();

		System.out.println("Enter Maths marks: ");
		math=s.nextInt();

	}
	void verifyStud(){
		if(bio>85 && math>85){
			System.out.println("He/she has own choice");
		}
	
		else if(bio>85){
			System.out.println("Medical Student");
		}
		else if(math>85){
			System.out.println("Engineering Student");
		}
		
}

class VerifyField
{
	public static void main(String[] args) {

		Verification v=new Verification();

		v.getMarks();

		v.verifyStud();
	}
}