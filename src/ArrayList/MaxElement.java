package ArrayList;

import java.util.ArrayList;
// --> O(n)
public class MaxElement {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(1);
        list.add(7);
        list.add(9);
        list.add(6);
        System.out.println(list); //[4, 5, 1, 7, 9, 6]
        System.out.println("Find the Max Element :");
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <list.size() ; i++) {
//            if (max < list.get(i)){
//                max = list.get(i);
//            }
            max = Math.max(max , list.get(i));
        }
        System.out.println(" Max element is : " + max);
    }
}