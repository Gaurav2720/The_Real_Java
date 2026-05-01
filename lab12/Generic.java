/*14.1. An online store needs a single reusable method to:

•⁠  ⁠Apply discount on any product price
•⁠  ⁠Accept different numeric types (Integer, Double, etc.)
•⁠  ⁠Return final payable amountpackage lab12;
*/


class Discount{
    public < T extends Number > double mydiscount (T price , double p ){

        double p = prince.doubleValue();
        return (p-(p*(dp/100)));

    }
}

public class Generic {
  
    public static void main(String[] args) {
        Discount obj = new Discount ();


        System.out.println("effective price after discount  " + obj.mydiscount(1000,5));
        System.out.println("effective price after discount"+ obj.mydiscount(100.5f, 10 ));
    }
}
