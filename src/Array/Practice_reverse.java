package Array;

public class Practice_reverse {
    public static void reverseArray(int number[]) {
        int start = 0;
        int last = number.length - 1;
        while (start < last) {
            int temp = number[last];
            number[last] = number[start];
            number[start] = temp;
            start++;
            last--;
        }
        System.out.println("Reverse array is :");
    }

    public static void main(String[] args) {
        int number[] = {2, 4, 6, 8, 10, 13, 14, 17, 15};
        reverseArray(number);
        for (int i = 0; i <number.length ; i++) {
            System.out.println(number[i] +" ");

        }
    }
}
