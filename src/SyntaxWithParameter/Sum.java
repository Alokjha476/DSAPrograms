package SyntaxWithParameter;

import java.util.Scanner;

public class Sum {
    public static int calcuateSum(int a , int b){
        int sum = a+b;
        return sum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st Number :");
        int a = sc.nextInt();
        System.out.println("Enter 2nd Number :");
        int b = sc.nextInt();
        calcuateSum(a,b);
//        int sum1 = calcuateSum(a,b);
//        System.out.println("Sum = " +sum1);
        System.out.println("Sum is :"+calcuateSum(a,b));



    }
}
