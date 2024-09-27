package Coding_Question;

// find the key
public class LinearSearch {

    public static int findKey(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }

        }
        return -1;

    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        int key = 1;
        int result = findKey(array, key);
        if (result == -1) {
            System.out.println("Key not found: " + result + "Index" +  " ");
        } else {
            System.out.println("key found :" + result + " index ");
        }
    }
}
