public class FRUIT {

    // Data members
    String color;
    String taste;
    double price;

    // Constructor
    FRUIT(String c, String t, double p) {
        color = c;
        taste = t;
        price = p;
    }

    // Method to display values
    void display() {
        System.out.println("Color: " + color);
        System.out.println("Taste: " + taste);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {

        // Creating object and passing values to constructor
        FRUIT f = new FRUIT("Red", "Sweet", 80);

        // Displaying values
        f.display();
    }
}
