import java.util.*;

class Book {
    int id ;
    String name ;
    String author ;

    Book(int id, String name , String author ){
        this.id = id;
        this.name = name ;
        this.author = author ;

    }

    void Display(){

        System.out.print("ID:" + id + " ");
        System.out.print("Name:" + name + " ");
        System.out.println("Author:" + author );

    } 
}

public class Test{

    public static void main(String[] args) {
        List<Book> BD = new ArrayList<>();

        BD.add(new Book(2, "A" , "Z"));

        BD.add(new Book(4, "D", "C"));
        
        BD.get(1).author = "chetanbhagat";

        BD.remove(1).name= "D";

        System.out.println(BD);
        //removing

        for(Book b : BD){
            b.Display();
        }
        
    }
}
