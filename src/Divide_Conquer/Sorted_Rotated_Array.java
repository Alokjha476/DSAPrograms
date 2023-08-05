package Divide_Conquer;

public class Sorted_Rotated_Array {
    public static int SortedArray(int arr[], int tar, int si, int ei) {
        // base case
        if (si > ei) {
            return -1;
        }
        // kaam
        // find the mid
        int mid = (si + ei) / 2;
        if (arr[mid] == tar) {
            return mid;
        }
        // mid on L1
        // left
        if (arr[si] <= arr[mid]) {
            // case a
            if (arr[si] <= tar && tar <= arr[mid]) {
                return SortedArray(arr, tar, si, mid - 1);
            }
            // case b
            return SortedArray(arr, tar, mid + 1, ei);
        }
        // mid on L2
        else {
            // case c
            if (arr[mid] <= tar && tar <= arr[ei]) {
                return SortedArray(arr, tar, mid + 1, ei);
            }
            return SortedArray(arr, tar, si, mid - 1);


        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 0, 1, 2};
        int target = 6;
        int foundinx = SortedArray(arr, target, 0, arr.length - 1);
        System.out.println(foundinx);
    }
}
