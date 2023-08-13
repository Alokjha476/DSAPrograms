package Alpha4Batch.String;

import java.util.Scanner;

public class NumberToString {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Input number :");
            int num = sc.nextInt();
            //  while base case

            if (num < 1 || num > 9999) {
                System.out.println("Invalid");
                return;
            } else {
                int a = num % 10; // last digit
                int b = num / 10; // first digit
                int c = b % 10; // last digit
                int g = num / 100; // first digit
                int d = g % 10;
                int e = num / 1000;

                String sd[] = {"", "One", "two", "three", "four", "five",
                        "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                        "sixteen", "Seventeen", "Eighteen", "Ninteen"};
                String ty[] = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
                String hun = "Hundred";
                String th = "Thousand";
                if (num < 20) {
                    System.out.println(sd[num]);
                } else if (num < 100) {
                    System.out.println(ty[b] + " " + sd[b]);
                } else if (num < 1000){
                    System.out.println(sd[d] + " " + hun + ""+ ty[c] + "" + sd[a]);
                }
                else {
                    System.out.println(sd[e]+ " "+th+" "+sd[d] + " " + hun + ""+ ty[c] + "" + sd[a]);
                }
            }
        }
    }
}
