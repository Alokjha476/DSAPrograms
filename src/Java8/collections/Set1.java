package Java8.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("My name ", "is", "Alok Kumar");
        Set<List<String>> set = new HashSet<>();
        set.add(list);
        System.out.println(set);
        set.remove(list);


        


    }
}
