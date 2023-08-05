package Alpha4Batch.Programs;

import java.util.Scanner;

public class Range_PrimeNumber {
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        if (n == 0 || n == 1){
            return false;
        }
        else {

            for (int i = 2; i <= n - 1; i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void rangePrint(int n) {
        System.out.println("The Range is :");
        for (int i = 2; i <= n; i++) {

            if (isPrime(i)) // true
                System.out.print( i + " ");
        }
    }
    public static void prime_or_not(int n) {
         if (isPrime(n)) {
            System.out.println("true :number is prime");
        } else {
            System.out.println("false :number is not prime");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number:");
        int n = sc.nextInt();
        prime_or_not(n);
        System.out.println("Then this number is:"+ "" +isPrime(n));
        rangePrint(n);
    }
}
