package interview_questions.arrays;

public class ReverseArray {
    public static void reverse(int[] array) {
        // by swapping
        int start = 0, last = array.length - 1;
        while (start < last) {
            int temp = array[start];
            array[start] = array[last];
            array[last] = temp;
            start++;
            last--;
        }
    }
    public static void reverse1(int [] array){
        for (int i = array.length-1; i >= 0 ; i--) {
            System.out.print(array[i] + " ");
        }

    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
//        reverse(array);
//        for (int arr : array) {
//            System.out.print(arr + " ");
//        }
        reverse1(array);
    }
}
