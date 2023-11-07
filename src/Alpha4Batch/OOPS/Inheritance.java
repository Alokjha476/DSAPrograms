package Alpha4Batch.OOPS;



public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.color = "white";
        d.eat();
        d.breadth();
        d.legs = 4;
        System.out.println(d.legs);
        d.breed = "Witch";
        System.out.println(d.breed);


    }
}
// Parent/base/super class

class Animal {
    String color;
    void eat(){
        System.out.println("Eating");
    }
    void breadth(){
        System.out.println("Breadhting");
    }
}
class Mammals extends Animal { // multilevel inheritance
    int legs;

}

class Dog extends Mammals{ // multilevel inheritance
    String breed;


}

