package interview_questions.arrays;

import java.util.Arrays;

public class MergeTwoArray {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5}; // array.length-1
        int [] arr2 = {5,6,7,8,9};
        int [] newArray = new int[arr1.length+ arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            newArray[i] = arr1[i];
        }

        for (int i = 0; i <arr2.length ; i++) {
            newArray[arr2.length+i] = arr2[i];
        }


//        for (int i = 0; i <newArray.length ; i++) {
//            System.out.print(newArray[i]);
//
//        }
        Arrays.toString(newArray);
    }
}
