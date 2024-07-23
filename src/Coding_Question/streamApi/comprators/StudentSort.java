package Coding_Question.streamApi.comprators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    String name;
    int age;
    int roll;

    // Constructor to initialize student objects
    public Student(String name, int age, int roll) {
        this.name = name;
        this.age = age;
        this.roll = roll;
    }

    // Method to display student details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Roll No: " + roll);
    }

    // Comparator for sorting students by name
    public static Comparator<Student> NameComparator = new Comparator<Student>() {
        public int compare(Student s1, Student s2) {
            return s1.name.compareTo(s2.name);
        }
    };

    // Comparator for sorting students by roll number
    public static Comparator<Student> RollComparator = new Comparator<Student>() {
        public int compare(Student s1, Student s2) {
            return s1.roll - s2.roll;
        }
    };

    // Comparator for sorting students by age
    public static Comparator<Student> AgeComparator = new Comparator<Student>() {
        public int compare(Student s1, Student s2) {
            return s1.age - s2.age;
        }
    };
}

// Main class
public class StudentSort {
    public static void main(String[] args) {
        // Create a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 22, 101));
        students.add(new Student("Bob", 20, 102));
        students.add(new Student("Charlie", 21, 103));

        // Sort by name
        System.out.println("Sorting by Name:");
        Collections.sort(students, Student.NameComparator);
        for (Student student : students) {
            student.display();
        }

        // Sort by roll number
        System.out.println("\nSorting by Roll Number:");
        Collections.sort(students, Student.RollComparator);
        for (Student student : students) {
            student.display();
        }

        // Sort by age
        System.out.println("\nSorting by Age:");
        Collections.sort(students, Student.AgeComparator);
        for (Student student : students) {
            student.display();
        }
    }
}
