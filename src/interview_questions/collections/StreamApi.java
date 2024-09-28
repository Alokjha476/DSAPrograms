package interview_questions.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("papaya", "banana", "peas", "pomegranate", "zoo", "apple");
        List<Integer> list1 = Arrays.asList(5, 4, 6, 6, 3, 2, 6);
        // find the word which start by a or A
        list.stream().filter(name -> name.toLowerCase().startsWith("a")).collect(Collectors.toList()).forEach(System.out::println);
        //Find the square using map function
        list1.stream().map(number -> number * number).collect(Collectors.toList()).forEach(System.out::println);
        // find the max String value using max function
        //Comparator.comparing(String::length
        // (a, b) -> a.compareToIgnoreCase(b)
        String length = list.stream().max(String::compareToIgnoreCase).get();
        System.out.println(length);
        // find the max number by max function
        Integer maxNum = list1.stream().max(Integer::compareTo).get();
        System.out.println(maxNum);
        // sort the value by sorted function
        list.stream().sorted().forEach(System.out::println);

        // sort value by length
        list.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

        // Number list operations
        // list1.stream().distinct().forEach(System.out::println);
        // list1.stream().sorted().forEach(System.out::println);

        list1.stream().filter(num -> num == 5).map(num1 -> num1 * num1).forEach(System.out::println);

    }

}
