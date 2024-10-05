package interview_questions.arrays;
// Difference vs Sum of digit and sum of element.
public class SumOfElement {
    public static int findSum(int[] array) {
        int elementSum = 0;
        int digitSum = 0; //4
        // {1, 23, 3, 45, 5, 6}
        for (int j : array) {
            elementSum = elementSum + j;
            int current = j; // 1
            while (current > 0) {// 1, 23
                int lastDigit = current % 10; // 1 , 3
                digitSum = digitSum + lastDigit; //0+1 = 1+3
                current = current / 10;
            }
        }
        return elementSum-digitSum;
    }
    public static void main(String[] args) {
        int[] array = {1, 23, 3, 45, 5, 6};
        System.out.println(findSum(array));

    }
}
