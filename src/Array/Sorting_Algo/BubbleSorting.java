package Array.Sorting_Algo;

import java.lang.reflect.Array;

public class BubbleSorting {
    public static void sorting(int[] arr) {
        int n = arr.length - 1;
        for (int i = 0; i < n; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i; j++) {
                // compare 0 idx --> 1 idx
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // tc = O(N)
            if (swapped == false) {
                break;
            }
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void descendingOrder(int arr[]) {
        int start = 0;
        int n = arr.length-1;

        // 0,1,2,3,4,5,.......... arr.length.
        int last = n;  //from last - n-1,n-1,n-3,......1, 0;
        for (int i = start; i < last; i++) { // N-2
            // swapping
            int temp = arr[last];
            arr[last] = arr[start];
            arr[start] = temp;
            start++;
            last--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        sorting(arr);
        printArray(arr);
        System.out.println();
        descendingOrder(arr);
        printArray(arr);


    }
}
