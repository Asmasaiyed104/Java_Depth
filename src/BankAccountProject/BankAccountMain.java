package BankAccountProject;

public class BankAccountMain {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("Asma", 1000.00);
        System.out.println ("Account Holder : " + account.getAccHold_name());

        System.out.println ("Current Balance : " + account.getBalance());

        account.deposit(500);
        System.out.println ("Updated Balance : " + account.getBalance());

        account.withdraw(0);
        System.out.println ("Updated Balance : " + account.getBalance());
    }

}

