package Array;

public class FindIndex1 {
    public static int linesrSearch(String number[], String key) {
        for (int i = 0; i < number.length; i++) {
            if (number[i] == key) {
                return i;
            }

        }
        return -1;
    }
    public static void main(String[] args) {
        String number[] = {"Alok", "Bak", "College", "mai"};
        String key = "Al";
        int index = linesrSearch(number, key);
        if (index == -1) {
            System.out.println("Invalid String");
        } else {
            System.out.println("index number is = " + index);
        }

    }
}
