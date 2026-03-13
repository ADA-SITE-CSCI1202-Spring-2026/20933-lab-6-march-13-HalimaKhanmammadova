import java.util.Scanner;

public class MainAccount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter account holder name: ");
        String holderName = scanner.nextLine();

        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        Account acc = new Account(accountNumber, holderName, balance);
        System.out.println("Created: " + acc);

        System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        try {
            acc.deposit(depositAmount);
            System.out.println("After deposit: " + acc);
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.print("Enter withdrawal amount: ");
        double withdrawAmount = scanner.nextDouble();
        try {
            acc.withdraw(withdrawAmount);
            System.out.println("After withdrawal: " + acc);
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Final: " + acc);
        scanner.close();
    }
}