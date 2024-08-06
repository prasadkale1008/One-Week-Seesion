 class NegativeDepositException extends Exception {
    public NegativeDepositException(String message) {
        super(message);
    }
}

 class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}
 class InvalidAccountException extends Exception {
    public InvalidAccountException(String message) {
        super(message);
    }
}

public class Bankingapp {
    private String accountNumber;
    private double balance;

    public Bankingapp(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) throws NegativeDepositException {
        if (amount <= 0) {
            throw new NegativeDepositException("Deposit amount must be positive.");
        }
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient funds.");
        }
        balance -= amount;
    }
}

 class Bank {
    private Bankingapp[] accounts;
    private int accountCount;

    public Bank(int capacity) {
        accounts = new Bankingapp[capacity];
        accountCount = 0;
    }

    public void addAccount(Bankingapp account) {
        if (accountCount < accounts.length) {
            accounts[accountCount] = account;
            accountCount++;
        } else {
            System.out.println("Bank capacity full. Cannot add more accounts.");
        }
    }

    public Bankingapp getAccount(String accountNumber) throws InvalidAccountException {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber().equals(accountNumber)) {
                return accounts[i];
            }
        }
        throw new InvalidAccountException("Account does not exist.");
    }
}
