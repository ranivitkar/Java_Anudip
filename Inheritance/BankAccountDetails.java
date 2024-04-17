package inheritance_examples;
//Define the BankAccount interface
interface BankAccount {
 void deposit(double amount);
 void withdraw(double amount);
}

//Implement the CheckingAccount class which implements the BankAccount interface
class CheckingAccount implements BankAccount {
 private double balance;

 public CheckingAccount(double initialBalance) {
     this.balance = initialBalance;
 }

 @Override
 public void deposit(double amount) {
     if (amount > 0) {
         balance += amount;
         System.out.println("Deposited $" + amount + ". Current balance: $" + balance);
     } else {
         System.out.println("Invalid deposit amount.");
     }
 }

 @Override
 public void withdraw(double amount) {
     if (amount > 0 && amount <= balance) {
         balance -= amount;
         System.out.println("Withdrew $" + amount + ". Current balance: $" + balance);
     } else {
         System.out.println("Insufficient funds or invalid withdrawal amount.");
     }
 }
}

public class BankAccountDetails {
 public static void main(String[] args) {
     // Create an object of the CheckingAccount class
     CheckingAccount account = new CheckingAccount(100);

     // Deposit and withdraw money
     account.deposit(50);
     account.withdraw(30);
     account.withdraw(200); // This should print "Insufficient funds or invalid withdrawal amount."
 }
}
