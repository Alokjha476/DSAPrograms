package Array;

public class Dictionary {
    public static int search(String name[], String key) {
        int start = 0;
        int end = name.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (name[mid] == key) {
                return mid;
            }
            else {
                System.out.println("key not available");
            }


        }
        return -1;
    }


    public static void main(String[] args) {
        String name[] = {"Able", "About", "Above", "Cat", "Camel", "Congaroo", "Dang", "Donkey", "Eagg"};
        String key = "Congaroo";
        int index = search(name, key);
        if (index == -1) {
            System.out.println("Word not found in this dictionary");
        } else {
            System.out.println("Index number is :" + index);
        }
    }
}
