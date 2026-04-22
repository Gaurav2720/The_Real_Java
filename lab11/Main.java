/*18.1: Student Data Management System using Collections

Develop a Java program to manage student records using the Collections Framework.

Use a List to store student names.
Use a Set to maintain unique course names.
Use a Map to associate student IDs with their respective details (name, course, marks).
Perform the following operations:

Add, update, and remove student records
Display all students in sorted order
Search for a student using ID
Count total unique courses*/
import java.util.*;

class Student {
    int id;
    String name;
    String course;
    int marks;

    Student(int id, String name, String course, int marks) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.marks = marks;
    }
}

public class Main {
    public static void main(String[] args) {

       
        List<String> studentNames = new ArrayList<>();

        
        Set<String> courses = new HashSet<>();

        
        Map<Integer, Student> studentMap = new HashMap<>();

        
        Student s1 = new Student(1, "Amit", "Java", 85);
        Student s2 = new Student(2, "Riya", "Python", 90);

        studentMap.put(s1.id, s1);
        studentMap.put(s2.id, s2);

        studentNames.add(s1.name);
        studentNames.add(s2.name);

        courses.add(s1.course);
        courses.add(s2.course);

        
        studentMap.get(1).marks = 95;

        
        studentMap.remove(2);
        studentNames.remove("Riya");

        
        List<String> sortedNames = new ArrayList<>(studentNames);
        Collections.sort(sortedNames);
        System.out.println("Sorted Student Names:");
        for (String name : sortedNames) {
            System.out.println(name);
        }

        
        int searchId = 1;
        if (studentMap.containsKey(searchId)) {
            Student s = studentMap.get(searchId);
            System.out.println("Found: " + s.name + ", " + s.course + ", " + s.marks);
        }

        
        System.out.println("Total Unique Courses: " + courses.size());
    }
}