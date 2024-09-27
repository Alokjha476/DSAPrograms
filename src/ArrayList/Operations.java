package ArrayList;

import java.util.ArrayList;

public class Operations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // Add element --> O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1,10); // --> O(n)
        System.out.println(list);  //--> [1, 10, 2, 3, 4, 5]
        // print siz of array list
        System.out.println(list.size());
        for (int i = 0; i < list.size() ; i++) {

            System.out.print(list.get(i) + " ");
        }




        //get element --> O(1)
//        int ele = list.get(2);
//        System.out.println(ele); // tc = O(1)

        // remove element -->O(n)
//        list.remove(3);
//        System.out.println(list);

        // Set element at index --> O(n)
//       list.set(2,5);
//        System.out.println(list);

        // Contain element
//        System.out.println(list.contains(5)); // true
//        System.out.println(list.contains(11)); // false , value not exist


    }
}
