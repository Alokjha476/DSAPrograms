package functional_Interface.Throw_Throws_Keywords;

public class Throw_ThrowsKeyword {
    public static void method() throws ArithmeticException {
        System.out.println("inside the method");
        throw new ArithmeticException("throwing ArithmeticException");

    }

    public static void main(String[] args) {
        try {
            method();
        }catch (Exception e){
            System.out.println("caught in main method()");
        }

    }
}
