import java.util.ArrayList;
import java.util.List;

class Bank {
    String bankName;

     Bank(String bankName) {
        this.bankName = bankName;
    }

    String getBankName() {
        return bankName;
    }


    void openAccount(Customer customer, double balance) {
        customer.addAccount(this, balance);
        System.out.println("Account opened in " + bankName + " for " + customer.getName());
    }
}

class Customer {
     String name;
    
    
    private List<Account> accounts = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Inner class to represent an account for this customer
    private class Account {
        Bank bank;
        double balance;

        Account(Bank bank, double balance) {
            this.bank = bank;
            this.balance = balance;
        }
    }

    public void addAccount(Bank bank, double balance) {
        accounts.add(new Account(bank, balance));
    }

    public void viewBalance() {
        System.out.println("Account balances for " + name + ":");
        for (Account acc : accounts) {
            System.out.println("- Bank: " + acc.bank.getBankName() + ", Balance: ₹" + acc.balance);
        }
    }
}

public class BankCustomer {
    public static void main(String[] args) {
        Bank sbi = new Bank("SBI");
        Bank hdfc = new Bank("HDFC");

        Customer anshu = new Customer("Anshu");
        Customer ravi = new Customer("Ravi");

        sbi.openAccount(anshu, 10000);
        hdfc.openAccount(anshu, 5000);
        sbi.openAccount(ravi, 7000);

        anshu.viewBalance();
        ravi.viewBalance();
    }
}
