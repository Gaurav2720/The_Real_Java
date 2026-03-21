class A{

    void show(){
        for (int i = 0 ; i <=10 ; i ++){
        System.out.println("thread 1");
    }
}
}
class B{

    void show(){
        for (int i = 0 ; i <=10 ; i ++){
        System.out.println("thread 2");
    }
}
}
public class Threads {
    public static void main(String[] args) {
        A a = new A();;
        a.show();
        B b = new B();;
        b.show();
   
    }

    
}