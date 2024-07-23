package Coding_Question;

import javafx.scene.transform.Scale;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSortAlgo {

    public static Scanner sc = new Scanner(System.in);

    // Take the Any Array
    public static void arraySize(int[] arr) {
        System.out.println("Enter the Array value:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    // Sorting the array by Bubble sort
    public static void bubbleSort(int[] arr) {
        int[] array;
        array = arr;
        // 5,3,2,1,4
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i + " ");

        }
    }

    // array rotation from any elements
    public static void arrayRotation(int[] array, int breakIdx) {
        int n = array.length;
        int[] newArray = new int[n];
        // 12345 --> 45123
        for (int i = 0; i < n; i++) {
            newArray[i] = array[(n - breakIdx + i) % n];
        }
        for (int arr : newArray) {
            System.out.print(arr + " ");
        }
    }

    // find the element from the rotated array
    public static int findElement(int[] arr1, int si, int ei, int target) {
        // base case
        if (si >= ei) {
            return -1;
        }
        // work
        // find the mid
        int mid = (si + ei) / 2;
        if (arr1[mid] == target) {
            return mid;
        }
        // Line 1
        if (arr1[si] <= arr1[mid]) {
            // case 1
            if (arr1[si] <= target && target <= arr1[mid]) {
                return findElement(arr1, si, mid - 1, target);
            } else
                return findElement(arr1, mid + 1, ei, target);
        } else {
            if (arr1[mid] <= target && target <= arr1[ei]) {
                return findElement(arr1, mid + 1, ei, target);
            } else
                return findElement(arr1, si, mid - 1, target);
        }
    }


    public static void main(String[] args) {
        System.out.println("Enter your size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        // 1.
        arraySize(arr);
        //2
        bubbleSort(arr);
        System.out.println();
        // 3.
        int pivot = 2; // braking point of the array
        arrayRotation(arr, pivot);
        System.out.println();

        int[] arr1 = {5,4,1,2,3};
        int findIdx = findElement(arr1, 0, arr1.length-1,4);
        //4
        System.out.println("the index of target =  "+ findIdx);
    }
}