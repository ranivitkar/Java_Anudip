package Exception_Handling;

public class Withdraw_Amt {

    double cur_bal = 10000;

    public void withdraw(double amt) {
        if (amt > cur_bal) {
            try {
                throw new Exception();
            } catch (Exception e) {
                System.out.println("Insufficient Balance");
            } finally {
                System.out.println("Your Balance: " + cur_bal);
            }
        } else {
            cur_bal = cur_bal - amt;
            System.out.println("After withdraw your amount: " + cur_bal);
        }
    }

    public static void main(String[] args) {
        Withdraw_Amt w = new Withdraw_Amt();
        w.withdraw(20000);
    }

}
