package Alpha4Batch.Programs;

import java.util.Scanner;

public class Odd_even {

    public static boolean eveOdd(int z) {
        if (z % 2 == 0) {
                return true;   // true == even
            }

            return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number :");
        while (true) {
            int n = sc.nextInt();
            System.out.println(eveOdd(n));
        }
    }

    public static class Revnum {
        public static void number(int n) {
            int number = 0;
            while (n >= number) {
                number = number + 1;
                System.out.print(number + " ");
                //number++;  //odd number
            }
        }
        public static void table(int n){
    //        Scanner sc = new Scanner(System.in);
    //        int n = sc.nextInt();
            int i = 1;
            while (i <=10) {
                int c = n * i ;
                System.out.println(c);
                i++;
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your number: ");
            int n = sc.nextInt();
           // number(n);
            table(n);

        }
    }
}
