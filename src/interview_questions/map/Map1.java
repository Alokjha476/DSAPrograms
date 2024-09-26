package interview_questions.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Map1 {
    public static void main(String[] args) {
        List<String> lists = Arrays.asList("Alok", "Kumar", "is", "very", "clever");
        Map<Integer, List<String>> map = new HashMap<>();
        map.put(1, lists);
        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
            List<String> str = entry.getValue();
            Integer key = entry.getKey();

            for (String str1 : str) {
                if (str1.toLowerCase().startsWith("a")) {
                    System.out.print(str1 + entry.getKey());
                }
            }
        }
    }
}
