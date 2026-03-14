package ATMProject;

public class ATM {

    private double balance;
    private double depositAmount;
    private double withDrawAmount;

    public ATM() {
       balance = 10000;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDepositAmount() {
        return depositAmount;
    }

    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    public double getWithDrawAmount() {
        return withDrawAmount;
    }

    public void setWithDrawAmount(double withDrawAmount) {
        this.withDrawAmount = withDrawAmount;
    }
}
