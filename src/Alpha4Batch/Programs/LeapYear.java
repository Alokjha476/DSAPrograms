package Alpha4Batch.Programs;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter year :");
            int year = sc.nextInt();
            boolean a = (year % 4) == 0;
            boolean b = ((year % 100 == 0) && (year % 400 == 0));
            if (year == 0) {
                System.out.println("terminate");
                break;
            }
            if (a && b) {
                System.out.println("leap year");
            } else {
                System.out.println("Not leap year");
            }
        }
        System.out.println("not leap year");
    }
}

