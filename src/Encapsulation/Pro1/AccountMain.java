package Encapsulation.Pro1;

public class AccountMain {
    public static void main(String[] args) {

        Account ac = new Account();
        ac.setAccount_no("11111");
        ac.setAmount(10000);
        ac.getAmount();
        ac.getAccount_no();

        System.out.println("Full description of Amount " + ac.getAccount_no()+ " "+ ac.getAmount()) ;;
        System.out.println("Initial Amount : " + ac.getAmount());

        // deposit
        ac.deposit(ac.getAmount(), 40000);
        System.out.println("After deposit : " + ac.getAmount());
        // withrawal
        ac.withdraw(ac.getAmount(), 5000);
        System.out.println("After withdraw : " + ac.getAmount());
    }
}
