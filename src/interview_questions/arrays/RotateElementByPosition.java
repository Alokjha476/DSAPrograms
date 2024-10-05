package interview_questions.arrays;

import java.util.Arrays;
import java.util.Collections;

public class RotateElementByPosition {

    public static void reverseArray1(int[] arr, int start, int end) {

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotateLeft(int[] array, int position) {

        int n = array.length;
        position = position % n; // In case position > array.length

        // reverse the entire array 6,5,4,3,2,1
        reverseArray1(array, 0, n - 1);

        // reverse the first n-d element
        // for reverse 6,5 to 5,6 because 5-3-1= 1 which is change the element of idx 0,1
        reverseArray1(array, 0, n - position - 1);
        // for reverse 4,3,2,1 to 1,2,3,4 because 3-1 = 2[start] last tak
        //rotation part
        reverseArray1(array, position - 1, n - 1);



    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6,7};
        int position = 4;
        rotateLeft(arr, position);
        System.out.println(Arrays.toString(arr));


    }
}
