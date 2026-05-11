
import java.io.*;


public class StudentFile{


    public static void main(String[] args) {

        try{
        
       

        FileWriter fw = new FileWriter("Student.txt");

            System.out.println("entering data in file ");

            int age = 23;
            String name = "ayush";

            fw.write(age + " " + name);

            fw.close();

            // reading line 

            FileReader fr = new FileReader( "Student.txt");
            BufferedReader br = new BufferedReader(fr);

            String line ;

            while((line = br.readLine())!= null){
                System.out.println(line);
            }

            br.close();




        }
        
        catch (Exception e ){
            System.out.println(e);
        }

    

    }
}