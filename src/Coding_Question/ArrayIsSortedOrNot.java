package Coding_Question;

import java.util.Arrays;

// given array is sorted or not
public class ArrayIsSortedOrNot {

    public static boolean isSorted(int[] arr, int i) {

        if (i == arr.length - 1) {
            return true;
        }
        if (arr[i] > arr[i + 1]) {
            return false;
        }
        return isSorted(arr, i + 1);
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int i = 0;

         System.out.println(isSorted(array, i));


    }
}
