package Coding_Question.streamApi.listOpration;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Methods {

    public static void main(String[] args) {

        // filter(predicates) --> means return boolean value  --> true and false
        // map (function)  return the value
        // forEach(consumers) that's mean its consume elements one by one

        List<String> name = Arrays.asList("Alok", "Neeraj", "Kumar", "Aman", "Annu");
        List<String> newList = name.stream().filter(e -> e.startsWith("A")).collect(Collectors.toList());
        newList.forEach(System.out::println);
        System.out.println(newList);
        // find the square of numbers used by map method
        List<Integer> num = Arrays.asList(1, 2, 8, 3, 4, 5, 6, 7);
        List<Integer> num1 = num.stream().map(n -> n * n).collect(Collectors.toList());
        System.out.println(num1);

       List<Integer> num2 = num.stream().filter(n->n<5).collect(Collectors.toList());
        System.out.println(num2);
        // sorted methods
        List<Integer> sortedNumbers = num.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNumbers);

        //find the min  and max

      Integer minValue =   num.stream().min((x,y)-> x.compareTo(y)).get();
        System.out.println(minValue);

       Integer highValue = num.stream().max(Integer::compareTo).get();
        System.out.println(highValue);


    }
}
