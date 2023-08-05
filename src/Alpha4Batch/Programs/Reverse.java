package Alpha4Batch.Programs;

import java.io.FilterOutputStream;
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int number = sc.nextInt();
        System.out.print("the Reverse number is :");
        while (number > 0) {
           /* int lastdigit = number % 10;   // for last digit come find reminder
            System.out.print(lastdigit);
             number = number / 10;      // for last digit cut find divide */
            int rev = 0;
            int lastdigit = number % 10;      // find for last digit
            rev = (rev * 10) + lastdigit;      // print last digit
            number = number / 10;            // cut fo last digit
            System.out.print(rev);          // finally printing out reverse number
        }

    }
}

