package week9;
    class Account {
    int Id;
    String Account_holder_name;
    String Address;
    double balance;

    // Constructor
    Account(int id, String name, String address, double balance) {
        Id = id;
        Account_holder_name = name;
        Address = address;
        this.balance = balance;
    }

    // Deposit method
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Balance: " + balance);
    }

    // Withdraw method
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    // Static method to calculate Simple Interest
    static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    // Static method to calculate Compound Interest
    static double calculateCompoundInterest(double principal, double rate, double time) {
        return principal * Math.pow((1 + rate / 100), time) - principal;
    }
}

public class task3 {
    public static void main(String[] args) {

        Account a = new Account(
            101,
            "Rahul",
            "Delhi",
            10000
        );

        a.deposit(5000);
        a.withdraw(2000);

        // Simple Interest
        double si = Account.calculateSimpleInterest(10000, 5, 2);
        System.out.println("Simple Interest: " + si);

        // Compound Interest
        double ci = Account.calculateCompoundInterest(10000, 5, 2);
        System.out.println("Compound Interest: " + ci);
    }
}
