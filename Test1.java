import java.util.*;
class Inventory{

    int id;
    String name ;
    int Price;

    Inventory(int id, String name, int Price){
        this.id = id;
        this.name = name;
        this.Price = Price;
        
}
void display(){

    System.out.print("Name:"+name +"\n");
    System.out.print("ID:" + id +"\n");
    System.out.println("Price:" + Price +"\n" );
}


}
public class Test1 {

    public static void main(String[] args) {
            
        HashMap<Integer, Inventory> S = new HashMap<>();

        S.put(23, new Inventory(23, "namak", 80));
        S.put(24, new Inventory(24, "kalanamak", 80));
        S.put(25, new Inventory(25, "namakeen", 80));


        S.get(23).name = "chips";
        S.remove(24);
        
        for(Inventory product : S.values()){
            product.display();
        }

    }
}
