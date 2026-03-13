public class Account {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public Account(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public int getAccountNumber() { return accountNumber; }
    public String getAccountHolderName() { return accountHolderName; }
    public double getBalance() { return balance; }

    public void setAccountNumber(int accountNumber) { this.accountNumber = accountNumber; }
    public void setAccountHolderName(String name) { this.accountHolderName = name; }
    public void setBalance(double balance) { this.balance = balance; }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new InvalidAmountException("Deposit amount cannot be negative. Provided: " + amount);
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount < 0) {
            throw new InvalidAmountException("Withdrawal amount cannot be negative. Provided: " + amount);
        }
        if (amount > balance) {
            throw new InvalidAmountException(
                "Insufficient funds. Balance: " + balance + ", Requested: " + amount);
        }
        balance -= amount;
    }

    @Override
    public String toString() {
        return "Account{#" + accountNumber + ", holder='" + accountHolderName
             + "', balance=" + String.format("%.2f", balance) + "}";
    }
}