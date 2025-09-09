import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String bank_name;
    private List<Bank_Branch> branches;
    private List<Account> accounts;

    public Bank(String bank_name) {
        this.bank_name = bank_name;
        this.branches = new ArrayList<>();
        this.accounts = new ArrayList<>();
        System.out.println("[Bank] Created bank: " + bank_name);
    }
    
    public void setBank_name(String bank_name) {
        this.bank_name = bank_name;
    }

    public void addAccount(Account account) {
        if (!accounts.contains(account)) {
            accounts.add(account);
            System.out.println("[Bank] Account added: " + account.getNumber());
        }
    }

    public void deleteAccount(Account account) {
        if (accounts.remove(account)) {
            System.out.println("[Bank] Account removed: " + account.getNumber());
        }
    }

    public void addBankBranch(Bank_Branch branch) {
        if (!branches.contains(branch)) {
            branches.add(branch);
            System.out.println("[Bank] Branch added: " + branch.getBranch_id());
        }
    }

    public void deleteBankBranch(Bank_Branch branch) {
        if (branches.remove(branch)) {
            System.out.println("[Bank] Branch removed: " + branch.getBranch_id());
        }
    }

    public List<Account> getAccounts() {
        return new ArrayList<>(accounts);
    }

    public String getBank_name() {
        return bank_name;
    }

    public List<Bank_Branch> getBranches() {
        return new ArrayList<>(branches);
    }

    
}

