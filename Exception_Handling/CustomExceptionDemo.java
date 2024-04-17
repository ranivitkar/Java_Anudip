package Exception_Handling;

public class CustomExceptionDemo {
    public static void main(String[] args) throws AgeLessThanZeroException {

        check(-2);
    }

    public static void check(int age) throws AgeLessThanZeroException {
        if (age < 0) {
            throw new AgeLessThanZeroException("There is wrong input");
        }
    }
}
