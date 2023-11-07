package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfArray {
    private static List<int[]> findSum(int[] arr, int s) {
        List<int[]> res = new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
            int current = arr[i]; //1,2,3,4,5
            for (int j = i+1; j < arr.length ; j++) {
                if (current + arr[j] == s) {
                    int sum = current + arr[j];
                    res.add(new int[]{current, arr[j]});
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int s= 5;
        findSum(arr, s).forEach(e -> System.out.println(Arrays.toString(e)));
    }
}
