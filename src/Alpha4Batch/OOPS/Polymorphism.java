package Alpha4Batch.OOPS;
// method overriding & Run time overriding
// covariant return type
public class Polymorphism {
    public static void main(String[] args) {
        A a = new A();
        a.sum();
        B b = new B();
        b.sum();
        // overloading
        C c = new C();
        System.out.println(c.sum(2,4));
        System.out.println(c.sum( 3.0f, 5.0f));
        System.out.println(c.sum(3,4,3));

    }
}
class A {
    A sum() {
        System.out.println("Hello");
        return new A();
    }
}
class B extends A {
    B sum() {
        System.out.println("I m alok");
        return new B();
    }
}
// function overloading & compile time
class C {
    int sum (int a ,int b ){
        return a+b;
    }
    float sum(float a , float b ){
        return a+b;
    }
    int sum(int a, int b ,int c){
        return a+b+c;
    }
}
