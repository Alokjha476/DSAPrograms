package Alpha4Batch.Programs;

import java.util.Scanner;

public class Average {
    public static double sumAvg(int n, int m, int o) {
        return n + m + o;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int a = sc.nextInt();
        System.out.println("Enter Second number: ");
        int b = sc.nextInt();
        System.out.println("Enter Second number: ");
        int c = sc.nextInt();
        System.out.println("The evrage of this number = " + sumAvg(a, b, c) / 3);
    }
}
