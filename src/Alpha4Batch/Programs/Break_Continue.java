package Alpha4Batch.Programs;

import java.util.Scanner;

public class Break_Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("Enter your number :");
            int number = sc.nextInt();
            if (number % 10 == 0 && number%2 == 0) {
                continue;    // Skip if belong above condition
            }
            System.out.println("your number is :" + number);

        } while (true);
    }
}
