import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String phone_number;
    private String email;
    private String address;
    private String date_of_birth;
    private String card_number;

    private List<Account> accounts;

    public Customer(String name, String phone_number, String email, String address, String date_of_birth, String card_number) {
        this.name = name;
        this.phone_number = phone_number;
        this.email = email;
        this.address = address;
        this.date_of_birth = date_of_birth;
        this.card_number = card_number;
        this.accounts = new ArrayList<>();
        System.out.println("[Customer] Created: " + name);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }
    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }
    public String getName() { 
        return name;
    }

    public String getPhone_number() {
        return phone_number;
    }
    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public String getCard_number() {
        return card_number;
    }

    public void addAccount(Account account) {
        if (!accounts.contains(account)) {
            accounts.add(account);
            System.out.println("[Customer] Account " + account.getNumber() + " added to " + name);
        }
    }

    public List<Account> getAccounts() {
        return new ArrayList<>(accounts);
    }

}

