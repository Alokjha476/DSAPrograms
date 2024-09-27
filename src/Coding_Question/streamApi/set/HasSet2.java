package Coding_Question.streamApi.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.stream.Collectors;

public class HasSet2 {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        strings.add("alok");
        strings.add("kumar");
        //
        strings.add("ankit");
       // strings.add(null);
        System.out.println(strings);

        strings.stream()
                .filter(w -> w != null && w.endsWith("t"))  // Check for null before endsWith
                .collect(Collectors.toList())
                .forEach(System.out::println);
    //
     //   strings.stream().iterator().hasNext();

//        Iterator<String> iterator = strings.iterator();
//        if (iterator.hasNext()) {
//           String str = iterator.next();
//            System.out.println(str);
//
//
//        }

    }
}
