package Array.Sorting_Algo;

public class SelectionSort {
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minpos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minpos] > arr[j]) {
                    minpos = j;
                }
            }
            //swapping
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void selection1(int number[]) {
        //outer loop
        for (int i = 0; i < number.length - 1; i++) {
            int minele = i;
            for (int j = i + 1; j < number.length; j++) {
                if (number[minele] > number[j]) {
                    minele = j;
                }
            }
            //swapping
            int temp = number[minele];
            number[minele] = number[i];
            number[i] = temp;
        }
    }

    public static void desendingOrder(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int maxPosition = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[maxPosition] < array[j]) {
                    maxPosition = j;
                }

            }
            // swap
            int temp = array[maxPosition];
            array[maxPosition] = array[i];
            array[i] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        int number[] = {5, 3, 9, 6, 7, 8};

//        selectionSort(arr);
//        for (int i = 0; i < arr.length ; i++) {
//            System.out.print(arr[i]+" ");
        selectionSort(number);
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }
}

