public class CurrentAccount extends Account {
    public CurrentAccount(String number, double initialBalance, Customer customer) {
        super(number, initialBalance, customer);
    }

    public double calculateCharges() {
        double charges = 25.0;
        System.out.println("[CurrentAccount:" + getNumber() + "] Charges: " + charges);
        return charges;
    }

    public double calculateInterest() {
        double interest = getBalance() * 0.01;
        System.out.println("[CurrentAccount:" + getNumber() + "] Interest: " + interest);
        return interest;
    }
}


