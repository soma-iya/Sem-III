package week9;

abstract class Account {
    int Id;
    String Account_holder_name;
    String Address;

    // Constructor
    Account(int id, String name, String address) {
        this.Id = id;
        this.Account_holder_name = name;
        this.Address = address;
    }

    // Abstract methods
    abstract void deposit(double amount);

    abstract void withdraw(double amount);
}

// Subclass of Account
class SavingsAccount extends Account {
    double balance;

    // Constructor
    SavingsAccount(int id, String name, String address, double balance) {
        super(id, name, address);
        this.balance = balance;
    }

    // Implement deposit()
    @Override
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    // Implement withdraw()
    @Override
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance.");
        }
    }
}

// Main class
public class task4 {
    public static void main(String[] args) {

        SavingsAccount account = new SavingsAccount(
                101,
                "Rahul",
                "Delhi",
                10000
        );

        account.deposit(5000);
        account.withdraw(3000);
    }
}
