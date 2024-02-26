import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch;
        double balance = 10000;

        while (true) { 
            System.out.println("\nWelcome to the ATM interface.");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Cash");
            System.out.println("3. Deposit Cash");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.next();

            switch (ch) {
                case "1":
                    System.out.println("Your current balance is: " + balance);
                    break;
                case "2":
                    System.out.print("Enter the amount you want to withdraw: ");
                    double withdrawalAmount = sc.nextDouble();
                    if (withdrawalAmount <= balance) {
                        balance -= withdrawalAmount;
                        System.out.println("Transaction successful. Your new balance is: " + balance);
                    } else {
                        System.out.println("Transaction failed. Insufficient balance.");
                    }
                    break;
                case "3":
                    System.out.print("Enter the amount you want to deposit: ");
                    double depositAmount = sc.nextDouble();
                    balance += depositAmount;
                    System.out.println("Transaction successful. Your new balance is: " + balance);
                    break;
                case "4":
                    System.out.println("Exiting the ATM interface.");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
