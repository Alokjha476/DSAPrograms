import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    //1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list){
        ArrayList<Integer> newList1 = new ArrayList<>();
        for (Integer element :list) {
            if (!newList1.contains(element)){
                newList1.add(element);
            }

        }
    return newList1;
    }
    public static void main(String[] args) {
        ArrayList<Integer>
                list = new ArrayList<>(
                Arrays.asList(1, 10, 1, 2, 2, 3, 3, 10, 3, 4, 5, 5));

        // Print the Arraylist
        System.out.println("ArrayList with duplicates: "
                + list);

        // Remove duplicates
        ArrayList<Integer>
                newList = removeDuplicates(list);

        // Print the ArrayList with duplicates removed
        System.out.println("ArrayList with duplicates removed: "
                + newList);


    }
}


