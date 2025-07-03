interface Loanable {
    void applyForLoan(double amount);
    boolean calculateLoanEligibility();
}
abstract class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public String getHolderName() {
        return holderName;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance)
            balance -= amount;
    }
    public abstract double calculateInterest();

    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: ₹" + balance);
    }
    protected void updateBalance(double newBalance) {
        this.balance = newBalance;
    }
}
class SavingsAccount extends BankAccount implements Loanable {
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }
    public double calculateInterest() {
        double interest = getBalance() * 0.04; // 4% annual
        updateBalance(getBalance() + interest);
        return interest;
    }
    public void applyForLoan(double amount) {
        System.out.println("Loan of ₹" + amount + " applied for Savings Account.");
    }
    public boolean calculateLoanEligibility() {
        return getBalance() >= 10000;
    }
}

class CurrentAccount extends BankAccount implements Loanable {
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public double calculateInterest() {
        return 0.0; 
    }
    public void applyForLoan(double amount) {
        System.out.println("Loan of ₹" + amount + " applied for Current Account.");
    }
    public boolean calculateLoanEligibility() {
        return getBalance() >= 25000;
    }
}
public class BankingSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("SB1001", "Ananya Sharma", 12000);
        BankAccount acc2 = new CurrentAccount("CA2001", "Ravi Kumar", 30000);

        BankAccount[] accounts = {acc1, acc2};

        for (BankAccount acc : accounts) {
            System.out.println("\n--- Account Details ---");
            acc.displayDetails();

            double interest = acc.calculateInterest();
            System.out.println("Interest Added: ₹" + interest);
            System.out.println("New Balance: ₹" + acc.getBalance());

            if (acc instanceof Loanable) {
                Loanable loanAcc = (Loanable) acc;
                loanAcc.applyForLoan(50000);
                if (loanAcc.calculateLoanEligibility()) {
                    System.out.println("Loan Eligibility: Eligible");
                } else {
                    System.out.println("Loan Eligibility:  Not Eligible");
                }
            }
        }
    }
}
