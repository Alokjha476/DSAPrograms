package Alpha4Batch.Recurssion;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
    }


    public static int fibonacci(int n) {
        if (n < 0)
            throw new IllegalArgumentException("n should be non-negative");
        if (n == 0 || n == 1) {
            return n;
        }
        return (fibonacci(n - 1) + fibonacci(n - 2));
    }
}