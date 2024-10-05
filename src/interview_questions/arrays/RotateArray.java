package interview_questions.arrays;

import java.util.Arrays;

public class RotateArray {

    public static void rotate(int[] array) {

        int n = array.length;
        int temp = array[0];

        for (int i = 1; i < n; i++) {
            array[i - 1] = array[i];
        }

        array[n - 1] = temp;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr);
        System.out.print("Rotated Array" + Arrays.toString(arr));

        //output = 2,3,4,5,1
    }
}
