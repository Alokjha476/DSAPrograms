package Alpha4Batch.Programs;

public class Solutions {
    public static void main(int arr[]) {
        int first = 0; // 0, 1,2,3,4,5...............arr.length-1;
        int last = arr.length-1;   // n-1,n-2,n-3,n-4 ............1
        for (int i = first; i < last; i++) {
            // swap
            int temp = arr[first];
            arr[first] = arr[last];
            arr[last] = temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+ " ");

        }
        System.out.println();
        main(arr);
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] +" ");

        }

    }
}

