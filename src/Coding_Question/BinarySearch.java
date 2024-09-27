package Coding_Question;

import java.util.Arrays;

public class BinarySearch {
    public static int binarySearch(int[] arr, int key) {

        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 5, 4, 3};
        int key = 6; // output 2
        Arrays.sort(array);
        System.out.println(binarySearch(array, key));

        if (binarySearch(array,key) == -1){
            System.out.println("Element is not exist");
        }
        else {
            System.out.println("Element is present ");
        }

    }
}
