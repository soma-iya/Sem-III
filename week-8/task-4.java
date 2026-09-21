public class FRUIT {

    // Data members
    String color;
    String taste;
    double price;

    // Default constructor
    FRUIT() {
        color = "Unknown";
        taste = "Unknown";
        price = 0;
    }

    // One-argument constructor
    FRUIT(String c) {
        color = c;
        taste = "Unknown";
        price = 0;
    }

    // Two-argument constructor
    FRUIT(String c, String t) {
        color = c;
        taste = t;
        price = 0;
    }

    // Three-argument constructor
    FRUIT(String c, String t, double p) {
        color = c;
        taste = t;
        price = p;
    }

    // Display method
    void display() {
        System.out.println("Color: " + color);
        System.out.println("Taste: " + taste);
        System.out.println("Price: " + price);
        System.out.println();
    }

    public static void main(String[] args) {

        // Using default constructor
        FRUIT f1 = new FRUIT();

        // Using one-argument constructor
        FRUIT f2 = new FRUIT("Red");

        // Using two-argument constructor
        FRUIT f3 = new FRUIT("Yellow", "Sweet");

        // Using three-argument constructor
        FRUIT f4 = new FRUIT("Green", "Sour", 50);

        // Display values
        f1.display();
        f2.display();
        f3.display();
        f4.display();
    }
}
