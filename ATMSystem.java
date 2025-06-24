 import java.util.*;

public class ATMSystem {
    static Scanner sc = new Scanner(System.in);12
    static double balance = 1000.0; // Starting balance
    static List<String> transactionHistory = new ArrayList<>();
    static int userPIN = 1234;

    public static void main(String[] args) {
        System.out.println("Welcome to the ATM Management System");

        if (authenticateUser()) {
            int option;
            do {
                System.out.println("\nATM Menu:");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Transaction History");
                System.out.println("5. Exit");
                System.out.print("Choose an option: ");
                option = sc.nextInt();

                switch (option) {
                    case 1:
                        checkBalance();
                        break;
                    case 2:
                        deposit();
                        break;
                    case 3:
                        withdraw();
                        break;
                    case 4:
                        showTransactionHistory();
                        break;
                    case 5:
                        System.out.println("Thank you for using our ATM. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid option. Try again.");
                }
            } while (option != 5);
        }
    }

    static boolean authenticateUser() {
        System.out.print("Enter your 4-digit PIN: ");
        int inputPIN = sc.nextInt();

        if (inputPIN == userPIN) {
            System.out.println("Login successful.");
            return true;
        } else {
            System.out.println("Incorrect PIN. Access denied.");
            return false;
        }
    }

    static void checkBalance() {
        System.out.println("Your current balance is: ₹" + balance);
    }

    static void deposit() {
        System.out.print("Enter amount to deposit: ₹");
        double amount = sc.nextDouble();
        if (amount > 0) {
            balance += amount;
            transactionHistory.add("Deposited: ₹" + amount);
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    static void withdraw() {
        System.out.print("Enter amount to withdraw: ₹");
        double amount = sc.nextDouble();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            transactionHistory.add("Withdrawn: ₹" + amount);
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    static void showTransactionHistory() {
        System.out.println("\nTransaction History:");
        if (transactionHistory.isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (String transaction : transactionHistory) {
                System.out.println(transaction);
            }
        }
    }
}
    

