package Alpha4Batch.OOPS;

//In this example, the Drawable interface has only one method.
// Its implementation is provided by Rectangle and Circle classes.
// In a real scenario, an interface is defined by someone else,
// but its implementation is provided by different implementation providers. Moreover,
// it is used by someone else. The implementation part is hidden by the user who uses the interface.
public class MultipleInheritance {
    public static void main(String[] args) {
        Drawable d = new Circle();//In real scenario, object is provided by method e.g. getDrawing()
        d.draw();
        Drawable d1 = new Rectangle();
        d1.draw();
        Rectangle r = new Rectangle();
        r.draw();
        // multiple inheritance is not supported in the case of class because of ambiguity.
        // However, it is supported in case of an interface because there is no ambiguity.
        Test t = new Test();
        t.print();

    }
}

interface Drawable { // hide the implementation
    void draw();
}

class Rectangle implements Drawable {
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing Circle");
    }
}


// multiple inheritance
interface Printable {
    void print();

}

interface Showable {
    void print();
}

class Test implements Printable, Showable {
    public void print() {
        System.out.println("Hello Kumar");
    }
}
