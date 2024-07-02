package Coding_Question;

public class ReverseArray {
    public static void revArray(int[] arr) {
        int start = 0;
        int last = arr.length - 1;
        while (start < last) {
            int temp = arr[last];
            arr[last] = arr[start];
            arr[start] = temp;
            start++;
            last--;
        }
        System.out.println("reversed array:");
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 10};
        revArray(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();


    }
}
