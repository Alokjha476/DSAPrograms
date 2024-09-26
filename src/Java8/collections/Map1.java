package Java8.collections;

import java.util.HashMap;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
//        List<String> strings = Arrays.asList("My name is Alok Kumar");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Alok");
        map.put(2, "Kansan");
        map.put(3, "Nee raj");
        map.put(4, "Amal");


        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            Integer key = entry.getKey();


            String value = entry.getValue();
            if (value.toLowerCase().startsWith("a")) {
                if (value.toLowerCase().endsWith("l")) {
                    System.out.println(value + " " + key);

                }
            }


        }

    }
}
