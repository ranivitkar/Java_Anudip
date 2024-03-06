import java.util.*;

class VolumeCyl1
{
	int r,h;
	Scanner sc=new Scanner(System.out);

	void getValue()
	{
		System.out.println("Enter Cylinder Height");
		h=sc.nextInt();

		System.out.println("Enter cylinder Radius");
		r=sc.nextInt();
	}
}

class VolumeCyl2 extends VolumeCyl1
{
	double v;
	void calVolume()
	{
		v=3.14*r*2*h;
	}
}

class VolumeCyl3 extends VolumeCyl2
{
	void disVolume(){
		System.out.println("Volume of Cylinder: "+v);
	}
}

class MainCylVolume
{
	public static void main(String[] args) {
		VolumeCyl3 v=new VolumeCyl3();

		v.getValue();
		v.calVolume();
		v.disVolume();
	}
}