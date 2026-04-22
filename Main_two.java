import java.io.*;

/*
Write a Java program to copy the contents of one file (source.txt)
into another file (destination.txt) using FileReader and FileWriter
*/

class Main_two {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("source.txt");
        FileWriter fw = new FileWriter("destination.txt");

        int ch;
        while((ch = fr.read()) != -1){
            fw.write(ch);
        }

        fr.close();
        fw.close();
    }
}