package interview_questions.arrays;

public class FindTheMaxAndMIn {
    private static void findMaxMin(int[] arr) {
        int maximum = Integer.MIN_VALUE;
        int minimum = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minimum) {
                minimum = arr[i];
            }
        }

    }


    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 3, 5, 0};
        findMaxMin(arr);
    }


}
