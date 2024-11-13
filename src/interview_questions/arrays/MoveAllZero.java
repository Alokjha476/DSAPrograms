package interview_questions.arrays;

import java.util.Arrays;

public class MoveAllZero {
    public static void removeZero(int[] array) {
        int idx = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0){
                array[idx] = array[i];
                idx++;
            }
        }
        while (idx < array.length){
            array[idx] = 0;
            idx++;
        }
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 0, 4, 0, 5, 0};
        removeZero(array);
        System.out.println(Arrays.toString(array));

    }
}
