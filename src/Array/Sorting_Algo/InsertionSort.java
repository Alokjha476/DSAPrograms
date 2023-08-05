package Array.Sorting_Algo;

public class InsertionSort {
    public static void sorting(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];  // temp var  check value arr[i] = 4
            int prev = i - 1; //0
        // find the element current position
            while (prev >= 0 && arr[prev] > curr) {  // 5>4 // 5>3, 4>3
                arr[prev + 1] = arr[prev];  // arr[1] = arr[0] // 4,4,3,6,2,1// temp =5 // 3,3,3
                prev--; // 0-1 = -1//check the previous index then compare again //
            }
            /* insertion */
            arr[prev+1] = curr;  // -1+1 = arr0 = arr1 , 5 = curr/(arr1)
        }
    }
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 6, 2, 1};
        sorting(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
