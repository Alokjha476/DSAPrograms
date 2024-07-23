package Coding_Question;

public class FibonicciSeries {
    public static int findFib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int nm1 = findFib(n - 1);
        int nm2 = findFib(n - 2);

        return nm1 + nm2;

    }

    public static void fibbonicci(int n) {

        int n1 = 0;
        int n2 = 1;
        System.out.print(n1 + " " + n2 + " ");
        for (int i = 1; i <= n; i++) {

           int sum = n1 + n2; // 0+1 = 1// 1+1 = 2 , 1+2 = 3//
            n1 = n2; // 1 ,12  ,
            n2 = sum; //1 , 2 , 3

            System.out.print(sum + " ");
        }


    }


    public static void main(String[] args) {
        int n = 6;
        // System.out.println(findFib(n));
        fibbonicci(n);


    }
}
