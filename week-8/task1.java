public class Mavenproject1 {

    public static void main(String[] args) {

        // Creating three objects
        FRUIT f1 = new FRUIT();
        FRUIT f2 = new FRUIT();
        FRUIT f3 = new FRUIT();

        // Setting values for first object
        f1.color = "Red";
        f1.taste = "Sweet";
        f1.price = 80;

        // Setting values for second object
        f2.color = "Yellow";
        f2.taste = "Sweet";
        f2.price = 60;

        // Setting values for third object
        f3.color = "Green";
        f3.taste = "Sour";
        f3.price = 50;

        // Calling display()
        f1.display();
        f2.display();
        f3.display();
    }
}

// FRUIT class
class FRUIT {

    // Data members
    String color;
    String taste;
    double price;

    // Method to display values
    void display() {
        System.out.println("Color: " + color);
        System.out.println("Taste: " + taste);
        System.out.println("Price: " + price);
        System.out.println();
    }
}
