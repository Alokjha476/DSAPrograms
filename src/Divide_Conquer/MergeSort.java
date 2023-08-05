package Divide_Conquer;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {3, 6, 5, 9, 8, 7};
        mergeSort(arr, 0, arr.length - 1);
        printArray(arr);
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void mergeSort(int arr[], int si, int ei) {
        // base
        if (si >= ei) {
            return;
        }
        // kaam
        int mid = si + (ei - si) / 2; // (si+ei)/2
        mergeSort(arr, si, mid); // solve left part recursively
        mergeSort(arr, mid + 1, ei); // solve right part recursively
        merge(arr, si, ei, mid);
    }

    public static void merge(int arr[], int si, int ei, int mid) {
// create a new temp array to store the merge array
        // (left (0 , 3) = 4, right(4,6)= 3  -->4+3 =7) --> ei - si+1 = 6-0+1 = 7
        int temp[] = new int[ei - si + 1];
        int i = si; // iterator of left part
        int j = mid + 1; //iterator of right part
        int k = 0; //iterator of array part
        while (i <= mid && j <= ei) {
            if (arr[i] < arr[j ]) {
                temp[k] = arr[i];
                i++; // index badana of  i = si
            } else {
                temp[k] = arr[j];
                j++; // index badana from mid+ 1
            }
            k++;
        }
        // for Bache huye elements
        // left part
        while (i <= mid) {
            temp[k++] = arr[i++];

        }
        // right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }
        //  Copy temp to orignal araay
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];

        }
    }

}
