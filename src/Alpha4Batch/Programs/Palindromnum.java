package Alpha4Batch.Programs;

import java.util.Scanner;
public class Palindromnum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (Ispalendrom(num)) {
            System.out.println("No is Palindrom");
        } else {
            System.out.println("no is not Palindrom");
        }
    }
    public static boolean Ispalendrom(int number) {
        int palindrom = number;
        int reverse = 0;
        while (palindrom != 0) {
            int lastDigit = palindrom % 10;
            reverse = (reverse * 10) + lastDigit;
            palindrom = palindrom / 10;
        }
        if (number == reverse) {

            return true;
        }
        return false;
    }
}





