package Lab;

class Bank {
    private double amount;

    public Bank(double d) {
        this.amount = d;
    }

    public void withdraw(double withdrawAmount) {

        System.out.println("***** Withdraw *****");
        if (withdrawAmount <= this.amount) {

            this.amount -= withdrawAmount;
            System.out.println("Withdraw Successful");

        } else {
            System.out.println("Insufficient balance");
        }
        System.out.println("current balance: " + this.amount);

    }

    public void deposit(double depositAmount) {
        System.out.println("***** Deposit *****");
        this.amount += depositAmount;
        System.out.println("Total Balance: " + this.amount);
    }
}

public class BankBalance {

    public static void main(String[] args) {

        Bank b = new Bank(10000.0);
        b.withdraw(20000.0);
        b.deposit(10000.0);
    }

}
