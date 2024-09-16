package BankAccountProject;

public class BankAccount {

    public BankAccount(String accHold_name, double balance) {
        this.accHold_name = accHold_name;
        this.balance = balance;
    }
    // constructor
    private String accHold_name;
    private double balance;

    // method to deposite money
    public void deposit(double amt){
        if(amt > 0){
            balance += amt;
            System.out.println("deposited amt" + amt);
        }else {
            System.out.println("deposted");
        }
    }

    public void withdraw(double amt){
        if(amt > 0 && amt <= balance){
            balance -=amt;
            System.out.println("withdraw " + amt);

        }else {
            System.out.println("invalid withdraw amt");
        }
    }
    public double getBalance() {
        return balance;
    }

    public String getAccHold_name() {
        return accHold_name;
    }
}