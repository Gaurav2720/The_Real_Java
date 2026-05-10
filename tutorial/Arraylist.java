import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
public class Arraylist{
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
     

        arr.add(10);
        arr.add(20);

        list.add(10);
        list.add(20);

        System.out.println(arr);
        System.out.println(arr.size());

        list.addAll(arr);

        System.out.println(list);
        
    }
}