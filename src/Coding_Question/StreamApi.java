package Coding_Question;


import java.util.*;

public class StreamApi {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(44);
        list.add(32);
        list.add(5);
        list.add(2);
        list.add(77);
       // System.out.println(list);

       // List<Integer> newList =list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
      //  System.out.println(newList);

    // put, remove, contains, getSet,
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Neebu", 2);
        hm.put("Adrak", 1);
        hm.put("Tomato", 10);
        System.out.println(hm);
        Map<String, Integer> hm1 = Collections.synchronizedMap(hm);
        System.out.println(hm1);
        System.out.println(hm.get("Neebu"));
        Set<String> key = hm.keySet();
        System.out.println(key);

        for(String k : key){
            System.out.println(k+"= " +"value" + "="+ hm.get(k));

        }




    }
}
