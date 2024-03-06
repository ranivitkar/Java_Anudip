import java.util.*;

class ShapeArea
{
	int area(int s){
	 	return (s*s);
	}

	int area(int l,int b){
		return (l*b);
	}

	double area(double r){
		return (3.14*r*r);
	}

	public static void main(String[] args) {
		ShapeArea o=new ShapeArea();

		System.out.println("Area of Square: "+o.area(5));

		System.out.println("Area of Rectangle: "+o.area(5,6));

		System.out.println("Area of Circle: "+o.area(5.5));



	}

}