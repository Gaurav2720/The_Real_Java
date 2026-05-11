import java.io.*;;


public class Main2 {
public static void main(String[] args) {
    
    try{

        FileWriter fw = new FileWriter("destination.txt");
        FileReader fr = new FileReader("Source.txt");

        int ch;
        while((ch = fr.read()) != -1){
            fw.write(ch);
        }
        fw.close();
        fr.close(); 
        System.out.println("copied");

    }
    catch(Exception e){
        System.out.println(e);
    }
    

}
   
}
