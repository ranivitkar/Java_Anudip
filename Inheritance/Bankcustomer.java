import java.util.*;

class Bank {
    private int acno;
    private String acctype;
    private double amt;

    public Bank() {
        acno = 0;
        acctype = "";
        amt = 0.00;

    }

    public Bank(int acno) {
        this.acno = acno;

    }

    public Bank(int acno, String actype) {
        this.acctype = actype;
        this.acno = acno;
    }

    public Bank(int acno, String actype, Double amt) {
        this.acctype = actype;
        this.acno = acno;
        this.amt = amt;
    }

    public String toString() {
        return acno + " " + acctype + " " + amt;
    }

}

public class Bankcustomer {

    public static void main(String[] args) {
        Bank b1 = new Bank();
        Bank b2 = new Bank(111);
        Bank b3 = new Bank(111, "Saving");
        Bank b4 = new Bank(111, "Saving", 20000.0);

        System.out.println(b2.toString());
        System.out.println(b3.toString());
        System.out.println(b41.toString());
    }
}
