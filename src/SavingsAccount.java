public class SavingsAccount extends Account {
    public SavingsAccount(String number, double initialBalance, Customer customer) {
        super(number, initialBalance, customer);
    }

    public double calculateCharges() {
        double charges = 10.0;
        System.out.println("[SavingsAccount:" + getNumber() + "] Charges: " + charges);
        return charges;
    }

    public double calculateInterest() {
        double interest = getBalance() * 0.04;
        System.out.println("[SavingsAccount:" + getNumber() + "] Interest: " + interest);
        return interest;
    }
}

