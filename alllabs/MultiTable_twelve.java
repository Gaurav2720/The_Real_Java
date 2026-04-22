class Table implements Runnable {
    int n;

    Table(int n) {
        this.n = n;// this helps in creating the difference between instance and local variable 
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}

public class MultiTable_twelve {
    public static void main(String[] args){
        Table t1 = new Table(5);
        Table t2 = new Table(7);

        Thread th1 = new Thread(t1);
        Thread th2 = new Thread(t2);

        th1.start();
        th2.start();
    }
}