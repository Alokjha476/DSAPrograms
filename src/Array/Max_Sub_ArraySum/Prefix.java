package Array.Max_Sub_ArraySum;

public class Prefix {
    public static void prefix(int number[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[number.length];

        prefix[0] = number[0];
        // calculate prefix
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + number[i];
        }
        for (int i = 0; i < number.length; i++) { //print for sub array
            int start = i;  // 2
            for (int j = i; j < number.length; j++) { // print for sub array
                int end = j;
                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];
                System.out.println("The Sum is"+currSum);
                if (maxSum < currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("The max sum is : " + maxSum);
    }

    public static void prefixSum(int[] arr) { //{-1,4,-3,4,5,-2,4};
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int[] prefix = new int[arr.length];
        // calculate prefix
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];  //{-1,3,0,4,9,7,11}
        }
        for (int i = 0; i < arr.length; i++) {
            //start
            for (int j = i; j < arr.length; j++) {
                int end = j;
                currSum = i == 0 ? prefix[end] : prefix[end] - prefix[i - 1];  //;  sub array sum print
            }
            System.out.println(currSum);
            if (maxSum < currSum) {
                maxSum = currSum;
            }
        }

        System.out.println("MaxSum is :" + maxSum);
    }

    public static void calcMax(int[] arr) {
        int ptr = 1;
        int max = Integer.MIN_VALUE;
        while (ptr < arr.length) {
            max = maxSum(arr, ptr, max);
            ptr++;
        }
        System.out.println("Max value is : " + max);
    }

    public static int maxSum(int[] arr, int ptr, int max) {
        int currSum = arr[ptr - 1];
        int count = 0;
        for (int i = ptr; i < arr.length; i++) {
            currSum = currSum + arr[i];
            if (max < currSum) {
                max = currSum;
            }
            System.out.print(currSum + " ");
            count++;
        }
        System.out.println();
        System.out.println("Count : " + count);
        return max;
    }
    public static void main(String[] args) {
        //int[] arr = {2, 4, 6, 8, 10};
        int[] arr = {-1,4,-3,4,5,-2,4};
        //prefix(number);
        calcMax(arr);
        int max = maxSum(arr, 1, Integer.MIN_VALUE);
        System.out.println("One go max sum: " + max);
    }
}
