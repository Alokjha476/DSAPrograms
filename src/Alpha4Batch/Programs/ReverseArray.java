package Alpha4Batch.Programs;

public class ReverseArray {
    public static void reverse(int[] arr) {
        int first = 0;
        int last = arr.length - 1;
        for (int i = first; i <= last; i++) {
            // swap
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 4, 1, 3, 2};
        reverse(arr);

        for (int j : arr) {
            System.out.print(j + " ");

        }


    }
}

