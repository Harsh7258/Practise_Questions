// Bank Account class with encapsulated fields and constructors

public class QuesA {
    // Encapsulated data
    private int accountNumber; // field 1
    private int balance; // field 2
    private String holderName; // field 3

    // no parameter constructor
    public QuesA() {
    }

    // parametrized constructor
    public QuesA(int accountNumber, int balance, String holderName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.holderName = holderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }
}
