package Coding_Question.streamApi.hasMap;

import java.util.*;

public class HashMap1 {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("alok", "neeraj", "aman", "pam", "ann");
        List<String> list1 = Arrays.asList("alokkk", "neeraj", "amannnn", "pam", "annnn");
//        Iterator<String> iterator = list.iterator();
//        if (iterator.hasNext()){
//            String str = iterator.next();
//            System.out.println(str);
//        }

//        for (int i = 0; i <list.size() ; i++) {
//            System.out.println(list.get(i));
//
//        }

        Map<String, List<String>> newhasmap = new HashMap<>();
        newhasmap.put("Class A", list);
        newhasmap.put("Class B", list1) ;
//        newhasmap.forEach((key, value) -> {
//            List<String> aName = value.stream().filter(a -> a.startsWith("a")).collect(Collectors.toList());
//            for (String str : aName) {
//                System.out.println(key.contains("Class A") + str);
//            }
//        });
        // Print the student names that start with 'A'
        for (Map.Entry<String, List<String>> entry : newhasmap.entrySet()) {
            System.out.println("Class: " + entry.getKey());
            for (String name : entry.getValue()) {
                if (name.startsWith("a")) {
                    System.out.println("Student: " + name);
                }
            }
        }
    }
}




