package lab1;
class A extends Thread{
    public void run (){
        try{
            System.out.println ("him ");
        Thread.sleep(900);
        
        System.out.println ("tera mera afsana ");
        Thread.sleep(2000);

        System.out.println("pura hoya na jana");
        Thread.sleep(3000);
        }

        catch (Exception e){

        }
    }
}
class B extends Thread{
    public void run (){
        try{
        

        System.out.println("honvan band kamre vich kala");
        Thread.sleep(6000);

        
        System.out.println("fir vi disdan hai parshavan");
        Thread.sleep(8000);
        }

        catch (Exception e){

        }
    }
}




public class lyrics {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();

        a.start();
        b.start();
    }
}
