
class Mathoperation {
    public int add(int a, int b) {
        return a + b;
    }
}

class AdvancedOpera extends Mathoperation {
    public int multiply(int a, int b) {
        return a * b;
    }
}

class ScientificCal extends AdvancedOpera {
    public double squareRoot(double n) {
        return Math.sqrt(n);
    }
}

public class MultilevelInhe {
    public static void main(String[] args) {
        ScientificCal s = new ScientificCal();
        int sum = s.add(10, 20);

        int product = s.multiply(4, 5);

        double sqr = s.squareRoot(6);

        System.out.println("sum: " + sum);
        System.out.println("Product: " + product);
        System.out.println("Square Root: " + sqr);
    }
}
