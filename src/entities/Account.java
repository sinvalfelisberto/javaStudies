package entities;

public class Account {
    private String name;
    private String accountNumber;
    private double balance;

    public Account(String name, String accountNumber) {
        setName(name);
        this.accountNumber = accountNumber;
    }

    public Account(String name, String accountNumber, Double deposit) {
        setName(name);
        this.accountNumber = accountNumber;
        depositAccount(deposit);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public Double getBalance() {
        return this.balance;
    }

    public void depositAccount(Double deposit) {
        this.balance += deposit;
    }

    public Boolean drawAccount(Double draw) {
        if (getBalance() < draw) {
            return false;
        }
        this.balance -= draw;
        return true;
    }

    public String toString() {
        return "Account "
                + getAccountNumber()
                + ", Holder: "
                + getName()
                + ", Balance: $ "
                + String.format("%.2f", getBalance());
    }
}
