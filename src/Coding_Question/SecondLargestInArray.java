package Coding_Question;

public class SecondLargestInArray {
    public static int secondLargest(int[] arr) {
        int secondLargest = Integer.MIN_VALUE; //
        int firstLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        // Find the largest element
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > firstLargest) {
                firstLargest = arr[i];  // 20
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] < firstLargest) {
                secondLargest = arr[i];
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > thirdLargest && arr[i] < firstLargest && arr[i] < secondLargest ) {
                thirdLargest = arr[i];
            }
        }
        return thirdLargest;
    }


    public static void main(String[] args) {
        int[] arr = {1,10,15,20,20,15};
        System.out.println(secondLargest(arr));
    }
}
