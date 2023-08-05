package SyntaxWithParameter;

import java.util.Scanner;

public class FabbonicciSeries {
    // 0,1,1,2,3,5,8,13.21.34.55
    //print for 0,1;
    public static void main(String[] args) {
        int first = 0, second = 1;
        System.out.println("Enter the number");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 1;
        while (i <= n) { //n =10
            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;

            i++;
        }


    }

}
