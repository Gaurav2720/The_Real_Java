/*8.1. A coaching institute wants to develop a small Java application to manage student fee
calculations.
Design a class StudentFee that satisfies the following requirements:
1. The institute offers three types of admissions:
o Regular admission (only student name)
o Admission with one optional course
o Admission with two optional courses
Create overloaded constructors to initialize student details based on the type of
admission.
2. The fee structure is as follows:
o Base fee: ₹20,000
o Each optional course adds ₹3,000
3. Implement overloaded methods named calculateFee():
o One method that calculates only the base fee.
o One method that calculates fee with one optional course.
o One method that calculates fee with two optional courses.
o One method that also applies a scholarship discount (percentage-based).
4. In the main() method:
o Create objects using different constructors.
o Call appropriate overloaded methods.
o Display the total fee payable in each case
*/
import java.util.Scanner;

public class StudentFee {
    String studentName;
    String course1;
    String course2;

    // Sirf naam ke liye
    StudentFee(String name) {
        this.studentName = name;
        this.course1 = null;
        this.course2 = null;
    }

    // Ek optional course ke saath
    StudentFee(String name, String c1) {
        this.studentName = name;
        this.course1 = c1;
        this.course2 = null;
    }

    // Do optional courses ke saath
    StudentFee(String name, String c1, String c2) {
        this.studentName = name;
        this.course1 = c1;
        this.course2 = c2;
    }

    // Sirf base fee
    int calculateFee() {
        return 20000;
    }

    // Ek course add karo
    int calculateFee(String c1) {
        return 20000 + 3000;
    }

    // Do course add karo
    int calculateFee(String c1, String c2) {
        return 20000 + 3000 + 3000;
    }

    // Scholarship bhi lagao
    double calculateFee(String c1, String c2, int scholarshipPercent) {
        int total = 20000 + 3000 + 3000;
        double discount = (scholarshipPercent / 100.0) * total;
        return total - discount;
    }

    public static void main(String[] args) {
        StudentFee s1 = new StudentFee("Rahul");
        System.out.println(s1.studentName + " ki fee: Rs." + s1.calculateFee());

        StudentFee s2 = new StudentFee("Priya", "Python");
        System.out.println(s2.studentName + " ki fee with 1 courses Rs." + s2.calculateFee(s2.course1));

        StudentFee s3 = new StudentFee("Amit", "Python", "Java");
        System.out.println(s3.studentName + " ki fee with 2 courses Rs." + s3.calculateFee(s3.course1, s3.course2));

        StudentFee s4 = new StudentFee("Sneha", "Python", "Java");
        System.out.println(s4.studentName + " ki fee (20% scholarship): Rs." + s4.calculateFee(s4.course1, s4.course2, 20));
    }
}