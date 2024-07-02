package Coding_Question.streamApi;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

public class StreamObject {
    public static void main(String[] args) {

        // stream api - collections process
        // collections - group of object

        // blank Stream

        Stream <Object> empty = Stream.empty();
        // second way object / Collections
        String [] names = {"Alok", "Neeraj", "Annu", "Pushpak", "Pankaj", "Anmol"};
        Stream<String>  stream1 = Stream.of(names);
        stream1.forEach(System.out::println);
    }
}
