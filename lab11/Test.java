/*19.1: Inventory System using Collections and Wrapper Classes

Develop a Java program for an inventory system that stores product details using Collections Framework and Wrapper Classes.

Use a Map<Integer, String> to store product ID and product name
Use a List to store product prices
Demonstrate autoboxing and unboxing while inserting and retrieving values
Use wrapper class methods (e.g., Integer.parseInt(), Double.valueOf())
Perform the following tasks:

Add new products to the inventory
Calculate total and average price of products
Convert user input (String) into appropriate primitive types using wrapper classes
Display all products with their details*/
import java.util.*;

public class Test {
    public static void main(String[] args) {

        // Map for product ID -> product name
        Map<Integer, String> products = new HashMap<>();

        // List for prices
        List<Double> prices = new ArrayList<>();

        // ADD products (Autoboxing happens automatically)
        products.put(1, "Laptop");
        products.put(2, "Phone");

        prices.add(50000.0);
        prices.add(20000.0);

        // Wrapper class methods
        String input = "30000";
        int parsedInt = Integer.parseInt(input); // String → int
        Double parsedDouble = Double.valueOf("15000"); // String → Double

        prices.add(parsedDouble);

        // CALCULATE total and average
        double total = 0;
        for (Double price : prices) { // Unboxing happens automatically
            total += price;
        }

        double average = total / prices.size();

        System.out.println("Total Price: " + total);
        System.out.println("Average Price: " + average);

        // DISPLAY products
        System.out.println("Product Details:");
        for (Integer id : products.keySet()) {
            System.out.println("ID: " + id + ", Name: " + products.get(id));
        }

        // DISPLAY prices
        System.out.println("Prices:");
        for (Double price : prices) {
            System.out.println(price);
        }
    }
}