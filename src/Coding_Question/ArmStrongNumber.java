package Coding_Question;

import java.util.Scanner;

public class ArmStrongNumber {
    public static boolean armStrongNumber(int num) {

        String number = Integer.toString(num);
        int newNum = number.length();
        // System.out.println(newNum);
        int sum = 0;
        int number1 = num;

        while (number1 > 0) {

            int reminder = number1 % 10; // 3
            sum += (int) Math.pow(reminder, newNum);
            number1 = number1 / 10;
        }
        if (sum != num) {
            return false;

        }
        return true;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
             System.out.println("Enter the number");
            int number = sc.nextInt();
            System.out.println(armStrongNumber(number));
            if (number == 0) {
                break;
            }
        }
    }
}
