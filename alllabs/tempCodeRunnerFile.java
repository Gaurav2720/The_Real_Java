class Count {
    int count = 0;

    synchronized void increment() {
        count++;
        System.out.println("Incremented: " + count);
    }

    synchronized void decrement() {
        count--;
        System.out.println("Decremented: " + count);
    }

    int getCount() {
        return count;
    }
}

class Increment implements Runnable {
    Count c;

    Increment(Count c) {
        this.c = c;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            c.increment();
        }
    }
}

class Decrement implements Runnable {
    Count c;

    Decrement(Count c) {
        this.c = c;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) {
            c.decrement();
        }
    }
}

public class Increment_Decrement {
    public static void main(String[] args) throws InterruptedException {
        Count c = new Count();

        Thread t1 = new Thread(new Increment(c));
        Thread t2 = new Thread(new Decrement(c));

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Count: " + c.getCount());
    }
}