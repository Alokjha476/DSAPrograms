package Coding_Question;

import java.util.Arrays;
import java.util.Scanner;

public class FindFirstOccurence {
    public static int firstOccurence(int [] arr, int i , int key){

        if (i == arr.length){
            return -1;
        }
        if (arr[i] == key){
            return i;
        }
      return  firstOccurence(arr, i+1, key);
    }


    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please enter size of array: ");
//       int num = sc.nextInt();
//        System.out.println("Enter array number :");
//
//       int[] array = new int[num];
//
//        for (int i = 0; i < array.length; i++) {
//            array[i] = sc.nextInt();
//        }
//
//        for (int i = 0; i <array.length ; i++) {
//            System.out.print(array[i] + " ");
//
//        }
        int [] arr = {1,2,3,4,5,6,4,5,6,7};

        System.out.println(firstOccurence(arr,0,5));

    }
}
