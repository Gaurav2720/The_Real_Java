
/*12.1.  Write a java program to create two threads. One thread prints number from 1-10. Another thread print alphabet from A-J. Both should run simultaneously. //
*/ 

class A extends Thread{

    public void run(){
        for (int i = 1 ; i <=15; i ++){
        System.out.println(i);
    }
}
}
class B extends Thread{

    public void run(){
        for (int i = 65; i <=74 ; i ++){
        System.out.println((char)(i));
    }
}
}
public class Threads {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.start();
        b.start();
   
    }

    
}