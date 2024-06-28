package Alpha4Batch.Programs;

import java.util.Scanner;

public class LeapYearProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        boolean is_leapYear = false;

        if (year % 4 == 0) {
            is_leapYear = true;

            if (year % 100 == 0) {
                is_leapYear = true;

                if (year % 400 == 0) {
                    is_leapYear = true;
                } else {
                    is_leapYear = false;
                }
            }
        } else {
            is_leapYear = false;
        }

        if (!is_leapYear) {
            System.out.println("Is not leap year");
        } else
            System.out.println("Leap year");
    }

}
