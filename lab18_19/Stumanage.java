import java.util.*;

class Student {
    String name, course;
    int ID, marks;

    Student(String name, String course, int ID, int marks) {
        this.name = name;
        this.course = course;
        this.ID = ID;
        this.marks = marks;
    }

    public String toString() {
        return ID + " " + name + " " + course + " " + marks;
    }
}

public class Stumanage {
    public static void main(String args[]) {

        // OBJECTS
        Student s1 = new Student("Sunil", "CSE", 44, 90);
        Student s2 = new Student("Anil", "CSE", 33, 85);
        Student s3 = new Student("Pooja", "ME", 22, 80);

        // LIST
        List<String> li = new ArrayList<>();

        li.add(s1.name);
        li.add(s2.name);
        li.add(s3.name);

        System.out.println(li);

        Collections.sort(li);
        System.out.println("After Sorting: " + li);

        li.set(1, null);
        System.out.println("After Update: " + li);

        // SET (UNIQUE COURSES)
        Set<String> s = new TreeSet<>();

        s.add(s1.course);
        s.add(s2.course);
        s.add(s3.course);

        System.out.println("Courses: " + s);
        System.out.println("Total Unique Courses: " + s.size());

        // MAP (ID -> DETAILS)
        Map<Integer, Student> m = new TreeMap<>();

        m.put(s1.ID, s1);
        m.put(s2.ID, s2);
        m.put(s3.ID, s3);

        System.out.println("Map: " + m);

        // SEARCH
        System.out.println("Search ID 22: " + m.get(22));

        // REMOVE
        m.remove(33);
        System.out.println("After Removal: " + m);

        // CHECK
        System.out.println("Contains ID 22: " + m.containsKey(22));
    }
}