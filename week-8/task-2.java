public class Task2 {

    static class FRUIT {

        // Data members
        String color;
        String taste;
        double price;

        // Method to set values
        void setDetails(String c, String t, double p) {
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
    }

    public static void main(String[] args) {

        // Creating object
        FRUIT f = new FRUIT();

        // Setting values
        f.setDetails("Red", "Sweet", 80);

        // Displaying values
        f.display();
    }
}
