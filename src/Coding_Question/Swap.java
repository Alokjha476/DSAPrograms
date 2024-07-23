package Coding_Question;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        a = a+b; // 15
        b = a-b; // 15-5 = 10
        a = a-b;

        System.out.println(a + " " +  b);

       int a1 = 1;
       int b1= 2;
       int temp = a1;
       a1 = b1;
       b1 = temp;
        System.out.println(a1 + " " + b1);

    }
}
