package Java8.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortByValue {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("mango", 4);
        map.put("papaya", 7);
        map.put("peas", 8);
        map.put("banana", 5);
        // Map convert into list
        List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
        // sort the list by value
        list.sort(Map.Entry.comparingByKey());
        // Print the sorted key with value
        for (Map.Entry<String, Integer> entry : list) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }
}
