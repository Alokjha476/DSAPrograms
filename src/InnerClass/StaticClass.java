package InnerClass;

/*
2. Static Nested Class
A nested class marked with the static keyword.
It cannot access non-static members of the outer class directly.
You can create an instance of a static nested class without creating an instance of the outer class.
*/
public class StaticClass {
    private static final int a = 5;

    public static class StaticInnerClass {
        public void run() {
            System.out.println(a * a);
        }
    }

    public static void main(String[] args) {
        StaticClass.StaticInnerClass innerClass = new StaticClass.StaticInnerClass();
        innerClass.run();
    }

}
