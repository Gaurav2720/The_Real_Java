package assignment;
/* Write a program demonstrating conversion between primitive types
   and wrapper classes, including autoboxing/unboxing */

public class Test {
    public static void main(String[] args) {
        System.out.println("Name: Gaurav Bhaskar, Batch: 03, SAP ID: 590012457");

        int a = 10;

        // Autoboxing (primitive → object)
        Integer obj = a;

        // Unboxing (object → primitive)
        int b = obj;

        System.out.println("Primitive: " + a);
        System.out.println("Object (Wrapper): " + obj);
        System.out.println("Unboxed: " + b);
    }
}