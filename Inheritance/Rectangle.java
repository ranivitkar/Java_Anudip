class Shape {
    double getArea() {

        return 0.0;
    }
}

public class Rectangle extends Shape {
    private double l, b; // instance variable

    public Rectangle(double l, double b) {
        super();
        this.l = l;
        this.b = b;
    }

    @Override
    public double getArea() {
        return this.l * this.b;
    }

    public static void main(String[] args) {
        // constructor gets called automatically when objrct is created.
        Rectangle r = new Rectangle(5.4, 3.5);
        System.out.println("This area is: " + r.getArea());
        double area = r.getArea();
        System.out.println("the area of rectanle: " + area);
    }
}
