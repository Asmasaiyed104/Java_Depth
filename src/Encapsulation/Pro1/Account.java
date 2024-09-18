package Encapsulation.Pro1;

public class Account {

    String name ;
    private int amount;
    private String account_no;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getAccount_no() {
        return account_no;
    }

    public void setAccount_no(String account_no) {
        this.account_no = account_no;
    }
    // method

    public void deposit(int amount ,int amountDpt){
        int total = amount + amountDpt;
        setAmount(total);


    }
    public void withdraw(int amount, int amountWithdraw){
        int total = amount-amountWithdraw;
        setAmount(total);

    }

}
