package Alpha4Batch.Programs;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            boolean isPrime = true;         // for Assume
            System.out.println("Enter your number :");
            int num = sc.nextInt();
            // Corner case
            if (num == 2 && num <= 0) {
                System.out.println("Prime");
            }
            for (int i = 2; i <= Math.sqrt(num); i++) {   // under root num or  num-1
                if (num % i != 0) {
                    isPrime = false;
                }
            }
            if (!isPrime) {
                System.out.println("number is not prime");
            } else {
                System.out.println("number is Prime");
            }
        }
    }
}



