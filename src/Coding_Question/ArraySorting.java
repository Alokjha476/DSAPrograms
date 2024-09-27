package Coding_Question;

public class ArraySorting {
    public static void main(String[] args) {
        int [] arr = new int [] {5, 2, 8, 7, 1};
        int count = 0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
            System.out.println();
        }
        System.out.println(count);
        // Second way
        // bubble sort
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j = 0; j <arr.length-i-1 ; j++) {
                if (arr[j] > arr[j+1]){
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }

        }

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]);

        }

    }
}
