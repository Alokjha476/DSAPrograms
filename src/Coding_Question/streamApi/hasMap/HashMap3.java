package Coding_Question.streamApi.hasMap;

import java.security.Key;
import java.util.*;

public class HashMap3 {
    public static void main(String[] args) {
        List<String> student1 = Arrays.asList("ankit", "neeraj", "piyush", "devesh");
        List<String> student2 = Arrays.asList("ankit1", "neeraj1", "piyush1", "devesh1");
        List<String> student3 = Arrays.asList("ankit2", "neeraj2", "piyush2", "devesh2");

        Map<String, List<String>> map = new HashMap<>();
        map.put("class A", student1);
        map.put("class B", student2);
        map.put("class C", student3);
        int n =map.size();
        System.out.println(n);

        // entrySet
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();

            List<String> value = entry.getValue();


            for (String values : value) {
                if (values.startsWith("a")) {
                    System.out.println(" value " + " =" + values + " " + "key" + "=" + key);
                }
            }
        }
    }
}
