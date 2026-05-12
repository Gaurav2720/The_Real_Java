
class Print {

    int id ;
    String name ;

    Print(int id ,String name ){
            this.id = id ;
            this.name = name;

    }

}
    public class Main{


    public static void main(String[] args) {
        Print p = new Print(32, "gaurav");

        System.out.println(p.id+ " " + p.name);
    }   
}


