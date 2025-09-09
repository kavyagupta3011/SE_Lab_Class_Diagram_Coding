import java.util.ArrayList;
import java.util.List;

public class Bank_Branch {
    private String branch_id;
    private String location;
    private List<Account> accounts;

    public Bank_Branch(String branch_id, String location) {
        this.branch_id = branch_id;
        this.location = location;
        this.accounts = new ArrayList<>();
        System.out.println("[Bank_Branch] Created branch " + branch_id + " at " + location);
    }

    public void setBranch_id(String branch_id) {
        this.branch_id = branch_id;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBranch_id() {
        return branch_id;
    }

    public String getLocation() {
        return location;
    }

    public void withdraw(Account account, double amount) {
        System.out.println("[Bank_Branch:" + branch_id + "] withdraw called for " + account.getNumber());
        account.withdraw(amount);
    }

    public void deposit(Account account, double amount) {
        System.out.println("[Bank_Branch:" + branch_id + "] deposit called for " + account.getNumber());
        account.deposit(amount);
    }

    public void checkBalance(Account account) {
        System.out.println("[Bank_Branch:" + branch_id + "] Balance of " + account.getNumber() + " = " + account.getBalance());
    }

    public void addAccount(Account account) {
        if (!accounts.contains(account)) {
            accounts.add(account);
            System.out.println("[Bank_Branch:" + branch_id + "] Account associated: " + account.getNumber());
        }
    }

    public List<Account> getAccounts() {
        return new ArrayList<>(accounts);
    }
}


