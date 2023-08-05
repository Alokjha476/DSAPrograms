package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list  = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(7);
        list.add(9);
        list.add(6);
        System.out.println(list);
        Collections.sort(list); // Ascending order
        System.out.println(list);

        // descending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
    }

}
