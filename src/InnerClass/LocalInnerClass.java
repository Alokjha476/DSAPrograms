package InnerClass;
/*Local Inner Class:
Defined within a method or block, and its scope is limited to that method or block.
It can access local variables of the method if they are declared final or
effectively final (unchanged after initialization).*/

public class LocalInnerClass {
    public void display(){
        class InnerClass{
            public void show(){
                System.out.println("It is inner class method:");
            }
        }
        InnerClass innerClass = new InnerClass();
        innerClass.show();
    }
    public static void main(String[] args) {
        LocalInnerClass outerClass = new LocalInnerClass();
        outerClass.display();

    }
}
