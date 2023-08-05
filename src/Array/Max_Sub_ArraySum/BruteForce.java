package Array.Max_Sub_ArraySum;
// Brute force
// time complexity is O(n3)
public class BruteForce {
    public static void SumsubArray(int number[]) {

        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
    // Time complexity - O(n*n*n) = O(n3)  very weast time complexity
        for (int i = 0; i < number.length; i++) {
            int start = i;
            for (int j = i; j < number.length; j++) {
                int end = j;
                currSum = 0;
                for (int k = start; k <= end; k++) {  // print sub array
                    currSum += number[k];
                }
                System.out.println(currSum);
                if (maxSum < currSum){
                    maxSum = currSum;
                }

            }
            System.out.println();
        }
        System.out.println("Max Sum is : "+maxSum);
    }
    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10};
        SumsubArray(number);
    }
}
