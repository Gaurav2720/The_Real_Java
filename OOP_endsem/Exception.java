

import java.io.*;

class Exception_checl{

    int age = 18;
    void check(int age){
        if (age<18){
            throw new ArithmeticException("bhadva hai re tu");
        }
    }
    

}
public class Exception {

    public static void main(String[] args) {
        
    
    try{
        Exception_checl E = new Exception_checl();
        E.check(3);

    }
    catch(ArithmeticException e){
        System.out.println("caught"+ e.getMessage());
    }
}
}
