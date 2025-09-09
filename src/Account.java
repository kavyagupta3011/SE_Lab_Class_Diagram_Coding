import java.util.ArrayList;
import java.util.List;

public abstract class Account {
    private String number;
    private double balance;
    private List<Transaction> transactions;
    private Customer customer;
    
    public Account(String number, double initialBalance, Customer customer) {
        this.number = number;
        this.balance = initialBalance;
        this.transactions = new ArrayList<>();
        this.customer = customer;
        if (customer != null) {
            customer.addAccount(this);
        }
        System.out.println("[" + this.getClass().getSimpleName() + "] Created " + number + " with balance " + balance);
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void deposit(double amount) {
        if (amount <= 0) return;
        balance += amount;
        Transaction t = new Transaction(Transaction.generateId(), "DEPOSIT", java.time.LocalDate.now().toString(), amount);
        transactions.add(t);
        System.out.println("[Account:" + number + "] deposit " + amount + " New balance: " + balance);
        System.out.println("[Transaction] Created: ID=" + t.getTransaction_id() + ", Type=" + t.getType_of_transaction() + ", Amount=" + t.getAmount() + ", Date=" + t.getDate());

    }

    public void withdraw(double amount) {
        if (amount <= 0 || amount > balance) return;
        balance -= amount;
        Transaction t = new Transaction(Transaction.generateId(), "WITHDRAW", java.time.LocalDate.now().toString(), amount);
        transactions.add(t);
        System.out.println("[Account:" + number + "] withdraw " + amount + " New balance: " + balance);
        System.out.println("[Transaction] Created: ID=" + t.getTransaction_id() + ", Type=" + t.getType_of_transaction() + ", Amount=" + t.getAmount() + ", Date=" + t.getDate());

    }

    public void addTransaction(Transaction t) {
        if (t != null) transactions.add(t);
        System.out.println("[Transaction] Added manually: ID=" + t.getTransaction_id() + ", Type=" + t.getType_of_transaction() + ", Amount=" + t.getAmount() + ", Date=" + t.getDate());

    }

    public String getNumber() { return number; }
    public double getBalance() { return balance; }
    public Customer getCustomer() { return customer; }
    public List<Transaction> getTransactions() { return new ArrayList<>(transactions); }

    public abstract double calculateCharges();
    public abstract double calculateInterest();
}

