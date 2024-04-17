package ThreadExamples;
class Account extends Thread {

    static int balance = 1000;

    public void run() {
        synchronized (Account.class) {
            if (balance >= 800) {
                System.out.println(Thread.currentThread().getName() + "Your balance is " + balance
                        + " so you can withdraw the amount");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                balance = 200;
                System.out.println(Thread.currentThread().getName() + " After withdraw your balance is " + balance);

            } else {
                System.out.println(Thread.currentThread().getName() + " Your balance is " + balance);
            }
        }
    }
}

public class AccountThread {
    public static void main(String[] args) {
        Account ac1 = new Account();
        ac1.setName("Rani");
        Account ac2 = new Account();
        ac2.setName("Ushashri");

        ac1.start();
        ac2.start();
    }
}
