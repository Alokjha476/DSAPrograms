package interview_questions.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Alok", "Alok1", "Kumar");
        List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
        list.stream().filter(name-> name.toLowerCase()
                .startsWith("a")).collect(Collectors.toList()).forEach(System.out::println);
        list1.stream().map(number-> number*number).collect(Collectors.toList())
                .forEach(System.out::println);

      String length =  list.stream().max(Comparator.comparing(String::length)).get();
        System.out.println(length);

       Optional<Integer> maxNum = Optional.of(list1.stream().max(Integer::compareTo).get());
        System.out.println(maxNum);

    }

}
