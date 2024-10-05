package Coding_Question.streamApi.hasMap;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComparingByKey {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "One");
        hm.put(2, "One");
        hm.put(4, "four");
        hm.put(3, "three");
        hm.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        hm.entrySet().  stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
        hm.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);

        /*for (Map.Entry<Integer, String> entry : hm.entrySet()) {
            int key = entry.getKey();
            String val = entry.getValue();
            if (val.startsWith("o")){
                System.out.println(val);
            }
        }*/
    }
}
