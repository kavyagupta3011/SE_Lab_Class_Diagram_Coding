public class Main {
    public static void main(String[] args) {
        System.out.println("=== Demo Start ===");

        Bank bank = new Bank("Demo Bank");

        Bank_Branch branch1 = new Bank_Branch("B001", "Doddathuguru");
        Bank_Branch branch2 = new Bank_Branch("B002", "Electronic City");

        bank.addBankBranch(branch1);
        bank.addBankBranch(branch2);

        Customer cust1 = new Customer("Tim", "9999999999", "tim@example.com", "123 Church Street", "1999-01-01", "CARD1001");
        Customer cust2 = new Customer("Sam", "8888888888", "sam@example.com", "456 Park Avenue", "2000-02-02", "CARD1002");

        SavingsAccount sa1 = new SavingsAccount("SA1001", 1000.0, cust1);
        CurrentAccount ca1 = new CurrentAccount("CA2001", 5000.0, cust1);

        SavingsAccount sa2 = new SavingsAccount("SA1002", 2000.0, cust2);
        CurrentAccount ca2 = new CurrentAccount("CA2002", 3000.0, cust2);

        branch1.addAccount(sa1);
        branch1.addAccount(ca1);
        branch2.addAccount(sa2);
        branch2.addAccount(ca2);

        bank.addAccount(sa1);
        bank.addAccount(ca1);
        bank.addAccount(sa2);
        bank.addAccount(ca2);

        branch1.checkBalance(sa1);
        branch1.deposit(sa1, 500.0);
        branch1.withdraw(sa1, 200.0);

        branch2.checkBalance(ca2);
        branch2.withdraw(ca2, 100.0);
        branch2.deposit(ca2, 400.0);

        sa1.calculateCharges();
        sa1.calculateInterest();
        ca1.calculateCharges();
        ca1.calculateInterest();
        sa2.calculateCharges();
        sa2.calculateInterest();
        ca2.calculateCharges();
        ca2.calculateInterest();


        System.out.println("[Main] Accounts in bank:");
        for (Account a : bank.getAccounts()) {
            System.out.println(" - " + a.getNumber() + " owned by " + a.getCustomer().getName() + " balance=" + a.getBalance());
        }

        bank.deleteAccount(sa2);
        bank.deleteBankBranch(branch2);

        System.out.println("=== Demo End ===");
    }
}

