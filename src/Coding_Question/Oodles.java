package Coding_Question;

import SyntaxWithParameter.ToString;

class A {
    int age;
    String name;

    public A(int age, String name) {
        this.age = age;
        this.name = name;

    }
    // Copy Constructor
    public A(A other) {
        this.name = other.name;
        this.age = other.age;
    }
   public void Display(){
       System.out.println(age + " " + name);
   }

}

public class Oodles {
    public static void main(String[] args) {
        A a = new A(25, "Alok");
        A a1 = new A(a);
        a1.Display();



    }
}


