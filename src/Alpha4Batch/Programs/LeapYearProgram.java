package Alpha4Batch.Programs;

import java.util.Scanner;

public class LeapYearProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        boolean isLeapYear = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));

        if (isLeapYear) {
            System.out.println("Leap year");
        } else {
            System.out.println("Is not leap year");
        }
    }
}
