package Alpha4Batch.Programs;

import java.util.Scanner;

public class SumofNaturalnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Number:");
        int n = sc.nextInt();
        int i = 1;
        int sum = 1;
        // print sum of number
//        while(i <= n){
//            System.out.print(sum +"+" +i+ "=");
//            sum += i;
//            i++;
//            System.out.println(sum);
//        }
//       // System.out.println(sum);

        //print number
//        while(i <= n){
//            System.out.print(" "+i);
//            i++;
//        }
        // table print
        while (i <= 10) {
            System.out.print(n + "*" + i + "=");
            sum = n * i;
            i++;
            System.out.println(sum);

        }
    }
}

