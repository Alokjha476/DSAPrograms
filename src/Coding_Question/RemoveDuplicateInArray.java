package Coding_Question;

import java.util.*;

public class RemoveDuplicateInArray {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,4,5,6,6,7);
        list.stream().distinct().forEach(System.out::print);

        Set<Integer> noDuplicate = new HashSet<>(list);
        System.out.println(noDuplicate);

        Integer [] arr = {1,2,3,4,5};
        List<Integer> array = Arrays.asList(arr);
        System.out.println(array);

        array.stream().distinct().forEach(System.out::println);





        }





}
