package Alpha4Batch.Recurssion;

import java.util.Scanner;

public class SumofNumber {
    public static int sum(int n) {
        if (n == 0 || n ==1) {
        return n;
        }else
            return n  + sum(n-1);

    }
    public static int sum1(int n ){
        int i = n == 0 ? 0 : n % 10 + sum1(n / 10);
        return i;  // sum of digit
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
       // System.out.println(sum(n));
        System.out.println(sum(n));
    }
}
