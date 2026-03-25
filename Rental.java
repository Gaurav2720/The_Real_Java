/*10.1. Design and implement a Java program for a Vehicle Rental System using the concept of
abstract classes. Create an abstract class named Vehicle that contains basic details such as vehicle
number and model name. The class should include an abstract method calculateRent(int
days) to compute the rental cost based on the number of days, and a concrete
method displayDetails() to display vehicle information. Derive two classes from
the Vehicle class: Car, which calculates rent based on a fixed daily rate, and Bike, which
calculates rent based on a lower daily rate compared to cars. In the main method, create objects of
both Car and Bike, call their respective methods, and display the rental cost along with vehicle
details.
11.1. Write a Java program to:
• Create a user-defined exception InvalidAgeException
• Throw the exception if age is less than 18
• Handle it using try-catch block
• Explain the flow of execution
• Write a main() method to demonstrate all functionalities.
*/
abstract class Vehicle {
    String Vehiclenumber;
    String modelnumber;
    int age;

    Vehicle(String number, String model, int age) {
        this.Vehiclenumber = number;
        this.modelnumber = model;
        this.age = age;
    }

    abstract double CalculateRent(int days);

    void displayDetails() {
        System.out.println("Vehicle Name: " + Vehiclenumber);
        System.out.println("Model Number: " + modelnumber);
        System.out.println("Driver Age: " + age);
    }
}

class Car extends Vehicle {
    double daily_rate = 2000;

    Car(String number, String model, int age) {
        super(number, model, age);
    }

    double CalculateRent(int days) {
        return daily_rate * days;
    }
}

class Bike extends Vehicle {
    int daily_rate = 500;

    Bike(String number, String model, int age) {
        super(number, model, age);
    }

    double CalculateRent(int days) {
        return daily_rate * days;
    }
}

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

class AgeChecker {
    void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age " + age + " is too low! Minimum age is 18.");
        } else {
            System.out.println("Age " + age + " is valid. Access granted!");
        }
    }
}

public class Rental {
    public static void main(String[] args) {

        AgeChecker ac = new AgeChecker();

        Car c = new Car("MH12AB1234", "Toyota Innova", 15);
        c.displayDetails();
        try {
            ac.checkAge(c.age);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("Rent for 5 days: Rs." + c.CalculateRent(5));

        System.out.println();

        Bike b = new Bike("MH12XY5678", "Royal Enfield", 22);
        b.displayDetails();
        try {
            ac.checkAge(b.age);
        } catch (InvalidAgeException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        System.out.println("Rent for 5 days: Rs." + b.CalculateRent(5));
    }
}