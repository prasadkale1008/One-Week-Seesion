public class Customer {
    private String name;
    private String accountNumber;
    private String number;

   
    public Customer(String name, String accountNumber, String number) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.number = number;
    }

    
    public String getAccountNumber() {
        return accountNumber;
    }

    
    public String getName() {
        return name;
    }

   
    public String getNumber() {
        return number;
    }

    
    public void setNumber(String number) {
        this.number = number;
    }
}


