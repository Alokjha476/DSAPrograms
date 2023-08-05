package SyntaxWithParameter;

import java.util.Scanner;
// Program of binomialCofficient by mathod colling
public class Factorial {
    public static int factorial(int n) {
        int fac = 1;
        //System.out.println("The Factorial Series is :-");
        for (int i = 1; i <= n; i++) {  // Loop
            //  System.out.print(i + "*" + "");
            fac *= i;    // fac = fac * i (logic)
        }
        return fac;
    }

    public static int binomialCoff(int n, int r) {      // formal aprameter accept a copy of arguments
        int fac_n = factorial(n);  // call above function
        int fac_r = factorial(r);   //call above function
        int facnr = factorial(n - r); //call above function
        int binomialCoff = fac_n / (fac_r * facnr); // assign the valure of binomial formula to the function and return
        return binomialCoff;   // return the value of this function which is called by main function

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(binomialCoff(a,b)); // call by value or actual argument// paas the copy as a to parameter
    }
}
