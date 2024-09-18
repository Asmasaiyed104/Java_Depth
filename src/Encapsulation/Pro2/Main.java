package Encapsulation.Pro2;
import java.util.Scanner;





public class Main {
    public static void main(String[] args) {
        // Create a new bank account
        BankAccount account = new BankAccount("123456789", 1000.0, 1234);

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Change PIN");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Check balance
                    System.out.println("Your current balance is: $" + account.getBalance());
                    break;

                case 2:
                    // Deposit money
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    // Withdraw money
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    System.out.print("Enter your PIN: ");
                    int pinForWithdrawal = scanner.nextInt();
                    account.withdraw(withdrawAmount, pinForWithdrawal);
                    break;

                case 4:
                    // Change PIN
                    System.out.print("Enter your current PIN: ");
                    int oldPIN = scanner.nextInt();
                    System.out.print("Enter your new PIN: ");
                    int newPIN = scanner.nextInt();
                    account.changePIN(oldPIN, newPIN);
                    break;

                case 5:
                    // Exit
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}