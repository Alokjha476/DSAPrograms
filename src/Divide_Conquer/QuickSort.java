package Divide_Conquer;

public class QuickSort {
    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }
        //find the pivot as my  last element
        int pivotIndex = partition(arr, si, ei);
        // sort the left part
        quickSort(arr, si, pivotIndex - 1);
        // sort the right part
        quickSort(arr, pivotIndex + 1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si - 1; // jagah banana
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // to set the pivot in the right position
        i++;
        int temp = pivot;
        arr[ei] = arr[i];
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        int arr[] = {3, 6, 5, 9, 8, 7};
        quickSort(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
