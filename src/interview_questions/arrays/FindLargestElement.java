package interview_questions.arrays;

public class FindLargestElement {
    public static void main(String[] args) {
        int[] array = {1, 5, 2, 3, 9};
        int firstLargest = 0;

        for (int j : array) {
            if (firstLargest < j) {
                firstLargest = j;
            }
        }
        int secondLargest = 0;
        for (int j : array) {
            if (secondLargest < j && j < firstLargest) {
                secondLargest = j;

            }
        }
        int thirdLargest = 0;
        for (int i = 0; i < array.length; i++) {
            if (thirdLargest < array[i] && array[i] < secondLargest) {
                thirdLargest = array[i];
            }
        }
        System.out.println(firstLargest);
        System.out.println(secondLargest);
        System.out.println(thirdLargest);
    }
}

