package ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class RemoveDuplicates {
    public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> list){
        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer element:list
             ) {
            if (!newList.contains(element)){
                newList.add(element);
            }

        }
        return newList;

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,12,3,5,2,3,1,1,3,4,5,67,9,43));
        System.out.print("My ArrayList is : " + list);
        // assign the list of removeList which is returning the newList
        System.out.println();
        ArrayList<Integer> removedList = removeDuplicates(list);
        Collections.sort(removedList);
        System.out.print("Removed Duplicates :" + removedList);





    }
}
