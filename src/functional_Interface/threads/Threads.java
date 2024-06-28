package functional_Interface.threads;

public class Threads implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i <=10 ; i++) {
            System.out.println(2*i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public static void main(String[] args) {
        Threads t = new Threads();
        Thread t1  = new Thread(t);
        t1.start();
        TClass t2 = new TClass();

        t2.start();

    }
}
