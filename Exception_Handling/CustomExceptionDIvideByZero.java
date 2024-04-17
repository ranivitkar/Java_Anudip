package Exception_Handling;

public class CustomExceptionDIvideByZero {

    public static void main(String[] args) throws CustomException {

        try {
            int res = divide(10, 0);
            System.out.println("result: " + res);
        } catch (CustomException e) {
            System.out.println("Error: " + e.getmessage());
        }
    }

    public static void divide(int di, int dr) throws CustomException {
        if (dr == 0) {
            throw new CustomException("Divide by zero ");
        }
        return di / dr;
    }

}
