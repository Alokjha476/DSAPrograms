package Coding_Question.streamApi.set;

import java.util.*;

public class Set1 {
    public static void main(String[] args) {
        List <String> hs = new ArrayList<>();
        hs.add("alok");
        hs.add("annu");
        hs.add("aman");
        hs.add("neeraj");

        Iterator<String> str = hs.iterator();
        while (str.hasNext()){
            String element = str.next();
           // System.out.println(element);
            if (element.startsWith("a")){
                System.out.println(element); // print neeraj
            }
        }

        // by for each loop
        for (String str1 : hs){
            if (str1.endsWith("j")){
                System.out.println(str1);
            }
        }
      }
}

