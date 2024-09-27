package Coding_Question;

import java.util.Arrays;

public class FindMissingNumber {
    public static void findMissing(Integer[] arr, Integer n) {
        int sum1 = 0;
        for (int i = 0; i < n; i++) {
            sum1 = sum1 + arr[i];
        }
        System.out.print("The sum is " + " " + sum1);
        int sum2 = 0;
        for (int i = 1; i <= 7; i++) {
            sum2 = sum2 + i;
        }
        System.out.println("The sum2 is :" + sum2);

        int sum3 = sum2 - sum1;
        System.out.println("Missing element is : " + sum3);
    }


    public static void main(String[] args) {
        Integer[] arr = {1, 5, 2, 3, 4, 7};
        Integer n = arr.length;
        Arrays.sort(arr);


        for (Integer a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();

        findMissing(arr, n);

    }
}
