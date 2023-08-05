package BackTracking;

public class ArrayBacktracking {
    public static void changeArray(int arr[], int idx, int value) {
        //base case
        if (idx == arr.length) {
            printArr(arr); //1 2 3 4 5
            return;
        }
        // kaam
        arr[idx] = value; // 0 index pr 1 baith gya
        // total call recursion done
        changeArray(arr, idx+1, value+1);
        // call bapis ayi tab
        arr[idx] = arr[idx] - 2; // Back tracking steps for every index

    }

    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArray(arr, 0, 1);
        printArr(arr); //-1 0 1 2 3
    }
}
