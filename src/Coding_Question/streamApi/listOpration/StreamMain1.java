package Coding_Question.streamApi.listOpration;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
// Stream is an interface

public class StreamMain1 {

    public static void main(String[] args) {
        //Q1 - Find the even number in a list

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println(list);

        List<Integer> list1 = list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println(list1);

        List<Integer> list2 = list.stream().filter(num -> num > 2).collect(Collectors.toList());
        System.out.println(list2);




    }
}
