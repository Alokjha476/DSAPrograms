package Alpha4Batch.Programs;

import java.util.Scanner;

public class Prime_numbyMethod {
    // The Method will return true and false only because its type is boolean
    public static boolean Isprime(int n) {
        //boolean isprime = true;
        if (n == 2) {       // corner case
            return true;

        }
        if (n == 0 || n == 1) {  // corner case
            System.out.println("Not prime and prime its a decomposite number");
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {       // n-1
            if (n % i == 0) {
                // isprime = false;        // number is not prime
                // break;
                return false;
            }
        }
        // true, number is prime
        // return isprime;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();
        System.out.println(Isprime(n));

    }
}
