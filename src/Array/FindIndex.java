package Array;

public class FindIndex {
    public static int linearSearch_Number(int number[], int key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[] = {2, 43, 2, 33, 22, 33, 7, 43, 3, 4, 35, 3, 3};
        int key = 4;
        int index = linearSearch_Number(number, key);
        if (index == -1) {
            System.out.println("not available");
        } else {
            System.out.println("index number is =" + index);
        }
    }
}
