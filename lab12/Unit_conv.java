/*14.1. An online store needs a single reusable method to:

•⁠  ⁠Apply discount on any product price
•⁠  ⁠Accept different numeric types (Integer, Double, etc.)
•⁠  ⁠Return final payable amountpackage lab12;
*/


public class Unit_conv {

    // Generic method to convert units
    public static <T extends Number> double convert(T value, String type) {
        double val = value.doubleValue();

        switch (type) {
            case "m_to_km":
                return val / 1000;

            case "c_to_f":
                return (val * 9 / 5) + 32;

            case "kg_to_g":
                return val * 1000;

            default:
                System.out.println("Invalid conversion type");
                return 0;
        }
    }

    public static void main(String[] args) {
        // Test conversions
        System.out.println("Meters to KM: " + convert(5000, "m_to_km"));
        System.out.println("Celsius to Fahrenheit: " + convert(25, "c_to_f"));
        System.out.println("KG to Grams: " + convert(2.5, "kg_to_g"));
    }
}