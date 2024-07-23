package Alpha4Batch.String;

public class LargestString {
    public static void largeStr(String[] fruits) {
        String largest = fruits[0];
        for (int i = 1; i < fruits.length; i++) {
            if (largest.compareToIgnoreCase(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        String[] fruits = {"Apple", "mango", "papaya", "peas"};
        largeStr(fruits);
    }
}
