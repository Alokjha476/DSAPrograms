package Coding_Question;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

// Find the occurrence every element

public class HashSet1 {
    public static void main(String[] args) {
        String str = "aaallookk";
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        char[] ch = str.toCharArray();



        for (char c : ch) {
            if (charCountMap.containsKey(c)) {
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                 charCountMap.put(c, 1);
            }

        }

        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
