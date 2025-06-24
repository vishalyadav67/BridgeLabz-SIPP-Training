class BankAccount {
    
    String accountHolder;
    String accountNumber;
    double balance;

    
    BankAccount(String accountHolder, String accountNumber, double initialBalance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited ₹" + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    
    void displayBalance() {
        System.out.println("Account Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
    }
}

public class SimulateBankAccount {
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount("aditya", "SB123456789", 5000.0);

        
        account.displayBalance();

        
        System.out.println("\n-- Performing Transactions --");
        account.deposit(1500.0);
        account.withdraw(2000.0);
        account.withdraw(6000.0); 

        
        System.out.println("\n-- Final Account Status --");
        account.displayBalance();
    }
}
