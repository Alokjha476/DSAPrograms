package Coding_Question.customObjectUsingJava8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sort {
    public static void main(String[] args) {
        List<Students> studentsList = Arrays.asList(new Students(1, "Alok"), new Students(2, "Neeraj"));
//        for (Students students : studentsList) {
//            System.out.println(students);
        //   }
    studentsList.forEach(System.out::println);
   // studentsList.sort(Comparator.comparing());
    }
}
