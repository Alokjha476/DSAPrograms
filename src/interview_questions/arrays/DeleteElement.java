package interview_questions.arrays;

public class DeleteElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int removeElement = 1;
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == removeElement) {
                continue; // skip
            } else {
                arr[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i <j ; i++) {
            System.out.print(arr[i] + " ");

        }
    }
}
