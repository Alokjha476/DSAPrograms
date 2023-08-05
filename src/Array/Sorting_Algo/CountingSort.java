package Array.Sorting_Algo;

public class CountingSort {
    public static void countSort(int arr[]) {
        int largest = Integer.MIN_VALUE; // -infinity
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);    // find largest number == range
        }
        int count[] = new int[largest + 1];  // creat new array 0 to 7
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }
        // sorting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 2, 3,6,5,7};
        countSort(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");

        }


    }
}
