package Coding_Question;

public class InvertedHalfPyramid {

    public static void printInvertedHalfPyramid(int n ){
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <n-i ; j++) {
                //spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print("*");

            }
            System.out.println();

        }


    }

    public static void main(String[] args) {

        int n = 10;
        printInvertedHalfPyramid(n);

    }
}
