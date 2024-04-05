package Loops;

import java.util.Scanner;

public class Pattern {
    public static void hollow_Ractangle(int row, int coln) {
        // outer loop
        for (int i = 1; i <= row; i++) {
            // inner loop
            for (int j = 1; j <= coln; j++) {
                // print Star
                if (i == 1 || j == 1 || i == row || j == coln) {  // logic
                    System.out.print("*");
                    // print Spaces
                } else {
                    System.out.print(" ");
                }
            }
            // print next line
            System.out.println();
        }
    }
    public static void half_pyramid_withNumber(int row) {
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }

    public static void floyd_Trangle(int n) {
        int counter = 1;
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + "");
                counter += 1;
            }
            System.out.println();
        }

    }

    public static void butterFly(int n) {
        // halp 1
        //outer loop
        for (int i = 1; i <= n; i++) {
            //Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");

            }
            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
        // next half
        for (int i = n; i >= 1; i--) {
            //Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            //spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");

            }
            // Stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void solid_Rhombus(int n) {
        //outer loop
        for (int i = 1; i <= n; i++) {
            //spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= n; j++) {
                System.out.print("*");

            }
            System.out.println();

        }
    }

    public static void hollo_Rhombus(int n) {
        //outer loop
        for (int i = 1; i <= n; i++) {
            //  spaces print
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");

            }
            // hollo ractangle stars  and spaces
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void diamond(int n) {
        //first half
        //outer loop
        for (int i = 1; i <= n; i++) {
            //inner loop
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {    // odd/ even number (2i -1)||(2i+1)
                System.out.print("*");

            }
            System.out.println();
        }
        //Second half
        for (int i = n; i >= 1; i--) {
            //inner loop
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            // stars
            for (int j = 1; j <= 2 * i - 1; j++) {  // odd number (2i -1)||(2i+1)
                System.out.print("*");

            }
            // next line
            System.out.println();
        }

    }

    public static void half_diamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j >= i && j <= 8 - i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();

        while (n > 0) {

//            hollow_Ractangle(10, 7);
            half_pyramid_withNumber(5);
//            floyd_Trangle(5);
//            butterFly(5);
//            solid_Rhombus(5);
//            hollo_Rhombus(5);
//            diamond(5);
//            half_diamond(5);
            break;
        }
        if (n == 0){
            System.out.println("Loop exit");
        }
    }
}

