package Coding_Question.streamApi.hasMap;

import java.util.*;

public class HashMap2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("alok", "neeraj", "kumar","annu", "anannd ");
        List<String> list2 = Arrays.asList("alok", "amar", "kumar","suman", "kanchan ");

        Map<Integer, List<String>> map = new HashMap<>();
        map.put(1, list);
        map.put(2,list2);

        // iterate of the map in 3 way
        //1 ->  entrySet();

        for (Map.Entry<Integer, List<String>> entry : map.entrySet()) {
           // System.out.println(entry.getKey() + " = " + entry.getValue());

           // Integer key = entry.getKey();
            List<String> listOfValue = entry.getValue();

            for(String value : listOfValue){
                if (value.startsWith("a") && value.endsWith("r")){
                    System.out.println(value + " =" +  entry.getKey());
                }
            }
        }
    }

}
