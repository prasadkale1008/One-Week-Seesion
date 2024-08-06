import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(10); 
        Scanner scanner = new Scanner(System.in);

       
        Bankingapp account = new Bankingapp("123456", 500);
        bank.addAccount(account);

        while (true) {
            System.out.println("\nBank Operations:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choose an operation: ");
            int choice = scanner.nextInt();

            if (choice == 4) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter account number: ");
            String accountNumber = scanner.next();

            try {
                Bankingapp userAccount = bank.getAccount(accountNumber);

                switch (choice) {
                    case 1: 
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = scanner.nextDouble();
                        userAccount.deposit(depositAmount);
                        System.out.println("Deposit successful. New Balance: " + userAccount.getBalance());
                        break;

                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = scanner.nextDouble();
                        userAccount.withdraw(withdrawAmount);
                        System.out.println("Withdrawal successful. New Balance: " + userAccount.getBalance());
                        break;

                    case 3:
                        System.out.println("Current Balance: " + userAccount.getBalance());
                        break;

                    default:
                        System.out.println("Invalid choice.");
                        break; 
                }

            } catch (NegativeDepositException | InsufficientFundsException | InvalidAccountException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}
