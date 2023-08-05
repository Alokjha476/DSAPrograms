package Array.Max_Sub_ArraySum;

public class KadansAlgo {
    public static int sumArray(int[] number) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            currSum = currSum + number[i];
            if (currSum < number[i]) {
                currSum = number[i];
            }
            maxSum = Math.max(currSum, maxSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] number = {-2, -3, 4, -1, -2, 1, 5, -3};
        int[] arr = { -6, -3, -4 ,-5};
        int index = sumArray(arr);
        System.out.println("The max sum is : " + index);

    }
}
