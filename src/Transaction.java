import java.util.concurrent.atomic.AtomicInteger;

public class Transaction {
    private String transaction_id;
    private String type_of_transaction;
    private String date;
    private double amount;

    private static final AtomicInteger counter = new AtomicInteger(1000);

    public Transaction(String transaction_id, String type_of_transaction, String date, double amount) {
        this.transaction_id = transaction_id;
        this.type_of_transaction = type_of_transaction;
        this.date = date;
        this.amount = amount;
    }

    // Getter and setter methods for all attributes. 
    // (Not always required here since transaction_id is generated automatically 
    // using the static counter in generateId(), but provided for completeness)

    public String getTransaction_id() {
        return transaction_id;
    }
    public void setTransaction_id(String transaction_id) {
        this.transaction_id = transaction_id;
    }
    public String getType_of_transaction() {
        return type_of_transaction;
    }
    public void setType_of_transaction(String type_of_transaction) {
        this.type_of_transaction = type_of_transaction;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }


    public static String generateId() {
        return "T" + counter.getAndIncrement();
    }

    public String toString() {
        return "[" + transaction_id + " | " + type_of_transaction + " | " + date + " | " + amount + "]";
    }
}

