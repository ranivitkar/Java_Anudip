class Father
{
	void house(){
	System.out.println("Have own 2BHK House");
	}
}
class Son extends Father{
	void car(){
	System.out.println("Have own audi car");
	}
}

class SingleInherit
{
	public static void main(String[] args) {
		
		Son s=new Son();

		s.car();
		s.house();
	}
}