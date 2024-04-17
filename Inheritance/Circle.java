/**
 * Write a Java program to create a class called
 * Shape with methods called getPerimeter() and
 * getArea(). Create a subclass called Circle that
 * overrides the getPerimeter() and getArea()
 * methods to calculate the area and perimeter
 * of a circle.*
 * 
 * 
 */

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public double getArea() {
        return (3.14 * this.radius * this.radius);
    }

    public double getPerimeter() {
        return (2 * 3.14 * this.radius);
    }

    public static void main(String[] args) {
        Circle c = new Circle(4.5);
        System.out.println("Circle Perimeter: " + c.getPerimeter());
        System.out.println("Circle Area: " + c.getArea());
    }

}
