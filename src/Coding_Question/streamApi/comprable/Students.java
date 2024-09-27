package Coding_Question.streamApi.comprable;

import java.util.ArrayList;
import java.util.Collections;

public class Students implements Comparable<Students> {
    Integer id;
    String name;
    Integer age;

    public Students(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("id" + " " + id + "name" + " " + name + "age" + " " + age);
    }

    @Override
    public int compareTo(Students o) {
        return this.name.compareTo(o.name);
    }

    public static void main(String[] args) {
        ArrayList<Students> al = new ArrayList<Students>();
        al.add(new Students(101, "Vijay", 23));
        al.add(new Students(106, "Ajay", 27));
        al.add(new Students(105, "Jai", 21));

        Collections.sort(al);
        for (Students byAge : al) {
            byAge.display();
        }
    }
}
