package ArrayList;

import java.util.ArrayList;

public class ReverseOfArrayList {
    public static void printArrayAssending(ArrayList list) {
        for (int i = 1; i < 6; i++) {
            list.add(i);
        }
        System.out.println(list);
    }

    public static void deassending(ArrayList list) {
        for (int i = list.size()-1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        printArrayAssending(list);
        deassending(list);
    }
}
