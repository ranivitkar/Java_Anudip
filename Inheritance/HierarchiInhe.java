class Baseclass {
    int num1 = 10;
}

class Subclass1 extends Baseclass {
    int num2 = 2;
}

class Subclass2 extends Baseclass {
    int num3 = 6;
}

class Subclass3 extends Baseclass {
    int num4 = 8;
}

public class HierarchiInhe {
    public static void main(String[] args) {
        Subclass1 c1 = new Subclass1();
        Subclass2 c2 = new Subclass2();
        Subclass3 c3 = new Subclass3();

        System.out.println("fisrtNum * secondNum = " + c1.num1 * c1.num2);
        System.out.println("fisrtNum * thirdNum = " + c1.num1 * c2.num3);
        System.out.println("fisrtNum * fourthNum = " + c1.num1 * c3.num4);
    }
}
