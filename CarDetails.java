import java.util.*;

class GetDetails
{
	String carname,carcol;
	int carnum;
	double carprice;
	Scanner s=new Scanner(System.in);

	void getInfo(){

		System.out.println("Enter car company name");
		carname=s.nextLine();

		System.out.println("Enter car colour");
		carcol=s.nextLine();

		System.out.println("Enter car number");
		carnum=s.nextInt();

		System.out.println("Enter car price");
		carprice=s.nextInt();



	}


}


class DisplayDetials extends GetDetails
{
	void displayInfo(){

		System.out.println("car name: "+carname);

		System.out.println("car colour: "+carcol);

		System.out.println("car No: "+carnum);

		System.out.println("car price: "+carprice);
	}
}

class CarDetails
{
	public static void main(String[] args) {

		DisplayDetials d=new DisplayDetials();

		d.getInfo();
		d.displayInfo();
		
	}
}