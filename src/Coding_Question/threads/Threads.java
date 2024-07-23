package Coding_Question.threads;

// Sleep and wait method in java work temp pause the execution
// wait belong to Object Class
// sleep method belong to the thread class

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
       // t1.wait();

        TClass t2 = new TClass();

        t2.start();

    }
}
