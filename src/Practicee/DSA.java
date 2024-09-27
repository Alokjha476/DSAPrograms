package Practicee;

public class DSA {
    // linear search
    // time complexity in unsorted array --> O(n) --> Time = input size(n)
    public static int searching(int arr[]) {
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

    // Bubble sort TC = O(n^2)
    public static void bubbleSort(int arr[]) {
        int n = arr.length - 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
    }

    // Optimized code for Bubble Sort TC = O(n)
    public static void optimizedBubbleSort(int arr[]) {
        int n = arr.length - 1;
        for (int i = 0; i < n; i++) {
            boolean swapped = false;
            for (int j = 0; j <n-i ; j++) {
                // compare 0 idx --> 1 idx
                if (arr[j]> arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            // tc = O(N)
            if (swapped == false){
                break;
            }
        }
    }

    public static void main(String[] args) {
        // 1 method
        int arr[] = {5, 3, 6, 2, 8, 9, 10};
//        System.out.println(searching(arr));
        // 2 nd Method
//        bubbleSort(arr);
        optimizedBubbleSort(arr);
        printArr(arr);
    }

}
