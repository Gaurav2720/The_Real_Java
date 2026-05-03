package assignment;
import java.io.*;
import java.util.*;

/*
Write a Java program to:
- Take student details (ID, Name, Marks) from user
- Store them in a file
- Read and display all records
*/

class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        FileWriter fw = new FileWriter("students.txt");

        for(int i=0;i<3;i++){
            String id = sc.next();
            String name = sc.next();
            int marks = sc.nextInt();
            fw.write(id + " " + name + " " + marks + "\n");
        }
        fw.close();

        BufferedReader br = new BufferedReader(new FileReader("students.txt"));
        String line;
        while((line = br.readLine()) != null){
            System.out.println(line);
        }
        br.close();
    }
}