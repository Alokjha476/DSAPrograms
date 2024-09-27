package InnerClass;

/*Anonymous Inner Class:

An inner class without a name, typically used for implementing interfaces or
extending classes in a short form.
It is often used when you need a quick implementation of an interface or abstract class.*/

abstract class Animal {
    public abstract void sound();
}

public abstract class AnonymousClass {
    public static void main(String[] args) {
        Animal animal = new Animal() {
            @Override
            public void sound() {
                System.out.println("Sound Hard");
            }
        };
        animal.sound();
    }
}