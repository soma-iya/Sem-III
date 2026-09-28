package week91;


abstract class Account {
    int Id;
    String Account_holder_name;
    String Address;

    // Constructor
    Account(int id, String name, String address) {
        Id = id;
        Account_holder_name = name;
        Address = address;
    }

    // Abstract methods
    abstract void display();
    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

// Saving class
class Saving extends Account {
    double Min_balance;
    double balance;

    // Constructor
    Saving(int id, String name, String address, double min_balance, double balance) {
        super(id, name, address);
        Min_balance = min_balance;
        this.balance = balance;
    }

    // Display Saving account
    @Override
    void display() {
        System.out.println("----- Saving Account -----");
        System.out.println("Account ID: " + Id);
        System.out.println("Account Holder: " + Account_holder_name);
        System.out.println("Address: " + Address);
        System.out.println("Minimum Balance: " + Min_balance);
        System.out.println("Current Balance: " + balance);
    }

    // Deposit in Saving account
    @Override
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited in Saving Account: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    // Withdraw from Saving account
    @Override
    void withdraw(double amount) {
        if (balance - amount >= Min_balance) {
            balance = balance - amount;
            System.out.println("Withdrawn from Saving Account: " + amount);
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Withdrawal not possible.");
            System.out.println("Minimum balance must be maintained: " + Min_balance);
        }
    }
}

// Current class
class Current extends Account {
    double Max_withdrawl_limit;
    double balance;

    // Constructor
    Current(int id, String name, String address,
            double max_withdrawl_limit, double balance) {
        super(id, name, address);
        Max_withdrawl_limit = max_withdrawl_limit;
        this.balance = balance;
    }

    // Display Current account
    @Override
    void display() {
        System.out.println("----- Current Account -----");
        System.out.println("Account ID: " + Id);
        System.out.println("Account Holder: " + Account_holder_name);
        System.out.println("Address: " + Address);
        System.out.println("Maximum Withdrawal Limit: " + Max_withdrawl_limit);
        System.out.println("Current Balance: " + balance);
    }

    // Deposit in Current account
    @Override
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited in Current Account: " + amount);
        System.out.println("Current Balance: " + balance);
    }

    // Withdraw from Current account
    @Override
    void withdraw(double amount) {
        if (amount <= Max_withdrawl_limit && amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn from Current Account: " + amount);
            System.out.println("Current Balance: " + balance);
        } else {
            System.out.println("Withdrawal not possible.");
            System.out.println("Maximum withdrawal limit: " + Max_withdrawl_limit);
        }
    }
}

// Main class
public class task5 {
    public static void main(String[] args) {

        // Creating Saving object
        Saving saving = new Saving(
                101,
                "Rahul",
                "Delhi",
                5000,
                10000
        );

        // Creating Current object
        Current current = new Current(
                102,
                "Amit",
                "Mumbai",
                15000,
                30000
        );

        // Display Saving account
        saving.display();
        saving.deposit(5000);
        saving.withdraw(4000);

        System.out.println();

        // Display Current account
        current.display();
        current.deposit(10000);
        current.withdraw(12000);
    }
}
