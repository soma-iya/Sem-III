package week9;
    class Vehicle {
    void cost() {
        System.out.println("Cost of the vehicle.");
    }
}

class Bus extends Vehicle {
    void display() {
        System.out.println("This is a Bus.");
    }
}

class Train extends Vehicle {
    void display() {
        System.out.println("This is a Train.");
    }
}

public class Week9 {
    public static void main(String[] args) {
        Bus b = new Bus();
        Train t = new Train();

        b.cost();
        b.display();

        t.cost();
        t.display();
    }
}
