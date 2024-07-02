package Coding_Question;

public class MyInterfaceImpl implements FunctionalInterface {
    public static void main(String[] args) {
//        FunctionalInterface functionalInterface = new MyInterfaceImpl();
//        functionalInterface.sayHello();

        FunctionalInterface functionalInterface = () ->{
            System.out.println("huigiuh");
        };
        functionalInterface.sayHello();



        FunctionalInterface f = new FunctionalInterface() {
            @Override
            public void sayHello() {
                System.out.println(" 1st anonymous class");
            }
        };
        f.sayHello();

        FunctionalInterface f1 = new FunctionalInterface() {
            @Override
            public void sayHello() {
                System.out.println("3rd ");

            }
        };
        f1.sayHello();
    }



    @Override
    public void sayHello() {

    }
}
