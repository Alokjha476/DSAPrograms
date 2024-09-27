package Coding_Question;

import java.util.*;

public class FindDuplicateInArray {
    public static void main(String[] args) {
        Integer [] arr = {1,2,3,4,4,5,5};
        List<Integer> list = Arrays.asList(arr);
        list.stream().distinct().forEach(System.out::print);

        Set<Integer> set = new HashSet<>(list);
        System.out.println(set);
    }

    }

