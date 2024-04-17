 package inheritance_examples;

public class AreaCalculate implements Area
{
	@Override
	 public void square()
	 {
		int area,side=3;
		area=side*side;
		System.out.println("The Area Of Square is: "+area);
	 }
	@Override
	 public void rectangle()
	 {
		int area,l=3,b=4;
		area=l*b;
		System.out.println("The Area Of Rectangle is: "+area);
	 }
	@Override
	 public void triangle()
	 {
		int h=3,b=5;
		double area;
		area=(0.5)*h*b;
		System.out.println("The Area Of Triangle is: "+area);
	 }
	@Override
	 public void circle()
	 {
		int r = 5;
		double area;
		area=(3.14)*r*r;
		System.out.println("The Area Of Circle is: "+area);
	 }
	
}


