package Encapsulation.Pro2;

public class BankAccount {

    // Private attributes
    private String accountNumber;
    private double balance;
    private int pin;

    // Constructor to initialize the account with account number, balance, and pin
    public BankAccount(String accountNumber, double initialBalance, int pin) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.pin = pin;
    }

    // Getter for account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. Current balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be greater than 0.");
        }
    }

    // Method to withdraw money
    public void withdraw(double amount, int enteredPin) {
        if (enteredPin == pin) {
            if (amount > 0 && amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawal successful. Current balance: $" + balance);
            } else if (amount > balance) {
                System.out.println("Insufficient funds. Current balance: $" + balance);
            } else {
                System.out.println("Withdrawal amount must be greater than 0.");
            }
        } else {
            System.out.println("Incorrect PIN.");
        }
    }

    // Method to change PIN
    public void changePIN(int oldPIN, int newPIN) {
        if (oldPIN == pin) {
            pin = newPIN;
            System.out.println("PIN changed successfully.");
        } else {
            System.out.println("Incorrect old PIN.");
        }
    }
}