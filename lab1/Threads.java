package lab1;
class A extends Thread{

    public void run(){
        for (int i = 1 ; i <=15; i ++){
        System.out.println("thread 1");
    }
}
}
class B extends Thread{

    public void run(){
        for (int i = 1; i <=50 ; i ++){
        System.out.println("thread 2");
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