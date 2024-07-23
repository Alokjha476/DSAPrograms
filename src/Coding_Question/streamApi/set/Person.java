package Coding_Question.streamApi.set;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Person {
    Integer rollNo;
    String name;
    Integer age;

    public Person(Integer rollNo, String name, Integer age) {
        this.age = age;
        this.name = name;
        this.rollNo = rollNo;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;

    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public Integer getAge() {
        return age;
    }

    public static void main(String[] args) {
        Set<Person> setOfPerson = new HashSet<>();
        setOfPerson.add(new Person(1, "Alok", 26));
        setOfPerson.add(new Person(2, "Neeraj", 27));
        setOfPerson.add(new Person(3, "Kanchan", 23));
        setOfPerson.add(new Person(4, "Arti", 28));
        // Max age
        Person person = setOfPerson.stream().max(Comparator.comparing
                (Person::getAge)).orElseThrow(() -> new RuntimeException("Set is empty"));
        System.out.println(person.getAge());
        // Min age
        Person person1 = setOfPerson.stream().min(Comparator.comparing
                (Person::getAge)).orElseThrow(() -> new RuntimeException("set is empty"));
        System.out.println(person1.getAge());

        // find the K elements
        setOfPerson.stream().filter(person2 -> person2.getName().startsWith("K"))
                .forEach(person2 -> System.out.println(person2.getName()));

        // find by I'd
        Person person2 = setOfPerson.stream().max(Comparator.comparing(Person::getRollNo)).
                orElseThrow(() -> new RuntimeException("not found"));
        System.out.println(person2.getRollNo() + person2.getName()+ person2.rollNo);

    }
}
