package functional_Interface;

public class SumOfArray1 {
    public static void sum(int[] arr){
        int sum =0;
        int n = arr.length-1;
        for (int i = 0; i <=n  ; i++) {
            int current = arr[i];
            sum = sum+arr[i];
        }
        System.out.println(sum);
    }


    public static void main(String[] args) {
        int [] array = {1,2,3,4,5};
        sum(array);
    }
}
