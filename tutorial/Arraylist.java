import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
public class Arraylist{
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        
     

        arr.add(10);
        arr.add(20);
        arr.add(30);
        arr.add(50);


        Iterator<Integer> iterator = arr.iterator();
        while(iterator.hasNext()){
            System.out.println("element:" + iterator.next());
        }





    

        System.out.println(arr);
        System.out.println(arr.size());


        
    }
}