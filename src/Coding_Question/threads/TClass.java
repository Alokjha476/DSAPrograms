package Coding_Question.threads;

public class TClass extends Thread{
    public void run(){
        for (int i = 1; i <=10 ; i++) {
            System.out.println(i);
        }
    }



}
