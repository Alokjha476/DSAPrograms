package Loops;

import java.sql.SQLOutput;
import java.util.Scanner;

public class SumOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;
        int number;
        int evenSum = 0;
        int oddSum = 0;
        do {
            System.out.println("Enter the Number :");
            number = sc.nextInt();
            if (number % 2 == 0) {
                for (int i = 0; i <= number ; i+=2) {
                    evenSum +=i;
                }
                System.out.println("Sum of Even number :" + evenSum);
                break;

            } else {
                for (int i = 1; i <= number ; i+=2) {
                    oddSum += i;
                }
                System.out.println("Sum of odd number" + oddSum);
                break;
            }
        } while (true);
    }
}