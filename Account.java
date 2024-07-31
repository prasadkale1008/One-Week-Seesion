
public class Account {
    private String accountNumber;
    private double balance;
    private Customer customer;

    
    public Account(String accountNumber, Customer customer) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = 0.0;
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount");
        }
    }

  
    public double getBalance() {
        return balance;
    }

    
    public Customer getCustomer() {
        return customer;
    }

    
    public String getAccountNumber() {
        return accountNumber;
    }
}
