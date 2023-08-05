package Alpha4Batch.OOPS;


public class AbstractMathod {
    public static void main(String[] args) {
        // Animal2 --> Horse --> Chicken
//        Horse h = new Horse();
//        h.eat();
//        h.walk();
//        Chicken ch = new Chicken();
//        ch.eat();
//        ch.walk();
        Chicken ch = new Chicken();

    }
}
abstract class Animal1 {
    String color;
    Animal1(){  // firstly call constructor
        System.out.println("Brown");
    }
    void eat() {     // non-abstract mathod
        System.out.println("Eating Food");
    }
    abstract void walk();     // abstract method & no implementation in here
}
class Horse extends Animal1 {
    Horse(){   // 2nd call constructor
        System.out.println("Dark Brown");
    }
    void walk() {        // definition of abstract method
        System.out.println("Walks 4 legs");
    }
}
class Chicken extends Horse {
    Chicken(){ // 3rd call constructor
        System.out.println("Yellow");
    }
    void walk() {        //definition of abstract method
        System.out.println("Walk on 2 legs");
    }
}
