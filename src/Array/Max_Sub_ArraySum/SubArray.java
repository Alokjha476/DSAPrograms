package Array.Max_Sub_ArraySum;

public class SubArray {
    public static void subArray(int[] number) {
        int ts = 0;
        for (int i = 0; i < number.length; i++) { // start
            int start = i;
            for (int j = 0; j < number.length; j++) { // end
                int end = j;
                for (int k = start; k <= end; k++) { // print sub array
                    System.out.print(number[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
            System.out.println("Total sub array is : " + ts);
        }
    }

    public static void main(String[] args) {
        int[] number = {2, 4, 6, 8, 10};
        subArray(number);

    }
}
