package oopChallenges;

public class BankAccount {
    private String email = "Boursorama";
    private String customerName = "Elodie";
    private int accountNumber = 1900;
    private int accountBalance = 1900;
    private String currency = "EUR";
    private String phoneNumber = "614 168 008";

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public int setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
        return accountBalance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void deposit(int amount) {
        if (amount > 0) {
            accountBalance += amount;
        } else {
            // Handle invalid deposit amount, e.g., throw an exception
            System.out.println("Deposit amount must be positive");
        }
    }

    public void withdraw(int amount) {
        if (amount > 0 && accountBalance >= amount) {
            accountBalance -= amount;
        } else {
            // Handle invalid withdrawal amount or insufficient funds
            System.out.println("Withdraw amount must be positive or enough found must be on account");
        }
    }
}
