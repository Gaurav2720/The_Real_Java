import java.util.Scanner;
import java.io.*;

class Student {
    int id;
    String name;
    float marks;

    Student(int id, String name, float marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
}

class Fileinput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of students: ");
            int n = sc.nextInt();

            FileWriter fw = new FileWriter("student.txt", true);

            // Loop lagate hai fo rmultiple inputs 
            for (int i = 0; i < n; i++) {

                System.out.println("\nEnter details of student " + (i + 1));

                System.out.print("Enter ID: ");
                int id = sc.nextInt();

                System.out.print("Enter Name: ");
                String name = sc.next();

                System.out.print("Enter Marks: ");
                float marks = sc.nextFloat();

                // Object banayenge constructor  ka 
                Student s = new Student(id, name, marks);

                // Writing karlete hai 
                fw.write(s.id + " " + s.name + " " + s.marks + "\n");
            }

            fw.close();

            System.out.println("\nData saved successfully!\n");

            // Read
            FileReader fr = new FileReader("student.txt");

            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }

            fr.close();

        } catch (IOException e) {
            System.out.println("Error occurred: " + e);
        }

        sc.close();
    }
}