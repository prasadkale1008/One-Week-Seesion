import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();

        System.out.print("Enter phone number: ");
        String phoneNumber = scanner.nextLine();

       
        Customer customer = new Customer(name, accountNumber, phoneNumber);
        Account account = new Account(accountNumber, customer);

        
        System.out.print("Enter amount to deposit: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        
        System.out.print("Enter amount to withdraw: ");
        double withdrawAmount = scanner.nextDouble();
        account.withdraw(withdrawAmount);

       
        
        
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Customer Name: " + account.getCustomer().getName());
        System.out.println("Customer Account Number: " + account.getCustomer().getAccountNumber());
        System.out.println("Customer Phone Number: " + account.getCustomer().getNumber());

        
        scanner.close();
    }
}

