package InnerClass;
/*1. Non-static Nested Class (Inner Class)

A class defined inside another class but outside any method, without the static keyword.
It can access all members of the outer class, including private ones.
You must instantiate the outer class to create an instance of the inner class.*/

public class NonStaticClass {

    private final String msg = "It is the outer class variable : ";

    class InnerClass {

        public void run() {
            System.out.println(msg);
        }

    }

    public static void main(String[] args) {
        NonStaticClass nonStaticClass = new NonStaticClass();
        NonStaticClass.InnerClass innerClass = nonStaticClass.new InnerClass();
        innerClass.run();
    }
}
